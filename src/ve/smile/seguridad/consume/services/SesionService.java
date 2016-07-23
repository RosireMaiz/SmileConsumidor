package ve.smile.seguridad.consume.services;

import java.util.Map;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import lights.core.enums.TypeQuery;
import ve.smile.seguridad.dto.Sesion;
import ve.smile.seguridad.payload.request.PayloadSesionRequest;
import ve.smile.seguridad.payload.response.PayloadSesionResponse;

@Consume("SesionService")
public class SesionService extends IService<PayloadSesionResponse, PayloadSesionRequest, Sesion> {

	public PayloadSesionResponse cerrarSesionWeb(Integer idSesionWeb) {
		Sesion sesion = new Sesion(idSesionWeb);
		
		return doPost(getUrlService("cerrarSesionWeb"), sesion);
	}
	
	public PayloadSesionResponse consultarPaginacionCriteriosWithLastAuditoria(Integer totalElementsByPage, Integer page, TypeQuery typeQuery, Map<String, String> criterios) {
		String urlCriterios = "typeQueryToFind=" + typeQuery.name();

		for (String key : criterios.keySet()) {
			urlCriterios += ("&" + key + "=" + criterios.get(key));
		}

		return doGet(getUrlService("/find/paginationWithLastAuditoria") + "/" + getIdSesion() + "/" + getAccessToken() + "/" + totalElementsByPage + "/" + page + "?" + urlCriterios);
	}
	
}
