package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PlantillaTsPlanIndicador;
import ve.smile.payload.request.PayloadPlantillaTsPlanIndicadorRequest;
import ve.smile.payload.response.PayloadPlantillaTsPlanIndicadorResponse;

@Consume("PlantillaTsPlanIndicadorService")
public class PlantillaTsPlanIndicadorService extends IService<PayloadPlantillaTsPlanIndicadorResponse, PayloadPlantillaTsPlanIndicadorRequest, PlantillaTsPlanIndicador> {

}
