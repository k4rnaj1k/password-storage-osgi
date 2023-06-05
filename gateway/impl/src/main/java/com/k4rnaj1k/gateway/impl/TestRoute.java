package com.k4rnaj1k.gateway.impl;

import org.apache.camel.builder.RouteBuilder;

public class TestRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:myTimer?period=1000")
                 .log("Test");
    }
}