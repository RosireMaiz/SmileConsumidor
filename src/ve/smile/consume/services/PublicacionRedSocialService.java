package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PublicacionRedSocial;
import ve.smile.payload.request.PayloadPublicacionRedSocialRequest;
import ve.smile.payload.response.PayloadPublicacionRedSocialResponse;

@Consume("PublicacionRedSocialService")
public class PublicacionRedSocialService extends IService<PayloadPublicacionRedSocialResponse, PayloadPublicacionRedSocialRequest, PublicacionRedSocial> {

}
