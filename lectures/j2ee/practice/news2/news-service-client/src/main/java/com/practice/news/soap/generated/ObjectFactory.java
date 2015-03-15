
package com.practice.news.soap.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.practice.news.soap.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllNewsByTopicIdResponse_QNAME = new QName("http://soap.service.servlet.news.practice.com/", "getAllNewsByTopicIdResponse");
    private final static QName _NewsItemTO_QNAME = new QName("http://soap.service.servlet.news.practice.com/", "newsItemTO");
    private final static QName _GetAllTopicsResponse_QNAME = new QName("http://soap.service.servlet.news.practice.com/", "getAllTopicsResponse");
    private final static QName _NewsTopicTO_QNAME = new QName("http://soap.service.servlet.news.practice.com/", "newsTopicTO");
    private final static QName _GetAllTopics_QNAME = new QName("http://soap.service.servlet.news.practice.com/", "getAllTopics");
    private final static QName _GetAllNewsByTopicId_QNAME = new QName("http://soap.service.servlet.news.practice.com/", "getAllNewsByTopicId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.practice.news.soap.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllTopics }
     * 
     */
    public GetAllTopics createGetAllTopics() {
        return new GetAllTopics();
    }

    /**
     * Create an instance of {@link GetAllTopicsResponse }
     * 
     */
    public GetAllTopicsResponse createGetAllTopicsResponse() {
        return new GetAllTopicsResponse();
    }

    /**
     * Create an instance of {@link NewsTopicTO }
     * 
     */
    public NewsTopicTO createNewsTopicTO() {
        return new NewsTopicTO();
    }

    /**
     * Create an instance of {@link GetAllNewsByTopicId }
     * 
     */
    public GetAllNewsByTopicId createGetAllNewsByTopicId() {
        return new GetAllNewsByTopicId();
    }

    /**
     * Create an instance of {@link GetAllNewsByTopicIdResponse }
     * 
     */
    public GetAllNewsByTopicIdResponse createGetAllNewsByTopicIdResponse() {
        return new GetAllNewsByTopicIdResponse();
    }

    /**
     * Create an instance of {@link NewsItemTO }
     * 
     */
    public NewsItemTO createNewsItemTO() {
        return new NewsItemTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNewsByTopicIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.servlet.news.practice.com/", name = "getAllNewsByTopicIdResponse")
    public JAXBElement<GetAllNewsByTopicIdResponse> createGetAllNewsByTopicIdResponse(GetAllNewsByTopicIdResponse value) {
        return new JAXBElement<GetAllNewsByTopicIdResponse>(_GetAllNewsByTopicIdResponse_QNAME, GetAllNewsByTopicIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsItemTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.servlet.news.practice.com/", name = "newsItemTO")
    public JAXBElement<NewsItemTO> createNewsItemTO(NewsItemTO value) {
        return new JAXBElement<NewsItemTO>(_NewsItemTO_QNAME, NewsItemTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTopicsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.servlet.news.practice.com/", name = "getAllTopicsResponse")
    public JAXBElement<GetAllTopicsResponse> createGetAllTopicsResponse(GetAllTopicsResponse value) {
        return new JAXBElement<GetAllTopicsResponse>(_GetAllTopicsResponse_QNAME, GetAllTopicsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewsTopicTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.servlet.news.practice.com/", name = "newsTopicTO")
    public JAXBElement<NewsTopicTO> createNewsTopicTO(NewsTopicTO value) {
        return new JAXBElement<NewsTopicTO>(_NewsTopicTO_QNAME, NewsTopicTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTopics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.servlet.news.practice.com/", name = "getAllTopics")
    public JAXBElement<GetAllTopics> createGetAllTopics(GetAllTopics value) {
        return new JAXBElement<GetAllTopics>(_GetAllTopics_QNAME, GetAllTopics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNewsByTopicId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.servlet.news.practice.com/", name = "getAllNewsByTopicId")
    public JAXBElement<GetAllNewsByTopicId> createGetAllNewsByTopicId(GetAllNewsByTopicId value) {
        return new JAXBElement<GetAllNewsByTopicId>(_GetAllNewsByTopicId_QNAME, GetAllNewsByTopicId.class, null, value);
    }

}
