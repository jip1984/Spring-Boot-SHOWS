package com.prosserj.shows;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetShows {

    @GetMapping("/shows")
    public String getShows(){
        return "shows";
    }
}
