package com.ding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gurongjing on 2017/4/28.
 * huifang company
 */

@Controller
public class PageController {
//    @RequestMapping(value = "/currentSitePatient")
//    public ModelAndView currentSitePatient(
//            @RequestParam(value = "openId", required = true) String openId,
//            @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset,
//            @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit,
//            @RequestParam(value = "exAppId", required = true) Integer exAppId,
//            @RequestParam(value = "exProId", required = true) Integer exProId)
//            throws Exception {
//        String doctorId;
//        try {
//            doctorId = pdmsUserService.getDoctorByOpenId(openId,exAppId,exProId);
//        } catch (Exception ex) {
//            ModelAndView m2v = new ModelAndView("redirect:/binding.do");
//            m2v.addObject("openId", openId);
//            m2v.addObject("exAppId",exAppId);
//            m2v.addObject("exProId",exProId);
//            return m2v;
//        }
    @RequestMapping("/app")
    public ModelAndView avoidTheoginL(){
        ModelAndView m2v = new ModelAndView("main");
        m2v.addObject("nihao","我是你爹");
        return m2v;
    }
}
