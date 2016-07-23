package ve.smile.seguridad.consume.services;

import ve.smile.seguridad.dto.Auditoria;
import ve.smile.seguridad.payload.request.PayloadAuditoriaRequest;
import ve.smile.seguridad.payload.response.PayloadAuditoriaResponse;
import lights.core.annotations.Consume;
import lights.core.consume.services.IService;

@Consume("AuditoriaService")
public class AuditoriaService extends IService<PayloadAuditoriaResponse, PayloadAuditoriaRequest, Auditoria> {

}
