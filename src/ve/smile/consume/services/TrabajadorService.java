package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Trabajador;
import ve.smile.payload.request.PayloadTrabajadorRequest;
import ve.smile.payload.response.PayloadTrabajadorResponse;

@Consume("TrabajadorService")
public class TrabajadorService
		extends
		IService<PayloadTrabajadorResponse, PayloadTrabajadorRequest, Trabajador> {
	
	public PayloadTrabajadorResponse consultaTrabajadoresParametrizado(
			String sql) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultaTrabajadoresParametrizado").append("/")
				.append(sql).toString()));
	};

}
