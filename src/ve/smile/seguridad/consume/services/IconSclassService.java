package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.IconSclass;
import ve.smile.seguridad.payload.request.PayloadIconSclassRequest;
import ve.smile.seguridad.payload.response.PayloadIconSclassResponse;

@Consume("IconSclassService")
public class IconSclassService extends IService<PayloadIconSclassResponse, PayloadIconSclassRequest, IconSclass> {

}
