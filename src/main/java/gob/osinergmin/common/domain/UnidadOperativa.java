package gob.osinergmin.common.domain;

import java.io.Serializable;

public class UnidadOperativa implements Serializable {

	private static final long serialVersionUID = 3969547478145437627L;

	
	private Long codigo;
	private String codigoOsinergmin;
	private String registroHidrocarburos;
	private String ruc;
	private String razonSocial;
	private String direccion;
	private String departamento;
	private String provincia;
	private String distrito;
	private String tipo;
	private String placa;
	private Long capacidad;

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getCodigoOsinergmin() {
		return codigoOsinergmin;
	}
	public void setCodigoOsinergmin(String codigoOsinergmin) {
		this.codigoOsinergmin = codigoOsinergmin;
	}
	public String getRegistroHidrocarburos() {
		return registroHidrocarburos;
	}
	public void setRegistroHidrocarburos(String registroHidrocarburos) {
		this.registroHidrocarburos = registroHidrocarburos;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Long getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}

}