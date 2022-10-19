package io.demo.klipsum.cm.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    @GetMapping("/health-check")
    public Map healthCheck(HttpServletRequest httpServletRequest){
        Map result = new HashMap();
        result.put("result", "Success");
        return result;
    }
}
