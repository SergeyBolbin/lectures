package com.practice.news.ejb.converter;

import com.practice.news.entity.NewsTopic;
import com.practice.news.model.NewsTopicTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by bolbin on 28.02.2015.
 */
public class NewsTopicConverter {

    public NewsTopic convertTOEntity(NewsTopicTO to) {
        return new NewsTopic(to.getId(), to.getName(), to.getOrder());
    }

    public NewsTopicTO convertFromEntity(NewsTopic entity) {
        return new NewsTopicTO(entity.getId(), entity.getName(), entity.getOrder());
    }

    public List<NewsTopicTO> convertFromEntities(Collection<NewsTopic> entities) {
        List<NewsTopicTO> result = new ArrayList<NewsTopicTO>();
        for(NewsTopic entity : entities) {
            result.add(convertFromEntity(entity));
        }
        return result;
    }
}
