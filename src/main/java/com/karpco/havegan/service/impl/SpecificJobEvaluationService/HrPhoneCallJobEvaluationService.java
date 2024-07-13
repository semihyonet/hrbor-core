package com.karpco.havegan.service.impl.SpecificJobEvaluationService;

import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import com.karpco.havegan.entity.jobs.JobApplicantEvaluationQuestion;
import com.karpco.havegan.service.SpecificJobEvaluationService;
import org.springframework.stereotype.Service;

@Service
public class HrPhoneCallJobEvaluationService implements SpecificJobEvaluationService {
    /**
     * @param job
     * @param jobApplicant
     * @return
     */
    @Override
    public JobApplicantEvaluationQuestion generate(Job job, JobApplicant jobApplicant) {
        return null;
    }

    /**
     * @param jobApplicantEvaluationQuestion
     * @return
     */
    @Override
    public int evaluate(JobApplicantEvaluationQuestion jobApplicantEvaluationQuestion) {
        return 0;
    }
}
