package hello.servlet.web.servletMvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp"; // WEB-INF - 외부에서 호출 할 수 없음. 컨트롤러를 통해서 호출해야함.
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewPath);// 컨트롤러에서 view 경로로 이동할때 사용함
        requestDispatcher.forward(request, response); // 경로 호출 - 다른 서블릿이나 JSP로 이동할 수 있는 기능. 서버 내부에서 다시 호출이 발생


    }
}

/**
 *
 * redirect vs forward
 * > 리다이렉트는 실제 클라이언트(웹 브라우저)에 응답이 나갔다가, 클라이언트가 redirect 경로로 다시
 * 요청한다. 따라서 클라이언트가 인지할 수 있고, URL 경로도 실제로 변경된다. 반면에 포워드는 서버
 * 내부에서 일어나는 호출이기 때문에 클라이언트가 전혀 인지하지 못한다.
 * */
