package ct.com.agt.mes.helloworld

import com.agt.mes.helloworld.Application
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

    boolean retrievedGreetingIs(String greeting) {
        this.greeting.greeting == greeting
    }
}
