package com.practice.news.servlet.service.rest;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by
 * bolbin on 01.03.2015.
 */
public class NewsServiceRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(NewsServiceRest.class);
        return classes;
    }

}
