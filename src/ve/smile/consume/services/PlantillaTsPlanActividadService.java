package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PlantillaTsPlanActividad;
import ve.smile.payload.request.PayloadPlantillaTsPlanActividadRequest;
import ve.smile.payload.response.PayloadPlantillaTsPlanActividadResponse;

@Consume("PlantillaTsPlanActividadService")
public class PlantillaTsPlanActividadService extends IService<PayloadPlantillaTsPlanActividadResponse, PayloadPlantillaTsPlanActividadRequest, PlantillaTsPlanActividad> {

}
