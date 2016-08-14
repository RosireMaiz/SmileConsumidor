package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EventPlanPersona;
import ve.smile.payload.request.PayloadEventPlanPersonaRequest;
import ve.smile.payload.response.PayloadEventPlanPersonaResponse;

@Consume("EventPlanPersonaService")
public class EventPlanPersonaService extends IService<PayloadEventPlanPersonaResponse, PayloadEventPlanPersonaRequest, EventPlanPersona> {

}
