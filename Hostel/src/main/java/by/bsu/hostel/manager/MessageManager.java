package by.bsu.hostel.manager;

/**
 * Created by Kate on 08.02.2016.
 */

import java.util.Locale;
import java.util.ResourceBundle;

public enum MessageManager {
    RU(ResourceBundle.getBundle("pagecontent", new Locale("ru", "RU"))),
    EN(ResourceBundle.getBundle("pagecontent", new Locale("en", "US")));

    private ResourceBundle bundle;

    MessageManager(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public String getMessage(String key) {
        return bundle.getString(key);
    }
}
