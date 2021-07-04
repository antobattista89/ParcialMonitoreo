package ar.edu.unlam.pb2.Monitoreo;

public class Moto extends MedioTransporte{

	public static final Integer CAPACIDA_MAXIMA_DE_PASAJEROS=2;
	
	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(patente, CAPACIDA_MAXIMA_DE_PASAJEROS, velocidadMaxima, latitud, longitud);
	
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return this.CAPACIDA_MAXIMA_DE_PASAJEROS;
	}
	

}
