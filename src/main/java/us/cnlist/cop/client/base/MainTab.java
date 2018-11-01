package us.cnlist.cop.client.base;

import com.smartgwt.client.widgets.tab.TabSet;

public class MainTab extends TabSet {

    private static MainTab instance;

    private MainTab(){
        setWidth100();
    }

    public static MainTab getInstance() {
        if (instance==null){
            instance = new MainTab();
        }
        return instance;


    }
}
