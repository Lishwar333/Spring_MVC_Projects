package com.employee.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class MyInitializer  implements WebApplicationInitializer{

 

    public void onStartup(ServletContext servletContext) throws ServletException {
        // TODO Auto-generated method stub
         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
         ctx.register(MVCConfiguration.class);
         ctx.setServletContext(servletContext);
         ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
         servlet.setLoadOnStartup(1);
         servlet.addMapping("/");
    }

 

}