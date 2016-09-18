package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PlantillaTrabajoSocialIndicador;
import ve.smile.payload.request.PayloadPlantillaTrabajoSocialIndicadorRequest;
import ve.smile.payload.response.PayloadPlantillaTrabajoSocialIndicadorResponse;

@Consume("PlantillaTrabajoSocialIndicadorService")
public class PlantillaTrabajoSocialIndicadorService extends IService<PayloadPlantillaTrabajoSocialIndicadorResponse, PayloadPlantillaTrabajoSocialIndicadorRequest, PlantillaTrabajoSocialIndicador> {

}
