package com.practice.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by bolbin
 * on 28.02.2015.
 */
@Entity
@Table(name="news")
@NamedQuery(name = "getNewsByTopicId",
        query = "SELECT n FROM NewsItem n WHERE n.topic.id = ?1")
public class NewsItem {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="full_text")
    private String fullText;

    @Column(name="short_text")
    private String shortText;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date")
    private Date date;

    @ManyToOne
    @JoinColumn(name="topic_id")
    private NewsTopic topic;

    public NewsItem() {
    }

    public NewsItem(Long id,
                    String title,
                    String fullText,
                    String shortText,
                    Date date,
                    NewsTopic topic) {
        this.id = id;
        this.title = title;
        this.fullText = fullText;
        this.shortText = shortText;
        this.date = date;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFullText() {
        return fullText;
    }

    public String getShortText() {
        return shortText;
    }

    public Date getDate() {
        return date;
    }

    public NewsTopic getTopic() {
        return topic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTopic(NewsTopic topic) {
        this.topic = topic;
    }
}
