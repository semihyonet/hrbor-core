package com.karpco.havegan.controller.mvc;

import com.karpco.havegan.dto.jobs.CreateJobRequest;
import com.karpco.havegan.entity.core.User;
import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;
import com.karpco.havegan.service.CustomUserService;
import com.karpco.havegan.service.JobService;
import com.karpco.havegan.service.impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.core.Authentication;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mvc/jobs/")
public class JobsMVCController extends AbstractMVCController {
    @Autowired
    JobService jobService;

    @Autowired
    private CustomUserService userDetailsService;

    @ModelAttribute
    public void addJobs(Model model, Authentication authentication) {
        User user = userDetailsService.loadUserByUsername(authentication.getName());
        ArrayList<Job> jobs = jobService.getJobs(user.getOrganizations().get(0));

        model.addAttribute("jobs", jobs);
    }


    @ModelAttribute
    public void addJobEvaluations(Model model) {
        JobEvaluationTypeEnum[] values = JobEvaluationTypeEnum.values();
        model.addAttribute("jobApplicationTypes", values);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String jobs() {
        return "jobs";
    }

    @GetMapping(value = "/create/")
    public String getAddJobForm() {
        return "addJob";
    }


    @PostMapping(value = "/create/")
    public String createJob(
            @ModelAttribute CreateJobRequest createJobRequest,
            Authentication authentication
    ) {
        User user = userDetailsService.loadUserByUsername(authentication.getName());

        jobService.createJob(createJobRequest, user.getOrganizations().get(0));
        return "redirect:/mvc/jobs/";
    }

}
