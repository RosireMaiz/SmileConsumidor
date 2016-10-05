package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorPregunta;
import ve.smile.payload.request.PayloadClasificadorPreguntaRequest;
import ve.smile.payload.response.PayloadClasificadorPreguntaResponse;

@Consume("ClasificadorPreguntaService")
public class ClasificadorPreguntaService extends IService<PayloadClasificadorPreguntaResponse, PayloadClasificadorPreguntaRequest, ClasificadorPregunta> {

	public PayloadClasificadorPreguntaResponse consultarClasificadorPregunta() {
		return doGet(getUrlService("consultarClasificadorPregunta"));
	}
}
