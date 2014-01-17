package com.ibs.assignment;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AssignmtCtrl implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("txtName");
        String addr = request.getParameter("txtAddr");
        Map model = new HashMap ();
        model.put("tName", name);
        model.put("tAddr", addr);
        
        
        logger.info("Returning hello view with " + name);

       // return new ModelAndView("WEB-INF/jsp/hello.jsp", "now", now);
        return new ModelAndView("translatedAddr", "translatedMap", model);
    }

}