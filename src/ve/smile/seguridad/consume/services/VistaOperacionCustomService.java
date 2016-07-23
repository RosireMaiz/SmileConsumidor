package ve.smile.seguridad.consume.services;

import java.util.HashMap;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.VistaOperacionCustom;
import ve.smile.seguridad.payload.request.PayloadVistaOperacionCustomRequest;
import ve.smile.seguridad.payload.response.PayloadVistaOperacionCustomResponse;

@Consume("VistaOperacionCustomService")
public class VistaOperacionCustomService extends IService<PayloadVistaOperacionCustomResponse, PayloadVistaOperacionCustomRequest, VistaOperacionCustom> {

	
	public PayloadVistaOperacionCustomResponse modificarSinId(
			VistaOperacionCustom vistaOperacionCustom) {
		return doPost(getUrlService("/updateWithoutId"), vistaOperacionCustom, new HashMap<String, Object>());
	}
}
