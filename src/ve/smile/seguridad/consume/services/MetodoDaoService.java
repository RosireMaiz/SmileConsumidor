package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.MetodoDao;
import ve.smile.seguridad.payload.request.PayloadMetodoDaoRequest;
import ve.smile.seguridad.payload.response.PayloadMetodoDaoResponse;

@Consume("MetodoDaoService")
public class MetodoDaoService extends IService<PayloadMetodoDaoResponse, PayloadMetodoDaoRequest, MetodoDao> {

}
