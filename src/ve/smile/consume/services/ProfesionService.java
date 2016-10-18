package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Profesion;
import ve.smile.payload.request.PayloadProfesionRequest;
import ve.smile.payload.response.PayloadProfesionResponse;

@Consume("ProfesionService")
public class ProfesionService extends
		IService<PayloadProfesionResponse, PayloadProfesionRequest, Profesion> {

	// VOLUNTARIO
	public PayloadProfesionResponse consultarPorVoluntario(Integer idVoluntario) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorVoluntario").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idVoluntario).toString()));
	};

	public PayloadProfesionResponse consultarPorVoluntarioSinSession(
			Integer idVoluntario) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorVoluntario").append("/")
				.append(idVoluntario).toString()));
	};

	// TRABAJADOR
	public PayloadProfesionResponse consultarPorTrabajador(Integer idTrabajador) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorTrabajador").append("/")
				.append(getIdSesion()).append("/").append(getAccessToken())
				.append("/").append(idTrabajador).toString()));
	};

	public PayloadProfesionResponse consultarPorTrabajadorSinSession(
			Integer idTrabajador) {
		return doGet(getUrlService(new StringBuilder()
				.append("consultarPorTrabajador").append("/")
				.append(idTrabajador).toString()));
	};
}
