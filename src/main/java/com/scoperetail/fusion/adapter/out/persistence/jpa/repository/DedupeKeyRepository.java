/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.adapter.out.persistence.jpa.repository;

import com.scoperetail.fusion.adapter.out.persistence.jpa.entity.MessageLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DedupeKeyRepository extends JpaRepository<MessageLogEntity, String> {}
