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
@Table(name = "job_evaluation")
public class JobEvaluation extends BaseEntityAudit {
    @Column(nullable = false, name = "name")
    private String name;

    @ManyToOne
    private Job job;

    @Column(nullable = false, name = "job_evaluation_type")
    private JobEvaluationTypeEnum jobEvaluationTypeEnum;

    @ManyToOne
    private JobApplicant jobApplicant;

    @OneToMany(mappedBy = "jobEvaluation")
    private ArrayList<JobApplicantEvaluationQuestion> jobApplicantEvaluationQuestion;
}

