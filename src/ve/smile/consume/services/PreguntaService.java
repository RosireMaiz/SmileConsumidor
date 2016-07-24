package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Pregunta;
import ve.smile.payload.request.PayloadPreguntaRequest;
import ve.smile.payload.response.PayloadPreguntaResponse;

@Consume("PreguntaService")
public class PreguntaService extends IService<PayloadPreguntaResponse, PayloadPreguntaRequest, Pregunta> {

}
