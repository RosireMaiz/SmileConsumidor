package ve.smile.seguridad.consume.services;

import java.util.HashMap;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Operacion;
import ve.smile.seguridad.payload.request.PayloadOperacionRequest;
import ve.smile.seguridad.payload.response.PayloadOperacionResponse;

@Consume("OperacionService")
public class OperacionService extends IService<PayloadOperacionResponse, PayloadOperacionRequest, Operacion> {
	
	public PayloadOperacionResponse consultarByNodoMenuAndRoles(Integer idNodoMenu, String idRoles) {
		return doGet(getUrlService("consultarByNodoMenuAndRoles") + "/" 
				+ getIdSesion() + "/" + getAccessToken() + "/" + idNodoMenu + "/" + idRoles);
	}
	
	public PayloadOperacionResponse consultarByVista(Integer idVista) {
		return doGet(getUrlService("consultarByVista") + "/" 
				+ getIdSesion() + "/" + getAccessToken() + "/" + idVista);
	}
	
	public PayloadOperacionResponse consultarBotonesComunes() {
		return doGet(getUrlService("consultarBotonesComunes") + "/" 
				+ getIdSesion() + "/" + getAccessToken());
	}
	
	public PayloadOperacionResponse modificarBotonesComunes(Operacion operacion) {
		return doPost(getUrlService("/updateCommonButtons"), operacion, new HashMap<String, Object>());
	}
}
