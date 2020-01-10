package cl.sura.postulacion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.sura.postulacion.config.Constants;
import cl.sura.postulacion.error.ServiceException;
import cl.sura.postulacion.model.ResponseData;
import cl.sura.postulacion.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Value("${api.key}")
	private String key;

	@Value("${api.url}")
	private String url;

	@Value("${api.days}")
	private int days;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseData getWeatherCiudadChile(String ciudad) throws Exception {
		ResponseData json = null;
		try {
			json = restTemplate.getForObject(
					this.url + ciudad + "&mode=json&units=metric&cnt=" + this.days + "&appid=" + this.key,
					ResponseData.class);
			if(json.getCod() != 200) 
				throw new ServiceException(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.value(), Constants.MSG_ERROR_1, 1);
			else if(!json.getCity().getCountry().equals("CL"))
				throw new ServiceException(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE.value(), Constants.MSG_ERROR_2, 2);
				
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		return json;
	}

}
