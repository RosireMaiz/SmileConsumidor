package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Persona;
import ve.smile.payload.request.PayloadPersonaRequest;
import ve.smile.payload.response.PayloadPersonaResponse;

@Consume("PersonaService")
public class PersonaService extends
		IService<PayloadPersonaResponse, PayloadPersonaRequest, Persona> {

	public PayloadPersonaResponse savePostuladoVoluntario(Persona persona) {
		return doPost(getUrlService("/incluirVoluntario"), persona);
	}

	public PayloadPersonaResponse savePostuladoPadrino(Persona persona) {
		return doPost(getUrlService("/incluirPadrino"), persona);
	}

	public PayloadPersonaResponse consultaPersonasSinUsuario() {
		return doGet(getUrlService(new StringBuilder().append(
				"/consultaPersonasSinUsuario").toString()));
	}

	public PayloadPersonaResponse consultarPersonaSinUsuariosPaginacion(
			Integer totalElementsByPage, Integer page, String orderBy) {
		return doGet(getUrlService("/find/pagination/sinUsuario")
				+ getPathToOrderBy(orderBy) + "/" + getIdSesion() + "/"
				+ getAccessToken() + "/" + totalElementsByPage + "/" + page);
	};
	
}
