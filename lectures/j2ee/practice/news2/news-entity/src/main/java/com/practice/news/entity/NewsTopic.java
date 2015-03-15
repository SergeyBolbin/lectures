package com.practice.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Created by bolbin
 * on 28.02.2015.
 */

@Entity
@Table(name = "topic")
@NamedQuery(name = "getAllTopics", query = "SELECT t from NewsTopic t ORDER BY t.order")
public class NewsTopic {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "topic_order")
    private Integer order;

    public NewsTopic() {
    }

    public NewsTopic(Long id, String name, Integer order) {
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
}
