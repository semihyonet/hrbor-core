package com.karpco.havegan.service;

import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobApplicantEvaluationQuestion;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;

import java.util.List;
import java.util.UUID;

public interface JobApplicantEvaluationQuestionService {
    public void createJobApplicantEvaluationQuestion(JobEvaluation jobEvaluation);

    public void deleteJobApplicantEvaluationQuestion(UUID jobApplicantEvaluationQuestionId);

    public List<JobApplicantEvaluationQuestion> getJobApplicantEvaluationQuestionsByJobApplicant(JobApplicant jobApplicant);

    public List<JobApplicantEvaluationQuestion> getJobApplicantEvaluationQuestionsByJobEvaluation(JobEvaluation jobEvaluation);

    public JobApplicantEvaluationQuestion getJobApplicantEvaluationQuestion(JobApplicant jobApplicant, JobEvaluation jobEvaluation);

    public JobApplicantEvaluationQuestion updateJobApplicantEvaluationQuestion(JobApplicant jobApplicant, JobEvaluation jobEvaluation, JobApplicantEvaluationQuestion jobApplicantEvaluationQuestion);
}
