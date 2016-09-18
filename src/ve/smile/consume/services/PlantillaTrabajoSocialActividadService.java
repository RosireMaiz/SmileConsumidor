package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PlantillaTrabajoSocialActividad;
import ve.smile.payload.request.PayloadPlantillaTrabajoSocialActividadRequest;
import ve.smile.payload.response.PayloadPlantillaTrabajoSocialActividadResponse;

@Consume("PlantillaTrabajoSocialActividadService")
public class PlantillaTrabajoSocialActividadService extends IService<PayloadPlantillaTrabajoSocialActividadResponse, PayloadPlantillaTrabajoSocialActividadRequest, PlantillaTrabajoSocialActividad> {

}
