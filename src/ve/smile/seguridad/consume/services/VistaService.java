package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Vista;
import ve.smile.seguridad.payload.request.PayloadVistaRequest;
import ve.smile.seguridad.payload.response.PayloadVistaResponse;

@Consume("VistaService")
public class VistaService extends IService<PayloadVistaResponse, PayloadVistaRequest, Vista> {

	public PayloadVistaResponse consultarTodosConBotonesCustom() {
		return doGet(getUrlService("/find/allWithCustomButtons") + "/" + 
				getIdSesion() + "/" + getAccessToken());
	}
}
