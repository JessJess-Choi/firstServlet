package project.firstServlet.web.frontcontroller.v5;

import project.firstServlet.web.frontcontroller.ModelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {
    boolean supports(Object handler);
    ModelView handle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws  SecurityException, IOException;
}
