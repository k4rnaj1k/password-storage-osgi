package com.k4rnaj1k.gateway.impl;

import org.apache.camel.CamelContext;
import org.apache.camel.core.osgi.OsgiDefaultCamelContext;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import java.util.Hashtable;

public class CamelContextConfig implements BundleActivator {
    private CamelContext context;
    private ServiceRegistration<CamelContext> registration;
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        context = new OsgiDefaultCamelContext(bundleContext);

        registration = bundleContext.registerService(CamelContext.class, context, new Hashtable<>());
        context.start();


        context.addRoutes(new TestRoute());
    }

    @Override
    public void stop(BundleContext bundleContext) {
        registration.unregister();
        context.stop();
    }
}
