package ve.smile.seguridad.consume.services;

import java.util.HashMap;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.seguridad.dto.Usuario;
import ve.smile.seguridad.payload.request.PayloadUsuarioRequest;
import ve.smile.seguridad.payload.response.PayloadUsuarioResponse;

@Consume("UsuarioService")
public class UsuarioService extends IService<PayloadUsuarioResponse, PayloadUsuarioRequest, Usuario> {

	public PayloadUsuarioResponse login(Usuario usuario, String ip) {
		HashMap<String, Object> parametros = new HashMap<String, Object>();
		
		parametros.put("ip", ip);
		
		return doPost(getUrlService("login"), usuario, true, parametros);
	}
	
	public PayloadUsuarioResponse consultarPorRol(Integer idRol) {
		return doGet(getUrlService("consultarPorRol")  + "/" + getIdSesion() + "/" + getAccessToken() + "/" + idRol);
	};
}
