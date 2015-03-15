package com.practice.news.servlet.service.soap;

import com.practice.news.ejb.api.NewsService;
import com.practice.news.model.NewsItemTO;
import com.practice.news.model.NewsTopicTO;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by bolbin on 11.03.2015.
 */
@WebService
public class NewsServiceSoap {

    @EJB(mappedName = NewsService.BEAN_NAME)
    private NewsService newsEJB;

    public NewsServiceSoap() {
    }

    @WebMethod
    public List<NewsTopicTO> getAllTopics() {
        return newsEJB.getAllTopics();
    }

    @WebMethod
    public List<NewsItemTO> getAllNewsByTopicId(@WebParam Long topicId) {
        return newsEJB.getNewsByTopicId(topicId);
    }
}
