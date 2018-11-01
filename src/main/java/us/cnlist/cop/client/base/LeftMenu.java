package us.cnlist.cop.client.base;

import com.smartgwt.client.widgets.layout.SectionStack;
import us.cnlist.cop.client.base.sections.DevicesSection;

public class LeftMenu extends SectionStack {

    private static LeftMenu instance;
    private final DevicesSection devicesSection = new DevicesSection();

    private LeftMenu() {
        setSections(devicesSection);
        setWidth("30%");
    }

    public static LeftMenu getInstance() {
        if (instance == null) {
            instance = new LeftMenu();
        }
        return instance;
    }
}
