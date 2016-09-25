package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Tarea;
import ve.smile.payload.request.PayloadTareaRequest;
import ve.smile.payload.response.PayloadTareaResponse;

@Consume("TareaService")
public class TareaService extends
		IService<PayloadTareaResponse, PayloadTareaRequest, Tarea> {

	public PayloadTareaResponse consultarPorEvento(Integer idEvento) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorEvento").append("/").append(getIdSesion())
				.append("/").append(getAccessToken()).append("/")
				.append(idEvento).toString()));
	};

}
