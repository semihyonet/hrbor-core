package com.karpco.havegan.service;

import com.karpco.havegan.dto.jobs.CreateJobRequest;
import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.jobs.Job;

import java.util.List;
import java.util.UUID;

public interface JobService {
    public Job getJob(UUID id);

    public List<Job> getJobs(Organization organization);

    public Job createJob(CreateJobRequest request, Organization currentOrganization);
}
