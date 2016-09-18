package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.RespaldoTabla;
import ve.smile.payload.request.PayloadRespaldoTablaRequest;
import ve.smile.payload.response.PayloadRespaldoTablaResponse;

@Consume("RespaldoTablaService")
public class RespaldoTablaService extends IService<PayloadRespaldoTablaResponse, PayloadRespaldoTablaRequest, RespaldoTabla> {

}
