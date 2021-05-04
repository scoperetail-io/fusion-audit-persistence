package com.scoperetail.fusion.audit.persistence.repository;

import com.scoperetail.fusion.audit.persistence.entity.MessageLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageLogRepository extends JpaRepository<MessageLogEntity, Long> {
}
