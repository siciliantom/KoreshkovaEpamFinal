package by.bsu.hostel.command.additional;

/**
 * Created by Kate on 05.02.2016.
 */

import by.bsu.hostel.command.factory.ActionCommand;
import by.bsu.hostel.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.login");
        if (request.getSession(false) != null) {
            request.getSession().invalidate();
        }
        return page;
    }
}
