package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.PermisoSeguridad;
import ve.smile.seguridad.payload.request.PayloadPermisoSeguridadRequest;
import ve.smile.seguridad.payload.response.PayloadPermisoSeguridadResponse;

@Consume("PermisoSeguridadService")
public class PermisoSeguridadService extends IService<PayloadPermisoSeguridadResponse, PayloadPermisoSeguridadRequest, PermisoSeguridad> {

	public PayloadPermisoSeguridadResponse eliminarByRolAndNodoMenuAndOperacion(Integer idRol,
			Integer idNodoMenu, Integer operacion) {
		return doGet(getUrlService("deleteByRolAndNodoMenuAndOperacion") + "/" + getIdSesion() + "/" + 
			getAccessToken() + "/" + idRol + "/" + idNodoMenu + "/" + operacion);
	}
}
