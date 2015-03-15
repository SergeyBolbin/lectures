package com.practice.news.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by bolbin on 28.02.2015.
 */
@XmlRootElement
public class NewsItemTO implements Serializable, Comparable<NewsItemTO> {

    private static final long serialVersionUID = 2717005363220399088L;

    private Long id;
    private String title;
    private String fullText;
    private String shortText;
    private Date date;
    private NewsTopicTO topic;

    public NewsItemTO() {
    }

    public NewsItemTO(Long id,
                      String title,
                      String fullText,
                      String shortText,
                      Date date,
                      NewsTopicTO topic) {
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

    public NewsTopicTO getTopic() {
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

    public void setTopic(NewsTopicTO topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsItemTO)) return false;

        NewsItemTO that = (NewsItemTO) o;

        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (fullText != null ? !fullText.equals(that.fullText) : that.fullText != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (shortText != null ? !shortText.equals(that.shortText) : that.shortText != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (topic != null ? !topic.equals(that.topic) : that.topic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (fullText != null ? fullText.hashCode() : 0);
        result = 31 * result + (shortText != null ? shortText.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(NewsItemTO o) {
        int result = 0;
        if(topic != null ) {
            result = topic.compareTo(o.getTopic());
        }

        if(result == 0) {
            result = o.getDate().compareTo(date);
        }

        return result;
    }
}
