package com.test.controller;

import com.test.service.MainService;
import com.test.vo.PagingVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest req, HttpServletResponse res) {

        return "index";
    }

    @RequestMapping(value = "getProhList")
    public String prohList(HttpServletRequest req, HttpServletResponse res, Model model) {

        Map<String, Object> param = new HashMap<>();
        param.put("startNum", 1);
        param.put("endNum", 10);
        model.addAttribute("list", mainService.getProhList(param));
        return "board/test";
    }

    @RequestMapping(value = "getProhListPaging")
    public String prohListPaging(HttpServletRequest req, HttpServletResponse res, Model model) {

        int page = 1;
        int totalCount = mainService.getTotalCountProhList();
        if (req.getParameter("page") != null) {
            page = Integer.parseInt(req.getParameter("page"));
        }
        PagingVO paging = new PagingVO();
        paging.setPage(page);
        paging.setTotalCount(totalCount);

        int startNum = (page - 1) * 10 + 1;
        int endNum = page * 10;
        Map<String, Object> param = new HashMap<>();
        param.put("startNum", startNum);
        param.put("endNum", endNum);
        model.addAttribute("list", mainService.getProhList(param));
        model.addAttribute("paging", paging);
        return "board/test";
    }
}
