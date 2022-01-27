package br.com.ola.somar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/somar")
public class ServletSomar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer p1 = Integer.parseInt(req.getParameter("p1"));
        Integer p2 = Integer.parseInt(req.getParameter("p2"));

        Integer total = p1 + p2;

        resp.getWriter().print("<html><h1>O Resultado foi :  " + total + "</h1></html>");

    }

    
}
