package com.karpco.havegan.entity.core;

import com.karpco.havegan.entity.BaseEntityAudit;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@Entity
@Table(name = "organization_invite")
public class OrganizationInvite extends BaseEntityAudit {
    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "is_accepted")
    private boolean isAccepted = false;

    @Timestamp
    @Column(nullable = false, name = "expires_at")
    private Date expires_at;

    @ManyToOne
    private Organization organization;
}