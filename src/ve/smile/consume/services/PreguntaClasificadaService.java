package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PreguntaClasificada;
import ve.smile.payload.request.PayloadPreguntaClasificadaRequest;
import ve.smile.payload.response.PayloadPreguntaClasificadaResponse;

@Consume("PreguntaClasificadaService")
public class PreguntaClasificadaService extends IService<PayloadPreguntaClasificadaResponse, PayloadPreguntaClasificadaRequest, PreguntaClasificada> {

}
