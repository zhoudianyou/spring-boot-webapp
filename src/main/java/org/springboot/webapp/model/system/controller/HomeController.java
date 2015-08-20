package org.springboot.webapp.model.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IDEA.
 * User: zhoudianyou
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String homeIndex() {
        return "/index";
    }
}
