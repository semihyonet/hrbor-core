package com.karpco.havegan.entity.jobs;

import com.karpco.havegan.entity.BaseEntityAudit;
import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.enums.jobs.JobApplicationStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter
@Getter
@Entity
@Table(name = "job_applicant")
public class JobApplicant extends BaseEntityAudit {
    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "surname")
    private String surname;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "application_status")
    private JobApplicationStatusEnum applicationStatus;

    @ManyToOne
    private Job job;

    @OneToMany(mappedBy="jobApplicant")
    private ArrayList<JobApplicantEvaluation> jobApplicantEvaluations;
}
