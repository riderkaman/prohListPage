package com.test.controller;

import com.test.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest req, HttpServletResponse res) {


        return "index";
    }

    @RequestMapping(value = "getProhList")
    public String prohList(Model model) {
        model.addAttribute("list", mainService.getProhList());
        return "board/test";
    }
}
