package es.curso.examen.modelo;

import org.springframework.beans.factory.annotation.Value;

public class Empleado {

	//@Value("1")
	private int codigo;
	//@Value("Ignacio")
	private String nombre;
	//@Value("Capgemini")
	private String empresa;
	//@Value("Desarrollador")
	private String perfil;
	
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Empleado(int codigo, String nombre, String empresa, String perfil) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.empresa = empresa;
		this.perfil = perfil;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", empresa=" + empresa + ", perfil=" + perfil
				+ "]";
	}
	
	
}
