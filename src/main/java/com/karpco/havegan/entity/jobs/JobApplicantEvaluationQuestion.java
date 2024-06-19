package com.karpco.havegan.entity.jobs;

import com.karpco.havegan.entity.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "job_applicant_evaluation_question")
public class JobApplicantEvaluationQuestion extends BaseEntityAudit {
    @Column(nullable = false, name = "name")
    private String question;

    @Column(nullable = true, name = "answer")
    private String answer = "NA";

    @ManyToOne
    private JobEvaluation jobEvaluation;
}

