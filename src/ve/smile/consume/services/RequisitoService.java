package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Requisito;
import ve.smile.payload.request.PayloadRequisitoRequest;
import ve.smile.payload.response.PayloadRequisitoParticipacionResponse;
import ve.smile.payload.response.PayloadRequisitoResponse;

@Consume("RequisitoService")
public class RequisitoService extends
		IService<PayloadRequisitoResponse, PayloadRequisitoRequest, Requisito> {
	
	public PayloadRequisitoResponse consultarPorParticipacion(
			Integer idParticipacion) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorParticipacion").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idParticipacion).toString()));
	};

	public PayloadRequisitoResponse consultarPorAyuda(Integer idAyuda) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorAyuda").append("/").append(getIdSesion())
				.append("/").append(getAccessToken()).append("/")
				.append(idAyuda).toString()));
	};
	
	public PayloadRequisitoResponse consultarParticipacionRequisitos(Integer idParticipacion) {
		return doGet(getUrlService("consultarParticipacionRequisitos") + "/" + idParticipacion );
	};
	
	public PayloadRequisitoResponse consultarAyudaRequisitos(Integer idAyuda) {
		return doGet(getUrlService("consultarAyudaRequisitos") + "/" + idAyuda );
	};
}
