package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.CarteleraEtiqueta;
import ve.smile.payload.request.PayloadCarteleraEtiquetaRequest;
import ve.smile.payload.response.PayloadCarteleraEtiquetaResponse;

@Consume("CarteleraEtiquetaService")
public class CarteleraEtiquetaService extends IService<PayloadCarteleraEtiquetaResponse, PayloadCarteleraEtiquetaRequest, CarteleraEtiqueta> {

}
