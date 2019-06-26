package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import srvice.AppDictionary;
import srvice.Dictionary;

@Controller
public class Controllers {

    @GetMapping
    public String dictionary(){
        return "index";
    }


    @PostMapping("/result")
    public String result(@RequestParam String word , Model model){
        Dictionary dictionary = new AppDictionary();
        String result = dictionary.translate(word);
        model.addAttribute("result",result);
        return "translate";
    }
}
