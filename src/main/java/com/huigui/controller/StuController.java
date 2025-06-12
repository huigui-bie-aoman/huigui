package com.huigui.controller;

import com.huigui.domain.Stu;
import com.huigui.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StuController {
    @Resource
    private StuService stuService;

    @RequestMapping("/selAll")
    public String selAll(Model model) {

        List<Stu> stuList = stuService.selectAll();
        for (Stu stu : stuList) {
            System.out.println(stu);
        }
        model.addAttribute("stuList", stuList);
        return "index.jsp";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add(ModelAndView modelAndView, Stu stu) {
        stuService.doAdd(stu);
        modelAndView.setViewName("/selAll");
        return modelAndView;
    }

    @RequestMapping(value = "/edit")
    public String edit(Model model, int id) {
       Stu stu = stuService.selById(id);

        model.addAttribute("stu",stu);
//        stuService.doUpdate(stu);
//        modelAndView.setViewName("/selAll");
        return "edit.jsp";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView update(Stu stu,ModelAndView modelAndView) {

        stuService.doUpdate(stu);
        modelAndView.setViewName("/selAll");
        return modelAndView;
    }
    @RequestMapping("/delete")
    public ModelAndView delete(ModelAndView modelAndView,int id){
        stuService.deleteByID(id);
        modelAndView.setViewName("/selAll");
        return modelAndView;
    }
}
