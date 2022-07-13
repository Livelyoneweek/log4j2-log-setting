package log.log4j2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j2
@Controller
public class HomController {

    @ResponseBody
    @GetMapping("/")
    public String home() {

        log.debug("debug");
        log.info("debug");
        log.warn("warn");
        log.error("error");

        return "개발 공부 중";

    }
}
