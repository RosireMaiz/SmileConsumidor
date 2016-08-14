package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.VoluntarioClasificado;
import ve.smile.payload.request.PayloadVoluntarioClasificadoRequest;
import ve.smile.payload.response.PayloadVoluntarioClasificadoResponse;

@Consume("VoluntarioClasificadoService")
public class VoluntarioClasificadoService extends IService<PayloadVoluntarioClasificadoResponse, PayloadVoluntarioClasificadoRequest, VoluntarioClasificado> {

}
