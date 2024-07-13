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

    @ManyToOne
    private Job job;

    @Column(name = "order_number")
    private short order = 0;

    @Column(nullable = false, name = "job_evaluation_type")
    private JobEvaluationTypeEnum jobEvaluationTypeEnum;

    @OneToMany(mappedBy = "jobEvaluation")
    private ArrayList<JobApplicantEvaluation> jobApplicantEvaluations;
}