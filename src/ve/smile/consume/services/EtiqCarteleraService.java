package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EtiqCartelera;
import ve.smile.payload.request.PayloadEtiqCarteleraRequest;
import ve.smile.payload.response.PayloadEtiqCarteleraResponse;

@Consume("EtiqCarteleraService")
public class EtiqCarteleraService extends IService<PayloadEtiqCarteleraResponse, PayloadEtiqCarteleraRequest, EtiqCartelera> {

}
