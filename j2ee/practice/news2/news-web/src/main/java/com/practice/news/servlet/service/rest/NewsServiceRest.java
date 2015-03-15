package com.practice.news.servlet.service.rest;

import com.practice.news.ejb.api.NewsService;
import com.practice.news.model.NewsItemTO;
import com.practice.news.model.NewsTopicTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by bolbin
 * on 01.03.2015.
 */
@Path("/")
public class NewsServiceRest {

    @GET
    @Path("topics")
    @Produces(MediaType.APPLICATION_XML)
    public List<NewsTopicTO> getAllTopics() {
        return getNewsService().getAllTopics();
    }

    @GET
    @Path("newsbytopic/{topicId}")
    @Produces(MediaType.APPLICATION_XML)//MediaType.APPLICATION_JSON
    public List<NewsItemTO> getNewsByTopic(@PathParam("topicId") Long topicId) {
        return getNewsService().getNewsByTopicId(topicId);
    }


    private NewsService getNewsService() {
        try {
            Context ctx = new InitialContext();
            return (NewsService) ctx.lookup(NewsService.BEAN_NAME);
        } catch (NamingException e) {
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }

    }
}
