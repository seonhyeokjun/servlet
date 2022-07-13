package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {
    /**
     * @param paramsMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramsMap, Map<String, Object> model);
}
