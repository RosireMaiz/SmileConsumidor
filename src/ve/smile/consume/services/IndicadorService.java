package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Indicador;
import ve.smile.payload.request.PayloadIndicadorRequest;
import ve.smile.payload.response.PayloadIndicadorResponse;

@Consume("IndicadorService")
public class IndicadorService extends
		IService<PayloadIndicadorResponse, PayloadIndicadorRequest, Indicador> {

	public PayloadIndicadorResponse consultarPorEvento(Integer idEvento) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorEvento").append("/").append(getIdSesion())
				.append("/").append(getAccessToken()).append("/")
				.append(idEvento).toString()));
	};

	public PayloadIndicadorResponse consultarPorTrabajoSocial(
			Integer idTrabajoSocial) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorTrabajoSocial").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idTrabajoSocial).toString()));
	};
}
