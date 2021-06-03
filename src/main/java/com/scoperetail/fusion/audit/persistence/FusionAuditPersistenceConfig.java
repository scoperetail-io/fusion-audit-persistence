package com.scoperetail.fusion.audit.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.scoperetail.fusion.audit.persistence.repository")
@EntityScan(basePackages = "com.scoperetail.fusion.audit.persistence.entity")
public class FusionAuditPersistenceConfig {
}
