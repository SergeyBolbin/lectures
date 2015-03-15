package com.practice.news.servlet;

import com.practice.news.ejb.api.NewsService;
import com.practice.news.ejb.api.NewsServiceLocal;
import com.practice.news.model.NewsItemTO;
import com.practice.news.model.NewsTopicTO;
import org.apache.commons.lang3.StringUtils;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by bolbin
 * on 28.02.2015.
 */
public class NewsServlet extends HttpServlet {

    private static final long serialVersionUID = 2600327112970250713L;

    @EJB(mappedName = NewsService.BEAN_NAME)
    private NewsServiceLocal newsEJB;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //read news by id and show detailed view
        if(!StringUtils.isEmpty(request.getParameter("news"))) {
            getSingleNewsAndRedirectToView(request, response);
        } else {
            //read all news by topic and show news list
            getNewsListAndRedirectToView(request, response);
        }
    }

    private void getSingleNewsAndRedirectToView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NewsTopicTO> allTopics = newsEJB.getAllTopics();
        request.setAttribute("topics", allTopics);
        Long id = Long.parseLong(request.getParameter("news"));
        request.setAttribute("news", newsEJB.getNewsById(id));
        request.getRequestDispatcher("news.jsp").forward(request, response);
    }

    private void getNewsListAndRedirectToView(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<NewsTopicTO> allTopics = newsEJB.getAllTopics();
        request.setAttribute("topics", allTopics);

        Long topicId = null;
        if (!StringUtils.isEmpty(request.getParameter("topic"))) {
            //if topic id was received as get parameter
            topicId = Long.parseLong(request.getParameter("topic"));
        } else if(!allTopics.isEmpty()) {
            //else try to get first topic from topic list
            topicId = allTopics.get(0).getId();
        }

        if(topicId != null) {
            List<NewsItemTO> newsByTopicId = newsEJB.getNewsByTopicId(topicId);
            request.setAttribute("newsList", newsByTopicId);
        }

        request.getRequestDispatcher("news.jsp").forward(request, response);
    }

}
