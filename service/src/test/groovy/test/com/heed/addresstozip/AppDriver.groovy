package test.com.heed.addresstozip

import com.heed.addresstozip.Application
import groovyx.net.http.RESTClient
import org.springframework.boot.SpringApplication

class AppDriver {

    RESTClient client = new RESTClient('http://localhost:8080')
    def service
    def greeting

    def start() {
        service = SpringApplication.run (Application.class)
    }

    def stop() {
        service.close()
    }

    def fetchGreeting() {
        def response = client.get(path: '/v1/greeting')
        assert response.status == 200
        greeting = response.data
    }

    void retrievedGreetingIs(String greeting) {
        assert this.greeting.greeting == greeting
    }
}
