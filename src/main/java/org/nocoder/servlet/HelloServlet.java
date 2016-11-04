package org.nocoder.servlet;

import org.nocoder.soundsystem.SgtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by YANGJINLONG on 2016/11/4.
 */
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.nocoder");
        SgtPeppers cd = (SgtPeppers) applicationContext.getBean("sgtPeppers", SgtPeppers.class);
        cd.play();
    }
}
