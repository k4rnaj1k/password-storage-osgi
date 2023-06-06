package com.k4rnaj1k.gateway.impl;

import com.k4rnaj1k.gateway.api.UserDataService;
import org.apache.camel.CamelContext;
import org.apache.camel.core.osgi.OsgiDefaultCamelContext;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import java.util.Hashtable;

public class CamelContextConfig implements BundleActivator {
    private CamelContext context;
    private ServiceRegistration<CamelContext> registration;
    private static Hashtable<String, ?> EMPTY_PROPERTIES = new Hashtable<>();
    @Override
    public void start(BundleContext bundleContext) throws Exception {
//        bundleContext.registerService("userDataService", new UserDataServiceImpl(), EMPTY_PROPERTIES);
//        context = new OsgiDefaultCamelContext(bundleContext);
//
//        registration = bundleContext.registerService(CamelContext.class, context, EMPTY_PROPERTIES);
//        context.start();
//
//
//        context.addRoutes(new UserDataRegisterRoute());
    }

    @Override
    public void stop(BundleContext bundleContext) {
//        registration.unregister();
//        context.stop();
    }
}
