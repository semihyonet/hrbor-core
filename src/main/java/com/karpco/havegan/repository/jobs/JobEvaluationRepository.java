package com.karpco.havegan.repository.jobs;

import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface JobEvaluationRepository extends Repository<JobEvaluation, String> {
    public JobEvaluation findById(UUID id);

    public List<JobEvaluation> findJobEvaluationsByJob(Job job);

    public JobEvaluation save(JobEvaluation jobEvaluation);
}
