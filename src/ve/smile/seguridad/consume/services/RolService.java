package ve.smile.seguridad.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Rol;
import ve.smile.seguridad.payload.request.PayloadRolRequest;
import ve.smile.seguridad.payload.response.PayloadRolResponse;

@Consume("RolService")
public class RolService extends IService<PayloadRolResponse, PayloadRolRequest, Rol> {

//	public PayloadRolResponse consultarDeUnUsuario(Integer idSesion, Integer idUsuario) {
//		return doGet(getUrlService("consultarDeUnUsuario") + "/" + idSesion + "/" + getAccessToken() + "/" + idUsuario);
//	}
//	
	public PayloadRolResponse consultarDeUnNodoMenuEnPermiso(Integer idNodoMenu) {
		return doGet(getUrlService("consultarDeUnNodoMenuEnPermiso") + "/" + getIdSesion() + "/" + getAccessToken() + "/" + idNodoMenu);
	}
//	
//	public PayloadRolResponse incluirConUsuarios(Rol rol, String idUsuarios) {
//		HashMap<String, Object> parametros = new HashMap<String, Object>();
//		
//		parametros.put("idUsuarios", idUsuarios);
//		
//		return doPost(getUrlService("incluirConUsuarios"), rol, parametros);
//	}
//	
//	public PayloadRolResponse modificarConUsuarios(Rol rol, String idUsuarios) {
//		HashMap<String, Object> parametros = new HashMap<String, Object>();
//		
//		parametros.put("idUsuarios", idUsuarios);
//		
//		return doPost(getUrlService("modificarConUsuarios"), rol, parametros);
//	}
	
//	public PayloadRolResponse eliminarConUsuarios(Integer id) {
//		return doGet(getUrlService("eliminarConUsuarios") + "/" + getIdSesion() + "/" + getAccessToken() + "/" + id);
//	};
}
