package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.RequisitoParticipacion;
import ve.smile.payload.request.PayloadRequisitoParticipacionRequest;
import ve.smile.payload.response.PayloadRequisitoParticipacionResponse;

@Consume("RequisitoParticipacionService")
public class RequisitoParticipacionService extends IService<PayloadRequisitoParticipacionResponse, PayloadRequisitoParticipacionRequest, RequisitoParticipacion> {

	public PayloadRequisitoParticipacionResponse consultarPorParticipacion(Integer idParticipacion) {
		return doGet(getUrlService("consultarPorParticipacion")  + "/" + getIdSesion() + "/" + getAccessToken() + "/" + idParticipacion);
	};

	public PayloadRequisitoParticipacionResponse consultarAllRequisitos() {
		return doGet(getUrlService("consultarAllRequisitos")  );
};

}

