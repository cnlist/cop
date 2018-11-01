package us.cnlist.cop.client;

import com.google.gwt.core.client.EntryPoint;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import org.fusesource.restygwt.client.Defaults;
import org.moxieapps.gwt.highcharts.client.Highcharts;
import org.moxieapps.gwt.highcharts.client.Lang;
import us.cnlist.cop.client.base.LeftMenu;
import us.cnlist.cop.client.base.MainMenu;
import us.cnlist.cop.client.base.MainTab;
import us.cnlist.cop.client.base.UserInfoPanel;

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

        setWidth100();
        setHeight100();
        HLayout top = new HLayout();
        addMember(top);
        top.setWidth100();
        top.addMember(UserInfoPanel.getInstance());
        top.addMember(MainMenu.getInstance());
        HLayout main = new HLayout();
        addMember(main);
        main.addMember(LeftMenu.getInstance());
        main.addMember(MainTab.getInstance());
        draw();

    }
}
