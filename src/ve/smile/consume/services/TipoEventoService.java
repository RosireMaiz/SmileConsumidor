package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoEvento;
import ve.smile.payload.request.PayloadTipoEventoRequest;
import ve.smile.payload.response.PayloadTipoEventoResponse;

@Consume("TipoEventoService")
public class TipoEventoService extends IService<PayloadTipoEventoResponse, PayloadTipoEventoRequest, TipoEvento> {

}
