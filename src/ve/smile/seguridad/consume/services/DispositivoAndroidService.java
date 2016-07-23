package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.DispositivoAndroid;
import ve.smile.seguridad.payload.request.PayloadDispositivoAndroidRequest;
import ve.smile.seguridad.payload.response.PayloadDispositivoAndroidResponse;

@Consume("DispositivoAndroidService")
public class DispositivoAndroidService extends IService<PayloadDispositivoAndroidResponse, PayloadDispositivoAndroidRequest, DispositivoAndroid> {

}
