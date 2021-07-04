package ar.edu.unlam.pb2.Monitoreo;

public abstract class MedioTransporte {

	protected String patente;
	protected Integer cantidadMaximaDePasajeros;
	protected Integer velocidadMaxima;
	protected Coordenada posicionActual;
	
	public MedioTransporte(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, 
			Double latitud, Double longitud) {
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.posicionActual = new Coordenada(latitud, longitud);
	}


	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Coordenada getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(Coordenada posicionActual) {
		this.posicionActual = posicionActual;
	}
	
	public Double getLatitud() {
		return this.posicionActual.getLatitud();
	}
	
	public Double getLongitud() {
		return this.posicionActual.getLongitud();
	}
}