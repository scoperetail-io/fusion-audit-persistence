/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.adapter.out.persistence.jpa.repository;

import com.scoperetail.fusion.adapter.out.persistence.jpa.entity.DedupeKeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface DedupeKeyRepository extends JpaRepository<DedupeKeyEntity, String> {
  @Transactional
  @Modifying
  @Query(name = "dedupeKey.jpa.insert", nativeQuery = true)
  Integer insertIfNotExist(@Param("logKey") String logKey);
}
