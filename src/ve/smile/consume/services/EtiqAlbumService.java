package ve.smile.consume.services;

import lights.core.annotations.Consume;
import lights.core.consume.services.IService;
import ve.smile.dto.EtiqAlbum;
import ve.smile.payload.request.PayloadEtiqAlbumRequest;
import ve.smile.payload.response.PayloadEtiqAlbumResponse;

@Consume("EtiqAlbumService")
public class EtiqAlbumService extends IService<PayloadEtiqAlbumResponse, PayloadEtiqAlbumRequest, EtiqAlbum> {

}
