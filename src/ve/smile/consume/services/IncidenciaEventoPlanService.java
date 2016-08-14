package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IncidenciaEventoPlan;
import ve.smile.payload.request.PayloadIncidenciaEventoPlanRequest;
import ve.smile.payload.response.PayloadIncidenciaEventoPlanResponse;

@Consume("IncidenciaEventoPlanService")
public class IncidenciaEventoPlanService extends IService<PayloadIncidenciaEventoPlanResponse, PayloadIncidenciaEventoPlanRequest, IncidenciaEventoPlan> {

}
