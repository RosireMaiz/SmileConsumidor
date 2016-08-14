package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IndicadorTsPlanActividad;
import ve.smile.payload.request.PayloadIndicadorTsPlanActividadRequest;
import ve.smile.payload.response.PayloadIndicadorTsPlanActividadResponse;

@Consume("IndicadorTsPlanActividadService")
public class IndicadorTsPlanActividadService extends IService<PayloadIndicadorTsPlanActividadResponse, PayloadIndicadorTsPlanActividadRequest, IndicadorTsPlanActividad> {

}
