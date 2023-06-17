package com.k4rnaj1k.gateway.impl;

import com.k4rnaj1k.gateway.api.model.request.SaveUserDataRequest;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import javax.ws.rs.core.MediaType;

public class UserDataRegisterRoute extends RouteBuilder {
    @Override
    public void configure() {
        restConfiguration().component("jetty").contextPath("/camel").port(9191).bindingMode(RestBindingMode.json);

        rest("/")

                .post("register")
                .consumes(MediaType.APPLICATION_JSON)
                .type(SaveUserDataRequest.class)
                .to("direct:register")

                .get()
                .to("direct:register-get");

        from("direct:register")
                .bean("userDataService", "register")
                //todo redirect a message to jms queue with username and pass
                .log("request something");

        from("direct:register-get")
                .log("register-get")
                .transform(constant("Hello"));
    }
}