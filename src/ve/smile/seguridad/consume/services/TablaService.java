package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Tabla;
import ve.smile.seguridad.payload.request.PayloadTablaRequest;
import ve.smile.seguridad.payload.response.PayloadTablaResponse;

@Consume("TablaService")
public class TablaService extends IService<PayloadTablaResponse, PayloadTablaRequest, Tabla> {

}
