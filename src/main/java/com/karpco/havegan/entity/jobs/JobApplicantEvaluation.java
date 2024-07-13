package com.karpco.havegan.entity.jobs;

import com.karpco.havegan.entity.BaseEntityAudit;
import com.karpco.havegan.enums.jobs.JobEvaluationTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter
@Getter
@Entity
@Table(name = "job_applicant_evaluation")
public class JobApplicantEvaluation extends BaseEntityAudit {
    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "job_evaluation_type")
    private JobEvaluationTypeEnum jobEvaluationTypeEnum;

    @ManyToOne
    private JobApplicant jobApplicant;

    @OneToMany(mappedBy = "jobApplicantEvaluation")
    private ArrayList<JobApplicantEvaluationQuestion> jobApplicantEvaluationQuestions;

    @ManyToOne
    private JobEvaluation jobEvaluation;
}

