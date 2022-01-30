package hws;

import org.eclipse.jetty.util.ajax.JSON;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    private JSON json = new JSON();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cat cat = new Cat("Вася", "серый");
        String catJSON = this.json.toJSON(cat);
        PrintWriter out = resp.getWriter();
        resp.setContentType("application/JSON");
        resp.setCharacterEncoding("UTF-8");
        out.print(catJSON);
    }
}
