package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Difusion;
import ve.smile.payload.request.PayloadDifusionRequest;
import ve.smile.payload.response.PayloadDifusionResponse;

@Consume("DifusionService")
public class DifusionService extends IService<PayloadDifusionResponse, PayloadDifusionRequest, Difusion> {

}
