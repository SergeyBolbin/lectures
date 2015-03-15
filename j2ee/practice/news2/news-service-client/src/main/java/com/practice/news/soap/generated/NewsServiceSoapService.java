
package com.practice.news.soap.generated;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "NewsServiceSoapService", targetNamespace = "http://soap.service.servlet.news.practice.com/", wsdlLocation = "http://localhost:8080/news-web/NewsService?wsdl")
public class NewsServiceSoapService
    extends Service
{

    private final static URL NEWSSERVICESOAPSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.practice.news.soap.generated.NewsServiceSoapService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.practice.news.soap.generated.NewsServiceSoapService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/news-web/NewsService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/news-web/NewsService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NEWSSERVICESOAPSERVICE_WSDL_LOCATION = url;
    }

    public NewsServiceSoapService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NewsServiceSoapService() {
        super(NEWSSERVICESOAPSERVICE_WSDL_LOCATION, new QName("http://soap.service.servlet.news.practice.com/", "NewsServiceSoapService"));
    }

    /**
     * 
     * @return
     *     returns NewsServiceSoap
     */
    @WebEndpoint(name = "NewsServiceSoapPort")
    public NewsServiceSoap getNewsServiceSoapPort() {
        return super.getPort(new QName("http://soap.service.servlet.news.practice.com/", "NewsServiceSoapPort"), NewsServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NewsServiceSoap
     */
    @WebEndpoint(name = "NewsServiceSoapPort")
    public NewsServiceSoap getNewsServiceSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.service.servlet.news.practice.com/", "NewsServiceSoapPort"), NewsServiceSoap.class, features);
    }

}