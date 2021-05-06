/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.adapter.out.persistence.jpa.repository;

import com.scoperetail.fusion.adapter.out.persistence.jpa.entity.MessageLogKeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageLogKeyRepository extends JpaRepository<MessageLogKeyEntity, String> {}
