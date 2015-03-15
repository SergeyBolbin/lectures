package com.practice.news.ejb.converter;

import com.practice.news.entity.NewsItem;
import com.practice.news.model.NewsItemTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by bolbin
 * on 28.02.2015.
 */
public class NewsItemConverter {

    private NewsTopicConverter topicConverter = new NewsTopicConverter();

    public NewsItem convertTOEntity(NewsItemTO to) {
        return new NewsItem(to.getId(),
                            to.getTitle(),
                            to.getFullText(),
                            to.getShortText(),
                            to.getDate(),
                            topicConverter.convertTOEntity(to.getTopic()));
    }

    public NewsItemTO convertFromEntity(NewsItem entity) {
        return new NewsItemTO(  entity.getId(),
                                entity.getTitle(),
                                entity.getFullText(),
                                entity.getShortText(),
                                entity.getDate(),
                                topicConverter.convertFromEntity(entity.getTopic()));
    }

    public List<NewsItemTO> convertFromEntities(Collection<NewsItem> entities) {
        List<NewsItemTO> result = new ArrayList<NewsItemTO>();
        for(NewsItem entity : entities) {
            result.add(convertFromEntity(entity));
        }
        return result;
    }
}
