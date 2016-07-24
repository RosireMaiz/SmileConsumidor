package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoCapacitacion;
import ve.smile.payload.request.PayloadTipoCapacitacionRequest;
import ve.smile.payload.response.PayloadTipoCapacitacionResponse;

@Consume("TipoCapacitacionService")
public class TipoCapacitacionService extends IService<PayloadTipoCapacitacionResponse, PayloadTipoCapacitacionRequest, TipoCapacitacion> {

}
