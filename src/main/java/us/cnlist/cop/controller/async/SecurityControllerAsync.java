package us.cnlist.cop.controller.async;

import com.google.gwt.core.client.GWT;
import org.fusesource.restygwt.client.RestService;
import us.cnlist.cop.entity.UserProfileEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface SecurityControllerAsync extends RestService {

    SecurityControllerAsync instance = GWT.create(SecurityControllerAsync.class);

    @GET
    @Path("/security/user_info")
    void getUserProfile(SingleCallback<UserProfileEntity> callback);

}
