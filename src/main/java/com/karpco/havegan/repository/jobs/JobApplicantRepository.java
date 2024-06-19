package com.karpco.havegan.repository.jobs;

import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.jobs.Job;
import com.karpco.havegan.entity.jobs.JobApplicant;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface JobApplicantRepository extends Repository<JobApplicant, String> {
    public JobApplicant findById(UUID id);

}
