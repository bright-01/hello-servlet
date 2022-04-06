package hello.servlet.web.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="memberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {
}
