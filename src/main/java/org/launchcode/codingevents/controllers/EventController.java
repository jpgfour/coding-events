package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Copied from Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
//        List<String> events = new ArrayList<>();
//        events.add("Code With Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events",events);
        HashMap<String, String> events = new HashMap<>();
        events.put("Gencon", "The Best 4 Days In Gaming");
        events.put("Gencant","For people who can't make it to Gencon in person, in non-pandemic years");
        events.put("Gencon Online", "Official online version of Gencon for pandemic years");
        model.addAttribute("events",events);
//        System.out.println(events);
//        System.out.println(events.keySet());
//        System.out.println(events.values());
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

}
