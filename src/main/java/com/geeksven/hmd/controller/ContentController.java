package com.geeksven.hmd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
public class ContentController {

  @GetMapping("/")
  public ModelAndView method() {
    return new ModelAndView("redirect:/index");
  }

  @GetMapping("/index")
  public String index(
      @RequestParam(name = "name", required = false, defaultValue = "Stefan")
          String name, Model model) {
    model.addAttribute("events", Collections.EMPTY_LIST);
    model.addAttribute("name", name);
    return "index";
  }

}
