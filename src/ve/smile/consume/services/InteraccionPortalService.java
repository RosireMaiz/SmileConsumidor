package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.InteraccionPortal;
import ve.smile.payload.request.PayloadInteraccionPortalRequest;
import ve.smile.payload.response.PayloadInteraccionPortalResponse;

@Consume("InteraccionPortalService")
public class InteraccionPortalService extends IService<PayloadInteraccionPortalResponse, PayloadInteraccionPortalRequest, InteraccionPortal> {

}
