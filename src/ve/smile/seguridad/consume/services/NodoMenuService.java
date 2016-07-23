package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.NodoMenu;
import ve.smile.seguridad.payload.request.PayloadNodoMenuRequest;
import ve.smile.seguridad.payload.response.PayloadNodoMenuResponse;

@Consume("NodoMenuService")
public class NodoMenuService extends IService<PayloadNodoMenuResponse, PayloadNodoMenuRequest, NodoMenu> {

	public PayloadNodoMenuResponse consultarNodoMenuPorRoles(String idRoles) {
		return doGet(getUrlService("consultarNodoMenuPorRoles") + "/" + getIdSesion() + "/" + getAccessToken() + "/" + idRoles);
	}
	
	public PayloadNodoMenuResponse eliminarEnCascada(Integer id) {
		return doGet(getUrlService("eliminarEnCascada") + "/" + getIdSesion() + "/" + getAccessToken() + "/" + id);
	}
	
	public PayloadNodoMenuResponse consultarArbol(Integer idRol) {
		return doGet(getUrlService("consultarArbol") + "/" + getIdSesion() + "/" + getAccessToken() +
				"/" + idRol);
	}
	
	public PayloadNodoMenuResponse contarHijos(Integer idNodoMenuPadre) {
		return doGet(getUrlService("countChildrens") + "/" + getIdSesion() + "/" + getAccessToken() +
				"/" + idNodoMenuPadre);
	}
}