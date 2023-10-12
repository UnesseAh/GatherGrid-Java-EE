package com.gathergrid.controller;


import com.gathergrid.service.EventService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "InitialServlet", value = "", loadOnStartup = 1)
public class InitialServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        EventService eventService = new EventService();
    }
}
