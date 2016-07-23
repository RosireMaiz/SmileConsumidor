package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Sclass;
import ve.smile.seguridad.payload.request.PayloadSclassRequest;
import ve.smile.seguridad.payload.response.PayloadSclassResponse;

@Consume("SclassService")
public class SclassService extends IService<PayloadSclassResponse, PayloadSclassRequest, Sclass> {

}
