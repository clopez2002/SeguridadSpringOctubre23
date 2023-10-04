package com.garage.seguridadspring.config;

import com.garage.seguridadspring.config.App;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.annotation.WebServlet;


public class MiServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{App.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
