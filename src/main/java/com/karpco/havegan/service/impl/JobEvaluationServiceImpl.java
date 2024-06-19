package com.karpco.havegan.service.impl;

import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;
import com.karpco.havegan.repository.jobs.JobEvaluationRepository;
import com.karpco.havegan.service.JobEvaluationService;
import com.karpco.havegan.service.SpecificJobEvaluationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@Service
public class JobEvaluationServiceImpl implements JobEvaluationService {

    @Autowired
    JobEvaluationRepository jobEvaluationRepository;

    /**
     * @param id
     * @return
     */
    @Override
    public JobEvaluation getJobEvaluation(UUID id) {
        return null;
    }

    /**
     * @param job
     * @return
     */
    @Override
    public List<JobEvaluation> getJobEvaluationsByJob(Job job) {
        return List.of();
    }

    /**
     * @param jobApplicant
     * @return
     */
    @Override
    public List<JobEvaluation> getJobEvaluationsByJobApplicant(JobApplicant jobApplicant) {
        return List.of();
    }

    /**
     * @param jobApplicant
     * @param evaluationType
     * @return
     */
    @Override
    public JobEvaluation createJobEvaluation(JobApplicant jobApplicant, JobEvaluationTypeEnum evaluationType) {
        return null;
    }

    /**
     * @param jobEvaluationTypeEnum
     * @return
     */
    @Override
    public SpecificJobEvaluationService getSpecificJobEvaluationService(JobEvaluationTypeEnum jobEvaluationTypeEnum) {
        return null;
    }
}
