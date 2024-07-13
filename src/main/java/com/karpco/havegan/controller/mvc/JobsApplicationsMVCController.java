package com.karpco.havegan.controller.mvc;


import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping("/mvc/applicants")
public class JobsApplicationsMVCController extends AbstractMVCController {

    @GetMapping("/fragements")
    public String fragements() {
        return "fragments/layout";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "mainpage";
    }


    @ModelAttribute
    public void addJobApplicants(Model model) {
        ArrayList<JobApplicant> jobApplicants = new ArrayList<>();
        JobApplicant a = new JobApplicant();
        a.setName("Semih Yonet");

        JobApplicant b = new JobApplicant();

        Job aJob = new Job();
        aJob.setName("Software Engineer");

        b.setName("Yigithan Saglam");

        jobApplicants.add(a);
        jobApplicants.add(b);


        model.addAttribute("jobApplicants", jobApplicants);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String applicants() {
        return "applicants";
    }

    @RequestMapping(value = "/reports/", method = RequestMethod.GET)
    public String reports() {
        return "reports";
    }
}
