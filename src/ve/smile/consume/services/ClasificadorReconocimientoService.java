package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorReconocimiento;
import ve.smile.payload.request.PayloadClasificadorReconocimientoRequest;
import ve.smile.payload.response.PayloadClasificadorReconocimientoResponse;

@Consume("ClasificadorReconocimientoService")
public class ClasificadorReconocimientoService extends IService<PayloadClasificadorReconocimientoResponse, PayloadClasificadorReconocimientoRequest, ClasificadorReconocimiento> {

}
