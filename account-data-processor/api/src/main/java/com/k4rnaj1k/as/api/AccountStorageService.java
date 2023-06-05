package com.k4rnaj1k.as.api;

import com.k4rnaj1k.as.api.model.TestDTO;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Resource
@Path("/")
public interface AccountStorageService {
    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    TestDTO hello();
}
