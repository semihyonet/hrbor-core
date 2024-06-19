package com.karpco.havegan.service;

import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;

import java.util.List;
import java.util.UUID;

public interface JobEvaluationService {
    public JobEvaluation getJobEvaluation(UUID id);

    public List<JobEvaluation> getJobEvaluationsByJob(Job job);

    public List<JobEvaluation> getJobEvaluationsByJobApplicant(JobApplicant jobApplicant);

    public JobEvaluation createJobEvaluation(JobApplicant jobApplicant, JobEvaluationTypeEnum evaluationType);

    public SpecificJobEvaluationService getSpecificJobEvaluationService(JobEvaluationTypeEnum jobEvaluationTypeEnum);

}
