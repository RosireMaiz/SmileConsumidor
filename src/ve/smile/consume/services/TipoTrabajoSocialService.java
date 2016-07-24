package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TipoTrabajoSocial;
import ve.smile.payload.request.PayloadTipoTrabajoSocialRequest;
import ve.smile.payload.response.PayloadTipoTrabajoSocialResponse;

@Consume("TipoTrabajoSocialService")
public class TipoTrabajoSocialService extends IService<PayloadTipoTrabajoSocialResponse, PayloadTipoTrabajoSocialRequest, TipoTrabajoSocial> {

}
