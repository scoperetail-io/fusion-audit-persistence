/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.audit.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scoperetail.fusion.audit.persistence.entity.MessageLogKeyEntity;

@Repository
public interface MessageLogKeyRepository extends JpaRepository<MessageLogKeyEntity, String> {}
