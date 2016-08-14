package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.IndicadorEventoPlanificado;
import ve.smile.payload.request.PayloadIndicadorEventoPlanificadoRequest;
import ve.smile.payload.response.PayloadIndicadorEventoPlanificadoResponse;

@Consume("IndicadorEventoPlanificadoService")
public class IndicadorEventoPlanificadoService extends IService<PayloadIndicadorEventoPlanificadoResponse, PayloadIndicadorEventoPlanificadoRequest, IndicadorEventoPlanificado> {

}
