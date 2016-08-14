package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IncidenciaTsPlan;
import ve.smile.payload.request.PayloadIncidenciaTsPlanRequest;
import ve.smile.payload.response.PayloadIncidenciaTsPlanResponse;

@Consume("IncidenciaTsPlanService")
public class IncidenciaTsPlanService extends IService<PayloadIncidenciaTsPlanResponse, PayloadIncidenciaTsPlanRequest, IncidenciaTsPlan> {

}
