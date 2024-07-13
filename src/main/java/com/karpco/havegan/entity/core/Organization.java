package com.karpco.havegan.entity.core;

import com.karpco.havegan.entity.BaseEntityAudit;
import com.karpco.havegan.entity.jobs.Job;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@Entity
@Table(name = "organization")
public class Organization extends BaseEntityAudit {

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = true, name = "logo_url")
    private String logo_url;

    @ManyToMany
    @JoinTable(
            name = "organization_users",
            joinColumns = @JoinColumn(name = "organization_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

    @OneToMany(mappedBy = "organization")
    private List<OrganizationInvite> organizationInvites;

    @OneToMany(mappedBy = "organization")
    private List<Job> jobs;
}