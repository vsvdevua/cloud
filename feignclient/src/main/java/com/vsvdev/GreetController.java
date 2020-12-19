package com.vsvdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

private GreetClient greetClient;
@Autowired
    public void setGreetClient(GreetClient greetClient) {
        this.greetClient = greetClient;
    }

    @GetMapping("/get")
    public String greet(Model model){
    String answer=greetClient.greeting();
    model.addAttribute( "greeting",answer );
    return "greet-view";
    }
}
