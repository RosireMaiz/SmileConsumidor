package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Cartelera;
import ve.smile.payload.request.PayloadCarteleraRequest;
import ve.smile.payload.response.PayloadCarteleraResponse;
import ve.smile.seguridad.payload.response.PayloadRolResponse;

@Consume("CarteleraService")
public class CarteleraService extends IService<PayloadCarteleraResponse, PayloadCarteleraRequest, Cartelera> {

	public PayloadCarteleraResponse consultarDeUnNodoMenuEnPermiso(Integer cantidad, Integer tipoCartelera) {
		return doGet(getUrlService("consultaCarteleraPorParametro") + "/" + cantidad + "/" + tipoCartelera);
	}
	
}
