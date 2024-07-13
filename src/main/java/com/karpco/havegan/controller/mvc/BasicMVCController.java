package com.karpco.havegan.controller.mvc;


import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping("/mvc")
public class BasicMVCController extends AbstractMVCController {

    @GetMapping("/fragements")
    public String fragements() {
        return "fragments/layout";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "mainpage";
    }

    @RequestMapping(value = "/reports/", method = RequestMethod.GET)
    public String reports() {
        return "reports";
    }
}
