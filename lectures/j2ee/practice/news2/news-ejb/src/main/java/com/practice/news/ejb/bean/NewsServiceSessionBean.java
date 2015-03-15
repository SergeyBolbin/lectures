package com.practice.news.ejb.bean;

import com.practice.news.ejb.api.NewsService;
import com.practice.news.ejb.api.NewsServiceLocal;
import com.practice.news.ejb.converter.NewsItemConverter;
import com.practice.news.ejb.converter.NewsTopicConverter;
import com.practice.news.entity.NewsItem;
import com.practice.news.entity.NewsTopic;
import com.practice.news.model.NewsItemTO;
import com.practice.news.model.NewsTopicTO;
import org.apache.log4j.Logger;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

/**
 * Created by bolbin
 * on 28.02.2015.
 */
@Remote(NewsService.class)
@Local(NewsServiceLocal.class)
@Stateless(mappedName = NewsService.BEAN_NAME)
public class NewsServiceSessionBean implements NewsService, NewsServiceLocal {

    Logger LOGGER = Logger.getLogger(NewsServiceSessionBean.class);

    @PersistenceContext(unitName = "News-PU")
    private EntityManager entityManager;

    @Override
    public void saveNews(NewsItemTO itemTO) {
        LOGGER.info("Saving news");
        NewsItem entity = new NewsItemConverter().convertTOEntity(itemTO);
        entityManager.merge(entity);
        LOGGER.info("News item is saved");
    }

    @Override
    public List<NewsTopicTO> getAllTopics() {
        LOGGER.info("Getting all topics");
        TypedQuery<NewsTopic> query = entityManager.createNamedQuery("getAllTopics", NewsTopic.class);
        List<NewsTopicTO> topics = new NewsTopicConverter().convertFromEntities(query.getResultList());
        Collections.sort(topics);
        return topics;
    }

    @Override
    public NewsTopicTO getTopicById(Long topicId) {
        NewsTopic newsTopic = entityManager.find(NewsTopic.class, topicId);
        if(newsTopic == null) {
            String message = "Can not find news topic with id=" + topicId;
            LOGGER.error(message);
            throw new IllegalStateException(message);
        }

        return new NewsTopicConverter().convertFromEntity(newsTopic);
    }

    @Override
    public List<NewsItemTO> getNewsByTopicId(Long topicId) {
        TypedQuery<NewsItem> query = entityManager.createNamedQuery("getNewsByTopicId", NewsItem.class);
        query.setParameter(1, topicId);
        List<NewsItemTO> news = new NewsItemConverter().convertFromEntities(query.getResultList());
        Collections.sort(news);
        return news;
    }

    @Override
    public NewsItemTO getNewsById(Long id) {
        NewsItem newsItem = entityManager.find(NewsItem.class, id);
        if(newsItem == null) {
            String message = "Can not find news with id=" + id;
            LOGGER.error(message);
            throw new IllegalStateException(message);
        }

        return new NewsItemConverter().convertFromEntity(newsItem);
    }
}
