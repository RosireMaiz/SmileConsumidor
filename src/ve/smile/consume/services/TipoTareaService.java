package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoTarea;
import ve.smile.payload.request.PayloadTipoTareaRequest;
import ve.smile.payload.response.PayloadTipoTareaResponse;

@Consume("TipoTareaService")
public class TipoTareaService extends IService<PayloadTipoTareaResponse, PayloadTipoTareaRequest, TipoTarea> {

}
