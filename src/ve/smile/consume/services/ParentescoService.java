package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Parentesco;
import ve.smile.payload.request.PayloadParentescoRequest;
import ve.smile.payload.response.PayloadParentescoResponse;

@Consume("ParentescoService")
public class ParentescoService extends IService<PayloadParentescoResponse, PayloadParentescoRequest, Parentesco> {

}
