package com.karpco.havegan.repository;


import com.karpco.havegan.entity.core.Organization;
import com.karpco.havegan.entity.core.User;
import org.springframework.data.repository.Repository;

import java.util.UUID;


public interface OrganizationRepository extends Repository<Organization, String> {
    Organization save(User user);

    Organization findById(UUID id);
}
