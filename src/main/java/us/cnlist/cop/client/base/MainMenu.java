package us.cnlist.cop.client.base;

import com.smartgwt.client.widgets.toolbar.RibbonBar;

public class MainMenu extends RibbonBar {
    private static MainMenu instance;


    private MainMenu() {
    }

    public static MainMenu getInstance() {
        if (instance == null) {
            instance = new MainMenu();
        }
        return instance;
    }
}
