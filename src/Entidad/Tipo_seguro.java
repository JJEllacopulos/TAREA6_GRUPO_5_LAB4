package Entidad;

public class Tipo_seguro {
	
	private int id_tipo;
	private String descripcion;
	
	public Tipo_seguro(int id_tipo, String descripcion) {
		
		this.id_tipo = id_tipo;
		this.descripcion = descripcion;
	}
	
	public Tipo_seguro() {
		
	}

	public int getId() {
		return id_tipo;
	}

	public void setId(int id) {
		this.id_tipo = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
