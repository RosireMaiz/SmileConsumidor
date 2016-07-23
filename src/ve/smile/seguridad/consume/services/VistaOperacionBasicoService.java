package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.VistaOperacionBasico;
import ve.smile.seguridad.payload.request.PayloadVistaOperacionBasicoRequest;
import ve.smile.seguridad.payload.response.PayloadVistaOperacionBasicoResponse;

@Consume("VistaOperacionBasicoService")
public class VistaOperacionBasicoService extends IService<PayloadVistaOperacionBasicoResponse, PayloadVistaOperacionBasicoRequest, VistaOperacionBasico> {

}
