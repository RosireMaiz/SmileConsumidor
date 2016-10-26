package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.TsPlan;
import ve.smile.payload.request.PayloadTsPlanRequest;
import ve.smile.payload.response.PayloadTsPlanResponse;

@Consume("TsPlanService")
public class TsPlanService extends IService<PayloadTsPlanResponse, PayloadTsPlanRequest, TsPlan> {

	public PayloadTsPlanResponse consultaTSPlanificadoAlbum(Integer album) {
		return doGet(getUrlService("consultaTSPlanificadoAlbum") + "/" + album);
	}
	
	public PayloadTsPlanResponse consultaTrabajoSocialPlanificadosParametrizado(String sql)
	{
		return doGet(getUrlService(new StringBuilder().append("consultaTrabajoSocialPlanificadosParametrizado").append("/").append(sql).toString()));
	};
}
