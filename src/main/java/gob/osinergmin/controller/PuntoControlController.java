package gob.osinergmin.controller;

import gob.osinergmin.common.domain.ConsultaGPS;
import gob.osinergmin.common.domain.DetalleGuiaFiscalizacion;
import gob.osinergmin.common.domain.OrdenPedido;
import gob.osinergmin.common.domain.Producto;
import gob.osinergmin.common.domain.UnidadOperativa;
import gob.osinergmin.common.domain.Usuario;
import gob.osinergmin.util.PuntoControlConstants;
import gob.osinergmin.util.PuntoControlDummy;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PuntoControlController {

	private static final Logger log = LoggerFactory.getLogger(PuntoControlController.class);

	@RequestMapping(value = PuntoControlConstants.REST_URL_LOGIN, method = RequestMethod.GET)
    public @ResponseBody Usuario findUsuario(@PathVariable("userid") String userId) {
		log.info("PuntoControlController::findUsuario::BEGIN");
		Usuario usuario = new Usuario();
		// FIXME falta obtener la información del usuario
		for(Usuario _usuario : PuntoControlDummy.listUsuario){
			if(StringUtils.equalsIgnoreCase(_usuario.getUsername(), userId)){
				usuario = _usuario;
				break;
			}
		}
		log.info("PuntoControlController::findUsuario::END");
        return usuario;
    }

	@RequestMapping(value = PuntoControlConstants.REST_URL_LOAD_PRODUCT, method = RequestMethod.GET)
	public @ResponseBody List<Producto> getListProductos(){
		log.info("PuntoControlController::getListProductos::BEGIN");
		// FIXME falta logica de lista de productos
		log.info("PuntoControlController::getListProductos::END");
		return PuntoControlDummy.listProducto;
	}

	@RequestMapping(value = PuntoControlConstants.REST_URL_FIND_PLACA, method = RequestMethod.GET)
	public @ResponseBody UnidadOperativa findUnidadOperativaPlaca(@PathVariable("placa") String placa){
		log.info("PuntoControlController::findUnidadOperativaPlaca::BEGIN");
		UnidadOperativa unidadOperativa = new UnidadOperativa();
		for(UnidadOperativa _unidadOperativa : getListUnidadOperativa()){
			if(StringUtils.equalsIgnoreCase(_unidadOperativa.getPlaca(), placa)){
				unidadOperativa = _unidadOperativa;
				break;
			}
		}
		log.info("PuntoControlController::findUnidadOperativaPlaca::END");
        return unidadOperativa;
	}
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_LOAD_UNIDAD_OPERATIVA, method = RequestMethod.GET)
	public @ResponseBody List<UnidadOperativa> getListUnidadOperativa(){
		log.info("PuntoControlController::getListUnidadOperativa::BEGIN");
		// FIXME falta obtener la información de la unidad operativa
		/**
SELECT DISTINCT DGH.CDGO_DGH AS registroHidrocarburos, 
UO.RUC AS ruc, 
UO.NMBRE_UNDAD AS razonSocial, 
UO.DIRECCION AS direccion, 
(SELECT NOMBRE FROM LUGARES WHERE IDLUGAR = (SELECT LUGAR_SUP FROM LUGARES WHERE IDLUGAR = (SELECT LUGAR_SUP FROM LUGARES WHERE IDLUGAR = UO.UBIGEO_ID)))  AS departamento,
(SELECT NOMBRE FROM LUGARES WHERE IDLUGAR = (SELECT LUGAR_SUP FROM LUGARES WHERE IDLUGAR = UO.UBIGEO_ID))  AS provincia,
(SELECT NOMBRE FROM LUGARES WHERE IDLUGAR = UO.UBIGEO_ID)  AS distrito,
CASE
    WHEN PLACA_TRACTO IS NULL THEN 'CAMION CISTERNA' 
    WHEN PLACA = PLACA_TRACTO THEN 'CAMION CISTERNA'
    WHEN PLACA_TRACTO = '-' THEN 'CAMION CISTERNA'
ELSE
    'CAMION TANQUE'
END AS tipo,
UO.PLACA AS placa,
UO.CPCDAD_TTAL AS capacidad
FROM SFH_UNDDES_OPRTVAS UO 
INNER JOIN SFH_UNDDES_ACTVDDES UA ON (UO.ID = UA.UNIOPE_ID AND UA.ESTADO = 'HA') 
INNER JOIN SFH_CDGOS_DGH DGH ON (UA.ID = DGH.UNIACT_ID AND DGH.ESTADO = 'RV')
INNER JOIN ORDE_PEDI_OPE OPE ON (OPE.UNIOPE_ID = UO.ID AND OPE.ACTIVI_ID = UA.ACTIVI_ID and OPE.SOP_ESTSOP IN ('04','05'))
WHERE PLACA IS NOT NULL
AND PLACA != '.'
		 **/
		log.info("PuntoControlController::getListUnidadOperativa::END");
        return PuntoControlDummy.listUnidadOperativa;
	}

	@RequestMapping(value = PuntoControlConstants.REST_URL_FIND_ORDEN_PLACA, method = RequestMethod.GET)
	public @ResponseBody OrdenPedido getOrdenPedido(@PathVariable("placa") String placa){
		log.info("PuntoControlController::getOrdenPedido::BEGIN");
		OrdenPedido ordenPedido = new OrdenPedido();
		for(OrdenPedido _ordenPedido : getListOrdenPedido()){
			if(StringUtils.equalsIgnoreCase(_ordenPedido.getPlaca(), placa)){
				ordenPedido = _ordenPedido;
				break;
			}
		}
		log.info("PuntoControlController::getOrdenPedido::END");
        return ordenPedido;
	}
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_LIST_ORDEN, method = RequestMethod.GET)
	public @ResponseBody List<OrdenPedido> getListOrdenPedido(){
		log.info("PuntoControlController::getListOrdenPedido::BEGIN");
		// FIXME falta obtener la información de la orden de pedido
/**
SELECT 
UO.ID AS codigo, 
UO.PLACA AS placa,
OPE.OPE_CODAUT AS codigoAutorizacion,
OPE.OPE_NUMFACT AS numeroFactura,
OPE.OPE_GUIAREM AS guiaRemision,
OPE.SOP_ESTSOP AS estado,
OPE.FCHA_VNTA AS fechaVenta,
OPE.FCHA_DSPCHO AS fechaDespacho,
OPE.FCHA_RCPCION AS fechaRecepcion,
OPE.FCHA_CRRE AS fechaCierre
FROM SFH_UNDDES_OPRTVAS UO 
INNER JOIN SFH_UNDDES_ACTVDDES UA ON (UO.ID = UA.UNIOPE_ID AND UA.ESTADO = 'HA') 
INNER JOIN SFH_CDGOS_DGH DGH ON (UA.ID = DGH.UNIACT_ID AND DGH.ESTADO = 'RV')
INNER JOIN ORDE_PEDI_OPE OPE ON (OPE.UNIOPE_ID = UO.ID AND OPE.ACTIVI_ID = UA.ACTIVI_ID and OPE.SOP_ESTSOP IN ('04','05'))
WHERE PLACA IS NOT NULL
AND PLACA != '.'
AND OPE.FCHA_VNTA IS NOT NULL
AND OPE.FCHA_DSPCHO IS NOT NULL
AND OPE.FCHA_CRRE IS NULL
**/
		log.info("PuntoControlController::getListOrdenPedido::END");
        return PuntoControlDummy.listOrdenPedido;
	}
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_FIND_GUIA_SEGURIDAD, method = RequestMethod.GET)
	public @ResponseBody List<DetalleGuiaFiscalizacion> getListDetalleGuiaFiscalizacion(){
		log.info("PuntoControlController::getListDetalleGuiaFiscalizacion::BEGIN");
		// FIXME falta logica de lista de detalle de guia fiscalizacion
/**
SELECT OBS.ID AS id,
OBS.CODIGO AS codigo,
GUIA.ID AS guia,
OBS.BSE_LGAL_DSCRPCION AS descripcion,
CASE 
    WHEN OBS.BSE_LEGAL_DSCRPCION IS NULL THEN OBS.BSE_LGAL_NMRO 
    ELSE TO_CHAR(OBS.BSE_LEGAL_DSCRPCION)
END
AS baseLegal
FROM SFH_GUIAS_FSCLZCION GUIA
INNER JOIN SFH_OBSRVCNES_ACTVDDES  OBAC 
ON (GUIA.ID = OBAC.GUIFIS_ID AND OBAC.ACTIVO = 'SI')
INNER JOIN SFH_OBSRVCNES OBS
ON (OBAC.OBSERV_ID = OBS.ID AND OBS.ACTVO = 'SI')
WHERE GUIA.ID = 555 
ORDER BY TO_NUMBER(OBAC.NMRO_ORDEN)
**/
		log.info("PuntoControlController::getListDetalleGuiaFiscalizacion::END");
		return PuntoControlDummy.listDetalleGuiaFiscalizacion;
	}

	@RequestMapping(value = PuntoControlConstants.REST_URL_GET_GPS, method = RequestMethod.GET)
	public @ResponseBody ConsultaGPS getGPSLocation(@PathVariable("placa") String placa){
		log.info("PuntoControlController::getGPSLocation::BEGIN");
		ConsultaGPS consultaGPS = new ConsultaGPS();
		// FIXME falta obtener la información del punto GPS
		int index = ThreadLocalRandom.current().nextInt(PuntoControlDummy.listConsultaGPS.size());
		consultaGPS = PuntoControlDummy.listConsultaGPS.get(index);

		log.info("PuntoControlController::getGPSLocation::END");
        return consultaGPS;
	}

	// Services to save Data
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_SAVE_SUPERVISION_SCOP, method = RequestMethod.POST)
	public @ResponseBody String saveSupervisionSCOP(@RequestBody String info){
		return null;
	}
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_SAVE_SUPERVISION_SCOP_LIST, method = RequestMethod.POST)
	public @ResponseBody String saveSupervisionSCOPList(@RequestBody String info){
		return null;
	}
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_SAVE_SUPERVISION_SEGURIDAD, method = RequestMethod.POST)
	public @ResponseBody String saveSupervisionSeguridad(@RequestBody String info){
		return null;
	}
	
	@RequestMapping(value = PuntoControlConstants.REST_URL_SAVE_SUPERVISION_SEGURIDAD_LIST, method = RequestMethod.POST)
	public @ResponseBody String saveSupervisionSeguridadList(@RequestBody String info){
		return null;
	}
}