package com.karpco.havegan.service.impl;

import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobApplicantEvaluationQuestion;
import com.karpco.havegan.entity.jobs.JobEvaluation;
import com.karpco.havegan.service.JobApplicantEvaluationQuestionService;

import java.util.List;
import java.util.UUID;

public class JobApplicantEvaluationQuestionServiceImpl implements JobApplicantEvaluationQuestionService {
    /**
     * @param jobEvaluation
     */
    @Override
    public void createJobApplicantEvaluationQuestion(JobEvaluation jobEvaluation) {

    }

    /**
     * @param jobApplicantEvaluationQuestionId
     */
    @Override
    public void deleteJobApplicantEvaluationQuestion(UUID jobApplicantEvaluationQuestionId) {

    }

    /**
     * @param jobApplicant
     * @return
     */
    @Override
    public List<JobApplicantEvaluationQuestion> getJobApplicantEvaluationQuestionsByJobApplicant(JobApplicant jobApplicant) {
        return List.of();
    }

    /**
     * @param jobEvaluation
     * @return
     */
    @Override
    public List<JobApplicantEvaluationQuestion> getJobApplicantEvaluationQuestionsByJobEvaluation(JobEvaluation jobEvaluation) {
        return List.of();
    }

    /**
     * @param jobApplicant
     * @param jobEvaluation
     * @return
     */
    @Override
    public JobApplicantEvaluationQuestion getJobApplicantEvaluationQuestion(JobApplicant jobApplicant, JobEvaluation jobEvaluation) {
        return null;
    }

    /**
     * @param jobApplicant
     * @param jobEvaluation
     * @param jobApplicantEvaluationQuestion
     * @return
     */
    @Override
    public JobApplicantEvaluationQuestion updateJobApplicantEvaluationQuestion(JobApplicant jobApplicant, JobEvaluation jobEvaluation, JobApplicantEvaluationQuestion jobApplicantEvaluationQuestion) {
        return null;
    }
}
