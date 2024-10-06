package com.appfoods.foods.transport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {

    // @GetMapping("/")
    // public String home() {
    //     return "home/index";
    // }

    // @GetMapping("/cms")
    // public String product() {
    //     return "cms/index";
    // }

    @GetMapping("/playagame")
    public String playGame(@RequestParam(name = "choice") String theChoice, Model model) {
        String theOutcome = "tie";
        if (theChoice.equalsIgnoreCase("paper"))  theOutcome = "win";
        if (theChoice.equalsIgnoreCase("scissors")) theOutcome = "loss";        

        model.addAttribute("theOutcome", theOutcome);
        model.addAttribute("yourChoice", theChoice);
        
        return "results";
    }

}
