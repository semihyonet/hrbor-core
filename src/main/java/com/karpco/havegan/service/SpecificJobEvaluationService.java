package com.karpco.havegan.service;

import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobApplicantEvaluationQuestion;

public interface SpecificJobEvaluationService {
    public JobApplicantEvaluationQuestion generate(Job job, JobApplicant jobApplicant);

    public int evaluate(JobApplicantEvaluationQuestion jobApplicantEvaluationQuestion);
}
