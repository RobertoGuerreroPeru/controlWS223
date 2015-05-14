package gob.osinergmin.util;

public class PuntoControlConstants {

    public static final String REST_URL_LOGIN = "/rest/usuario/login/{userid}";
    public static final String REST_URL_LOAD_PRODUCT = "/rest/producto/get";
    public static final String REST_URL_FIND_PLACA = "/rest/unidadOperativa/findByPlaca/{placa}";
    public static final String REST_URL_LOAD_UNIDAD_OPERATIVA = "/rest/unidadOperativa/list";
    public static final String REST_URL_FIND_ORDEN_PLACA = "/rest/ordenPedido/findByPlaca/{placa}";
    public static final String REST_URL_LIST_ORDEN = "/rest/ordenPedido/list";
    public static final String REST_URL_FIND_GUIA_SEGURIDAD = "/rest/guiaSupervision/seguridad/get";
    public static final String REST_URL_GET_GPS = "/rest/gps/findPositionByPlaca/{placa}";
    // Services to save data
    public static final String REST_URL_SAVE_SUPERVISION_SCOP = "/rest/supervisionMovil/scop/save";
    public static final String REST_URL_SAVE_SUPERVISION_SCOP_LIST = "/rest/supervisionMovil/scop/saveList";
    public static final String REST_URL_SAVE_SUPERVISION_SEGURIDAD = "/rest/supervisionMovil/seguridad/save";
    public static final String REST_URL_SAVE_SUPERVISION_SEGURIDAD_LIST = "/rest/supervisionMovil/seguridad/saveList";
	
}