package us.cnlist.cop.controller.async;

import com.google.gwt.core.client.GWT;
import org.fusesource.restygwt.client.RestService;
import us.cnlist.cop.entity.UserDevice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

public interface UserDeviceAsync extends RestService {
    UserDeviceAsync instance = GWT.create(UserDeviceAsync.class);

    @Path("udev/my")
    @GET
    void getMyDevices(SingleCallback<Response<List<UserDevice>>> callback);

}
