package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.Album;
import ve.smile.payload.request.PayloadAlbumRequest;
import ve.smile.payload.response.PayloadAlbumResponse;

@Consume("AlbumService")
public class AlbumService extends IService<PayloadAlbumResponse, PayloadAlbumRequest, Album> {
	
	public PayloadAlbumResponse consultarAlbumCantidad(Integer cantidad, Integer estatusAlbum) {
		return doGet(getUrlService("consultarAlbumCantidad") + "/" + cantidad + "/" + estatusAlbum);
	}
}
