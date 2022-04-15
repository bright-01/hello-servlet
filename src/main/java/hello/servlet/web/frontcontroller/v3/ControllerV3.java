package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    // v1, v2 와 다르게 서블릿에 종속적이지 않는다.
    ModelView process(Map<String, String> paramMap);

}

