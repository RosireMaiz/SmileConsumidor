package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ContactoPortal;
import ve.smile.payload.request.PayloadContactoPortalRequest;
import ve.smile.payload.response.PayloadContactoPortalResponse;

@Consume("ContactoPortalService")
public class ContactoPortalService
		extends
		IService<PayloadContactoPortalResponse, PayloadContactoPortalRequest, ContactoPortal> {

	public PayloadContactoPortalResponse incluirContactoPortal(
			ContactoPortal contactoPortal) {
		return doPost(getUrlService("/incluirContactoPortal"), contactoPortal);
	}

}
