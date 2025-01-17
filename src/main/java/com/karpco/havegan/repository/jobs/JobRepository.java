package com.karpco.havegan.repository.jobs;

import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.jobs.Job;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface JobRepository extends Repository<Job, String> {
    public Job findById(UUID id);

    public List<Job> findJobsByOrganization(Organization organization);

    public Job save(Job job);
}
