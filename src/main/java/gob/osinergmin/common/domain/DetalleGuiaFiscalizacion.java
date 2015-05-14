package gob.osinergmin.common.domain;

import java.io.Serializable;

public class DetalleGuiaFiscalizacion implements Serializable {

	private static final long serialVersionUID = 3270286689158566702L;

	public Long codigo;
	public String codigoObservacion;
	public Long guia;
	public String descripcion;
	public String baseLegal;

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getCodigoObservacion() {
		return codigoObservacion;
	}
	public void setCodigoObservacion(String codigoObservacion) {
		this.codigoObservacion = codigoObservacion;
	}
	public Long getGuia() {
		return guia;
	}
	public void setGuia(Long guia) {
		this.guia = guia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getBaseLegal() {
		return baseLegal;
	}
	public void setBaseLegal(String baseLegal) {
		this.baseLegal = baseLegal;
	}


}