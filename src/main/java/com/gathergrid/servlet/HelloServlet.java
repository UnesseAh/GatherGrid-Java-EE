package com.gathergrid.servlet;

import com.gathergrid.service.EventService;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "" ,loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
    private String message;
    public void init() {
        EventService eventService = new EventService();
        message = "nice";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}