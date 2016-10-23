package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Padrino;
import ve.smile.payload.request.PayloadPadrinoRequest;
import ve.smile.payload.response.PayloadPadrinoResponse;

@Consume("PadrinoService")
public class PadrinoService extends
		IService<PayloadPadrinoResponse, PayloadPadrinoRequest, Padrino> {

	public PayloadPadrinoResponse incluirPostuladoPadrino(Padrino padrino) {
		return doPost(getUrlService("/incluirPostulacionPadrino"), padrino);
	}

	public PayloadPadrinoResponse consultaPadrinoParametrizado(String sql) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultaPadrinoParametrizado").append("/").append(sql)
				.toString()));
	}

}
