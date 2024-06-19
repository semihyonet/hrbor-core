package com.karpco.havegan.entity.jobs;

import com.karpco.havegan.entity.BaseEntityAudit;
import com.karpco.havegan.entity.core.Organization;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@Entity
@Table(name = "job")
public class Job extends BaseEntityAudit {
    @Column(nullable = false, name = "name")
    private String name;

    @OneToMany(mappedBy = "job")
    private ArrayList<JobApplicant> jobApplicants;

    @ManyToOne
    private Organization organization;

    @OneToMany(mappedBy = "job")
    private List<JobEvaluation> jobEvaluations;
}