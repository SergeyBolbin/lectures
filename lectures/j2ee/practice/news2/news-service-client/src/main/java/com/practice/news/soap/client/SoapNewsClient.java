package com.practice.news.soap.client;

import com.practice.news.soap.generated.NewsItemTO;
import com.practice.news.soap.generated.NewsServiceSoapService;
import com.practice.news.soap.generated.NewsTopicTO;

import java.util.List;

/**
 * Created by bolbin on 16.03.2015.
 */
public class SoapNewsClient {

    public static void main(String[] args) {
        //create new instance of service
        NewsServiceSoapService service = new NewsServiceSoapService();

        //call remote service method via service port
        List<NewsTopicTO> allTopics = service.getNewsServiceSoapPort().getAllTopics();

        for(NewsTopicTO topic : allTopics) {
            System.out.println(topic.getName());
            List<NewsItemTO> news = service.getNewsServiceSoapPort().getAllNewsByTopicId(topic.getId());

            for(NewsItemTO newsItem : news) {
                System.out.println(newsItem.getDate() + " " + newsItem.getShortText());
            }
        }
    }
}
