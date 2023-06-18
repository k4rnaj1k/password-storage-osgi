package com.k4rnaj1k.as.api;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface AccountStorageService {
    void encodePassword();
}
