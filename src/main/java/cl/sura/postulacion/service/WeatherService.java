package cl.sura.postulacion.service;

import cl.sura.postulacion.model.ResponseData;

public interface WeatherService {
	public ResponseData getWeatherCiudadChile(String ciudad) throws Exception;
}
