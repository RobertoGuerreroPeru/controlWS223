package gob.osinergmin.util;

import gob.osinergmin.common.domain.ConsultaGPS;
import gob.osinergmin.common.domain.DetalleGuiaFiscalizacion;
import gob.osinergmin.common.domain.OrdenPedido;
import gob.osinergmin.common.domain.Producto;
import gob.osinergmin.common.domain.UnidadOperativa;
import gob.osinergmin.common.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

public class PuntoControlDummy {

	public static List<Usuario> listUsuario = new ArrayList<Usuario>();

	public static List<Producto> listProducto = new ArrayList<Producto>();

	public static List<UnidadOperativa> listUnidadOperativa = new ArrayList<UnidadOperativa>();

	public static List<OrdenPedido> listOrdenPedido = new ArrayList<OrdenPedido>();

	public static List<DetalleGuiaFiscalizacion> listDetalleGuiaFiscalizacion = new ArrayList<DetalleGuiaFiscalizacion>();

	public static List<ConsultaGPS> listConsultaGPS = new ArrayList<ConsultaGPS>();

	public static List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public static void setListUsuario(List<Usuario> listUsuario) {
		PuntoControlDummy.listUsuario = listUsuario;
	}

	public static List<Producto> getListProducto() {
		return listProducto;
	}

	public static void setListProducto(List<Producto> listProducto) {
		PuntoControlDummy.listProducto = listProducto;
	}

	public static List<UnidadOperativa> getListUnidadOperativa() {
		return listUnidadOperativa;
	}

	public static void setListUnidadOperativa(
			List<UnidadOperativa> listUnidadOperativa) {
		PuntoControlDummy.listUnidadOperativa = listUnidadOperativa;
	}

	public static List<OrdenPedido> getListOrdenPedido() {
		return listOrdenPedido;
	}

	public static void setListOrdenPedido(List<OrdenPedido> listOrdenPedido) {
		PuntoControlDummy.listOrdenPedido = listOrdenPedido;
	}

	public static List<DetalleGuiaFiscalizacion> getListDetalleGuiaFiscalizacion() {
		return listDetalleGuiaFiscalizacion;
	}

	public static void setListDetalleGuiaFiscalizacion(
			List<DetalleGuiaFiscalizacion> listDetalleGuiaFiscalizacion) {
		PuntoControlDummy.listDetalleGuiaFiscalizacion = listDetalleGuiaFiscalizacion;
	}

	public static List<ConsultaGPS> getListConsultaGPS() {
		return listConsultaGPS;
	}

	public static void setListConsultaGPS(List<ConsultaGPS> listConsultaGPS) {
		PuntoControlDummy.listConsultaGPS = listConsultaGPS;
	}

}