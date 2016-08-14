package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Cargo;
import ve.smile.payload.request.PayloadCargoRequest;
import ve.smile.payload.response.PayloadCargoResponse;

@Consume("CargoService")
public class CargoService extends IService<PayloadCargoResponse, PayloadCargoRequest, Cargo> {

}
