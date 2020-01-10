package cl.sura.postulacion.model;

import java.util.List;

public class ResponseData {
	private City city;
	private int cod;
	private List<cl.sura.postulacion.model.List> list;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public List<cl.sura.postulacion.model.List> getList() {
		return list;
	}

	public void setList(List<cl.sura.postulacion.model.List> list) {
		this.list = list;
	}

}
