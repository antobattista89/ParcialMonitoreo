package ar.edu.unlam.pb2.Monitoreo;

public class Coordenada {
	
	private Double latitud;
	private Double longitud;

	public Coordenada(Double latitud, Double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

}
