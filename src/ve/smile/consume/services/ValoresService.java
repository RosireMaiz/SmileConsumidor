package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Valores;
import ve.smile.payload.request.PayloadValoresRequest;
import ve.smile.payload.response.PayloadValoresResponse;

@Consume("ValoresService")
public class ValoresService extends IService<PayloadValoresResponse, PayloadValoresRequest, Valores> {
	
	public PayloadValoresResponse consultarAllValores() {
		return doGet(getUrlService("consultarAllValores"));
	}
}
