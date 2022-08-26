package hh.jj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 洪康靖
 * @creationTime: 2022/8/26 15:22
 */
@Controller
public class Hello {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "1";
    }
}
