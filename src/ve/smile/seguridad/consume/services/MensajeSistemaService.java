package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.MensajeSistema;
import ve.smile.seguridad.payload.request.PayloadMensajeSistemaRequest;
import ve.smile.seguridad.payload.response.PayloadMensajeSistemaResponse;

@Consume("MensajeSistemaService")
public class MensajeSistemaService extends IService<PayloadMensajeSistemaResponse, PayloadMensajeSistemaRequest, MensajeSistema> {

}
