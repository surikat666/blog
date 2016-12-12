package com.strokova.controller;

import com.strokova.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User on 11.12.2016.
 */
@Controller
@RequestMapping("/posts")
public class MainController {

    @Autowired
    PostService postService;

    @GetMapping
    public ModelAndView viewPosts() {
        ModelAndView mav = new ModelAndView("posts");
        mav.addObject("posts", postService.findAll());
        return mav;
    }
}
