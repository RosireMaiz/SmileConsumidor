package ve.smile.seguridad.consume.services;
import java.util.HashMap;
import java.util.List;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Tabla;
import ve.smile.seguridad.payload.request.PayloadTablaRequest;
import ve.smile.seguridad.payload.response.PayloadTablaResponse;

@Consume("TablaService")
public class TablaService extends IService<PayloadTablaResponse, PayloadTablaRequest, Tabla> {
	public PayloadTablaResponse respaldarTablas(List<Tabla> listTablas, HashMap<String, Object> parametros) {
		return doPost(getUrlService("respaldarTablas"), listTablas,parametros);
	}
	
	public PayloadTablaResponse consultarPorRespaldo(Integer idRespaldo) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorRespaldo").append("/").append(getIdSesion())
				.append("/").append(getAccessToken()).append("/")
				.append(idRespaldo).toString()));
	};
	
}
