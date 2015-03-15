package com.practice.news.ejb.api;

import com.practice.news.model.NewsItemTO;
import com.practice.news.model.NewsTopicTO;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by bolbin
 * on 15.03.2015.
 */
@Remote
public interface NewsService {

    String BEAN_NAME = "NewsServiceSessionBean";

    void saveNews(NewsItemTO itemTO);

    List<NewsTopicTO> getAllTopics();

    NewsTopicTO getTopicById(Long topicId);

    List<NewsItemTO> getNewsByTopicId(Long topicId);

    NewsItemTO getNewsById(Long id);
}
