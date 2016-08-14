package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IndicadorTsPlan;
import ve.smile.payload.request.PayloadIndicadorTsPlanRequest;
import ve.smile.payload.response.PayloadIndicadorTsPlanResponse;

@Consume("IndicadorTsPlanService")
public class IndicadorTsPlanService extends IService<PayloadIndicadorTsPlanResponse, PayloadIndicadorTsPlanRequest, IndicadorTsPlan> {

}
