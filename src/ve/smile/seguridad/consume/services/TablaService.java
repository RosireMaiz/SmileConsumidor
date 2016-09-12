package ve.smile.seguridad.consume.services;

import java.util.HashMap;
import java.util.List;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Tabla;
import ve.smile.seguridad.payload.request.PayloadTablaRequest;
import ve.smile.seguridad.payload.response.PayloadRolResponse;
import ve.smile.seguridad.payload.response.PayloadTablaResponse;

@Consume("TablaService")
public class TablaService extends IService<PayloadTablaResponse, PayloadTablaRequest, Tabla> {
	public PayloadTablaResponse respaldarTablas(List<Tabla> listTablas, Tabla tabla) {
		HashMap<String, Object> milista = new HashMap<String, Object>();
		milista.put("lista", listTablas);
		return doPost(getUrlService("respaldarTablas"), tabla,milista);
	}
	
}
