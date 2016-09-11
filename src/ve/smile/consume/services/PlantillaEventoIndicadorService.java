package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.PlantillaEventoIndicador;
import ve.smile.payload.request.PayloadPlantillaEventoIndicadorRequest;
import ve.smile.payload.response.PayloadPlantillaEventoIndicadorResponse;

@Consume("PlantillaEventoIndicadorService")
public class PlantillaEventoIndicadorService extends IService<PayloadPlantillaEventoIndicadorResponse, PayloadPlantillaEventoIndicadorRequest, PlantillaEventoIndicador> {

	public PayloadPlantillaEventoIndicadorResponse consultarPorEvento(Integer idEvento) {
		return doGet(getUrlService("consultarPorEvento")  + "/" + getIdSesion() + "/" + getAccessToken() + "/" + idEvento);
	};
}
