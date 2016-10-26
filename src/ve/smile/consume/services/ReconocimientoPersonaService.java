package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ReconocimientoPersona;
import ve.smile.payload.request.PayloadReconocimientoPersonaRequest;
import ve.smile.payload.response.PayloadReconocimientoPersonaResponse;

@Consume("ReconocimientoPersonaService")
public class ReconocimientoPersonaService
		extends
		IService<PayloadReconocimientoPersonaResponse, PayloadReconocimientoPersonaRequest, ReconocimientoPersona> {
	public PayloadReconocimientoPersonaResponse consultaReconocimientoPersonasParametrizado(
			String sql) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultaReconocimientoPersonasParametrizado")
				.append("/").append(sql).toString()));
	};

}
