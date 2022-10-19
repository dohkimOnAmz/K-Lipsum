package io.demo.klipsum.klipsum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class mainController {

    private List<String> klipsum;

    public mainController(){
        initial();
    }

    private Boolean initial(){
        klipsum = Arrays.asList("바람이","불어오는","곳","그","곳으로","가네","그대의","머리결같은",
                "나무아래로","덜컹이는","기차에","기대어","너에게","편지를","쓴다","꿈에","보았던","그","길",
                "그","길에","서있네","설레임과","두려움으로","불안한","행복이지만","우리가","느끼며","바라볼","하늘과",
                "사람들","힘겨운","날들도","있지만","새로운","꿈들을","위해","바람이","불어","오는","곳","그","곳으로",
                "가네","햇살이","눈부신","곳","그","곳으로","가네","바람에","내","몸맡기고","그","곳으로","가네","출렁이는",
                "파도에","흔들려도","수평선을","바라보며","햇살이","웃고","있는","곳","그","곳으로","가네","나뭇잎이","손짓하는","곳","그","곳으로",
                "가네","휘파람","불며","걷다가","너를","생각해","너의","목소리가","그리워도","뒤돌아","볼","수는","없지","바람이","불어","오는","곳",
                "그","곳으로","가네");

        return true;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("result","");

        return "index";
    }


}
