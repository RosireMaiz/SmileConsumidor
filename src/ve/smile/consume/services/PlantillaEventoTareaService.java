package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PlantillaEventoTarea;
import ve.smile.payload.request.PayloadPlantillaEventoTareaRequest;
import ve.smile.payload.response.PayloadPlantillaEventoTareaResponse;

@Consume("PlantillaEventoTareaService")
public class PlantillaEventoTareaService extends IService<PayloadPlantillaEventoTareaResponse, PayloadPlantillaEventoTareaRequest, PlantillaEventoTarea> {

}
