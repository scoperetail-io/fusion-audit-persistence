package com.scoperetail.fusion.audit.persistence.repository;

import com.scoperetail.fusion.audit.persistence.entity.MessageLogKeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageLogKeyRepository extends JpaRepository<MessageLogKeyEntity, String> {
}
