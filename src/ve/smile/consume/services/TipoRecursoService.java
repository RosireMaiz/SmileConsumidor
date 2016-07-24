package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoRecurso;
import ve.smile.payload.request.PayloadTipoRecursoRequest;
import ve.smile.payload.response.PayloadTipoRecursoResponse;

@Consume("TipoRecursoService")
public class TipoRecursoService extends IService<PayloadTipoRecursoResponse, PayloadTipoRecursoRequest, TipoRecurso> {

}
