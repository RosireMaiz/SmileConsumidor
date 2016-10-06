package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ClasificadorVoluntario;
import ve.smile.payload.request.PayloadClasificadorVoluntarioRequest;
import ve.smile.payload.response.PayloadClasificadorVoluntarioResponse;

@Consume("ClasificadorVoluntarioService")
public class ClasificadorVoluntarioService extends IService<PayloadClasificadorVoluntarioResponse, PayloadClasificadorVoluntarioRequest, ClasificadorVoluntario>
{
	// VOLUNTARIO
	public PayloadClasificadorVoluntarioResponse consultarPorVoluntario(Integer idVoluntario)
	{
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorVoluntario").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idVoluntario).toString()));
	};

	public PayloadClasificadorVoluntarioResponse consultarPorVoluntarioSinSession(Integer idVoluntario)
	{
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorVoluntario").append("/")
				.append(idVoluntario).toString()));
	};
}
