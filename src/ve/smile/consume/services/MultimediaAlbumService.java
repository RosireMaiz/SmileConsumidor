package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.MultimediaAlbum;
import ve.smile.payload.request.PayloadMultimediaAlbumRequest;
import ve.smile.payload.response.PayloadMultimediaAlbumResponse;

@Consume("MultimediaAlbumService")
public class MultimediaAlbumService extends IService<PayloadMultimediaAlbumResponse, PayloadMultimediaAlbumRequest, MultimediaAlbum> {

}
