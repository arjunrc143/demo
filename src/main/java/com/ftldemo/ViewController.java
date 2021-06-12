package com.ftldemo;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/views")
public class ViewController {

    @View("home")
    @Get("/")
    public HttpResponse index() {
      return HttpResponse.ok(CollectionUtils.mapOf("loggedIn", true, "username", "arjun"));
    }

}
