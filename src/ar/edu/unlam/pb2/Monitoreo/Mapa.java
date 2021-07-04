package ar.edu.unlam.pb2.Monitoreo;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
	
	private String nombre;
	private List<MedioTransporte>vehiculo;
	

	public Mapa(String nombre) {
		this.nombre=nombre;
		this.vehiculo=new ArrayList<MedioTransporte>();
	}
}
