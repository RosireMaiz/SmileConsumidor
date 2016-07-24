package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorSugerencia;
import ve.smile.payload.request.PayloadClasificadorSugerenciaRequest;
import ve.smile.payload.response.PayloadClasificadorSugerenciaResponse;

@Consume("ClasificadorSugerenciaService")
public class ClasificadorSugerenciaService extends IService<PayloadClasificadorSugerenciaResponse, PayloadClasificadorSugerenciaRequest, ClasificadorSugerencia> {

}
