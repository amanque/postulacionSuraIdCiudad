package cl.sura.postulacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.sura.postulacion.model.ResponseData;
import cl.sura.postulacion.service.WeatherService;

@CrossOrigin(origins = "${permiso.crossorigin.url}")
@RestController
@RequestMapping("/weather")

public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/{ciudad}")
	public ResponseData getWeatherChile(@PathVariable("ciudad") String ciudad) throws Exception{
		return weatherService.getWeatherCiudadChile(ciudad);
	}
}
