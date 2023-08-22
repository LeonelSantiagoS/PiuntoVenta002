package com.mx.proyecto.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MIS_EMPLEADOS", schema = "CURSOLEO")
public class Empleados2 {
	@Id
	@Column(name = "ID_EMPLEADO", unique = true, nullable = false, precision = 11)
	private Integer idEmpleado;

	@Column(name = "NOMBRE_COMPLETO")
	private String nombreCompleto;

	@Column(name = "RFC")
	private String rfc;

	@Column(name = "CURP")
	private String curp;

	@Column(name = "EDAD")
	private Integer edad;

	@Column(name = "SEXO")
	private String sexo;

	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "NSS")
	private Integer nss;

	@Column(name = "TELEFONO")
	private Integer telefono;

	@Column(name = "ACTIVO")
	private Integer activo;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNss() {
		return nss;
	}

	public void setNss(Integer nss) {
		this.nss = nss;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

}
