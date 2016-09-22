package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Persona;
import ve.smile.payload.request.PayloadPersonaRequest;
import ve.smile.payload.response.PayloadPersonaResponse;

@Consume("PersonaService")
public class PersonaService extends IService<PayloadPersonaResponse, PayloadPersonaRequest, Persona> {
	
	public PayloadPersonaResponse savePostuladoVoluntario(Persona persona) {
		return doPost(getUrlService("/incluirVoluntario"), persona);
	}
	
	public PayloadPersonaResponse savePostuladoPadrino(Persona persona) {
		return doPost(getUrlService("/incluirPadrino"), persona);
	}

}
