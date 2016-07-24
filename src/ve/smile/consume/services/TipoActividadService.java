package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoActividad;
import ve.smile.payload.request.PayloadTipoActividadRequest;
import ve.smile.payload.response.PayloadTipoActividadResponse;

@Consume("TipoActividadService")
public class TipoActividadService extends IService<PayloadTipoActividadResponse, PayloadTipoActividadRequest, TipoActividad> {

}
