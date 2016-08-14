package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Colaborador;
import ve.smile.payload.request.PayloadColaboradorRequest;
import ve.smile.payload.response.PayloadColaboradorResponse;

@Consume("ColaboradorService")
public class ColaboradorService extends IService<PayloadColaboradorResponse, PayloadColaboradorRequest, Colaborador> {

}
