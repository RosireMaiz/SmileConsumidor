package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlanPersona;
import ve.smile.payload.request.PayloadTsPlanPersonaRequest;
import ve.smile.payload.response.PayloadTsPlanPersonaResponse;

@Consume("TsPlanPersonaService")
public class TsPlanPersonaService extends IService<PayloadTsPlanPersonaResponse, PayloadTsPlanPersonaRequest, TsPlanPersona> {

}
