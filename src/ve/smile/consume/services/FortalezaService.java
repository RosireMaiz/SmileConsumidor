package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Fortaleza;
import ve.smile.payload.request.PayloadFortalezaRequest;
import ve.smile.payload.response.PayloadFortalezaResponse;

@Consume("FortalezaService")
public class FortalezaService extends IService<PayloadFortalezaResponse, PayloadFortalezaRequest, Fortaleza> {

		public PayloadFortalezaResponse consultarPorTrabajador(
			Integer idTrabajador) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorTrabajador").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idTrabajador).toString()));
	};

	public PayloadFortalezaResponse consultarPorTrabajadorSinSession(
			Integer idTrabajador) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorTrabajador").append("/")
				.append(idTrabajador).toString()));
	};
}
