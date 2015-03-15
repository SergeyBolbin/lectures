package com.practice.news.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by bolbin
 * on 28.02.2015.
 */
@XmlRootElement
public class NewsTopicTO implements Serializable, Comparable<NewsTopicTO> {

    private static final long serialVersionUID = 5372774376119333828L;

    private Long id;
    private String name;
    private Integer order;

    public NewsTopicTO() {
    }

    public NewsTopicTO(Long id, String name, Integer order) {
        this.id = id;
        this.name = name;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsTopicTO)) return false;

        NewsTopicTO that = (NewsTopicTO) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!order.equals(that.order)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + order.hashCode();
        return result;
    }

    @Override
    public int compareTo(NewsTopicTO o) {
        return order.compareTo(o.order);
    }
}
