package us.cnlist.cop.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.smartgwt.client.widgets.layout.VLayout;
import org.fusesource.restygwt.client.Defaults;
import org.moxieapps.gwt.highcharts.client.Highcharts;
import org.moxieapps.gwt.highcharts.client.Lang;

public class CopClient extends VLayout implements EntryPoint {


    static {
        Defaults.setServiceRoot("/");
        Defaults.setDateFormat("dd.MM.yyyy");
        Highcharts.setOptions(new Highcharts.Options()
                .setLang(new Lang()
                        .setOption("numericSymbols", null)
                        .setThousandsSep(" ")
                )
        );
    }

    public void onModuleLoad() {
    }
}
