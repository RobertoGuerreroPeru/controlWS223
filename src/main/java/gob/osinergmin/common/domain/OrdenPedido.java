package gob.osinergmin.common.domain;

import java.io.Serializable;
import java.util.Date;

public class OrdenPedido implements Serializable {

	private static final long serialVersionUID = 7035111301604206128L;

	private Long codigo;
	private String placa;
	private String codigoAutorizacion;
	private String numeroFactura;
	private String numeroGuiaRemision;
	private String estado;
	private Date fechaVenta;
	private Date fechaDespacho;

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCodigoAutorizacion() {
		return codigoAutorizacion;
	}
	public void setCodigoAutorizacion(String codigoAutorizacion) {
		this.codigoAutorizacion = codigoAutorizacion;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getNumeroGuiaRemision() {
		return numeroGuiaRemision;
	}
	public void setNumeroGuiaRemision(String numeroGuiaRemision) {
		this.numeroGuiaRemision = numeroGuiaRemision;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Date getFechaDespacho() {
		return fechaDespacho;
	}
	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

}