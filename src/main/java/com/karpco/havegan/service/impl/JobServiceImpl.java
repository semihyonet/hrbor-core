package com.karpco.havegan.service.impl;

import com.karpco.havegan.dto.jobs.CreateJobRequest;
import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;
import com.karpco.havegan.repository.jobs.JobEvaluationRepository;
import com.karpco.havegan.repository.jobs.JobRepository;
import com.karpco.havegan.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    private JobEvaluationRepository jobEvaluationRepository;

    @Override
    public Job getJob(UUID id) {
        return jobRepository.findById(id);
    }

    @Override
    public ArrayList<Job> getJobs(Organization organization) {
        return jobRepository.findJobsByOrganization(organization);
    }

    @Override
    public Job createJob(CreateJobRequest request, Organization currentOrganization) {
        Job job = new Job();
        job.setName(request.getName());
        job.setOrganization(currentOrganization);
        job = jobRepository.save(job);
        short i = 0;
        for (JobEvaluationTypeEnum jobEvaluationTypeEnum : request.getJobEvaluationTypeEnum()) {
            JobEvaluation jobEvaluation = new JobEvaluation();
            jobEvaluation.setJob(job);
            jobEvaluation.setOrder(i++);
            jobEvaluation.setJobEvaluationTypeEnum(jobEvaluationTypeEnum);

            jobEvaluationRepository.save(jobEvaluation);
        }

        return job;
    }
}
