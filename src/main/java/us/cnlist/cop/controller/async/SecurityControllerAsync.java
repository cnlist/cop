package us.cnlist.cop.controller.async;

import com.google.gwt.core.client.GWT;
import org.fusesource.restygwt.client.RestService;

public interface SecurityControllerAsync extends RestService {

    SecurityControllerAsync instance = GWT.create(SecurityControllerAsync.class);
    

}
