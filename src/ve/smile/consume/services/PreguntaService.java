package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Pregunta;
import ve.smile.payload.request.PayloadPreguntaRequest;
import ve.smile.payload.response.PayloadPreguntaResponse;

@Consume("PreguntaService")
public class PreguntaService extends
		IService<PayloadPreguntaResponse, PayloadPreguntaRequest, Pregunta> {

	public PayloadPreguntaResponse consultarPorClasificadorPregunta(
			Integer idClasificadorPregunta) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorClasificadorPregunta").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idClasificadorPregunta).toString()));
	};

	public PayloadPreguntaResponse consultarPorClasificadorPreguntaSinSession(
			Integer idClasificadorPregunta) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorClasificadorPregunta").append("/")
				.append(idClasificadorPregunta).toString()));
	};
}
