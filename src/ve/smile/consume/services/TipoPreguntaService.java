package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoPregunta;
import ve.smile.payload.request.PayloadTipoPreguntaRequest;
import ve.smile.payload.response.PayloadTipoPreguntaResponse;

@Consume("TipoPreguntaService")
public class TipoPreguntaService extends IService<PayloadTipoPreguntaResponse, PayloadTipoPreguntaRequest, TipoPregunta> {

}
