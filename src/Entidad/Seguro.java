package Entidad;

public class Seguro {
	
	private int id_seguro;
	private String descripcion;
	private int id_tipo;
	private Double costo_contratacion;
	private Double costo_asegurado;
	
	public Seguro(int id_seguro, String descripcion, int id_tipo, Double costo_contratacion, Double costo_asegurado) {
		super();
		this.id_seguro = id_seguro;
		this.descripcion = descripcion;
		this.id_tipo = id_tipo;
		this.costo_contratacion = costo_contratacion;
		this.costo_asegurado = costo_asegurado;
	}

	public Seguro() {
		
	}

	public int getId_seguro() {
		return id_seguro;
	}

	public void setId_seguro(int id_seguro) {
		this.id_seguro = id_seguro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public Double getCosto_contratacion() {
		return costo_contratacion;
	}

	public void setCosto_contratacion(Double costo_contratacion) {
		this.costo_contratacion = costo_contratacion;
	}

	public Double getCosto_asegurado() {
		return costo_asegurado;
	}

	public void setCosto_asegurado(Double costo_asegurado) {
		this.costo_asegurado = costo_asegurado;
	}
	
}
