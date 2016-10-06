package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.ComentarioCartelera;
import ve.smile.payload.request.PayloadComentarioCarteleraRequest;
import ve.smile.payload.response.PayloadComentarioCarteleraResponse;

@Consume("ComentarioCarteleraService")
public class ComentarioCarteleraService
		extends
		IService<PayloadComentarioCarteleraResponse, PayloadComentarioCarteleraRequest, ComentarioCartelera> {


	public PayloadComentarioCarteleraResponse incluirComentarioCartelera(
			ComentarioCartelera comentarioCartelera) {
		return doPost(getUrlService("/incluirComentarioCartelera"),
				comentarioCartelera);
	}

}
