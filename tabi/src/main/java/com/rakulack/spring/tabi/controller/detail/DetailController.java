package com.rakulack.spring.tabi.controller.detail;

import com.rakulack.spring.tabi.entity.Header;
import com.rakulack.spring.tabi.service.TabiService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DetailController {

    TabiService tabiService;

    public DetailController(TabiService tabiService) {
        this.tabiService = tabiService;
    }

    @GetMapping(value = "/detail/{hash}")
    public String get(@PathVariable("hash") String hash, Model model) {
        Header header = tabiService.loadHeader(hash);
        model.addAttribute("header", header);
        model.addAttribute("places", tabiService.loadPlace(header.getId()));
        model.addAttribute("routes", tabiService.loadRoute(header.getId()));
        return "detail";
    }
}
