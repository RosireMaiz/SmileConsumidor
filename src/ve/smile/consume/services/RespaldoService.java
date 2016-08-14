package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Respaldo;
import ve.smile.payload.request.PayloadRespaldoRequest;
import ve.smile.payload.response.PayloadRespaldoResponse;

@Consume("RespaldoService")
public class RespaldoService extends IService<PayloadRespaldoResponse, PayloadRespaldoRequest, Respaldo> {

}
