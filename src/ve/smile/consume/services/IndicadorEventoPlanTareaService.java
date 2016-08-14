package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IndicadorEventoPlanTarea;
import ve.smile.payload.request.PayloadIndicadorEventoPlanTareaRequest;
import ve.smile.payload.response.PayloadIndicadorEventoPlanTareaResponse;

@Consume("IndicadorEventoPlanTareaService")
public class IndicadorEventoPlanTareaService extends IService<PayloadIndicadorEventoPlanTareaResponse, PayloadIndicadorEventoPlanTareaRequest, IndicadorEventoPlanTarea> {

}
