/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.adapter.out.persistence.jpa.repository;

import com.scoperetail.fusion.adapter.out.persistence.jpa.entity.MessageLogEntity;
import java.time.LocalDateTime;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageLogRepository extends JpaRepository<MessageLogEntity, Integer> {
  @Transactional
  @Modifying
  @Query(name = "messageLog.jpa.insert", nativeQuery = true)
  Integer insertIfNotExist(
      @Param("logKey") String logKey,
      @Param("eventId") String eventId,
      @Param("sourceTs") LocalDateTime sourceTs,
      @Param("payload") String payload,
      @Param("statusCode") Integer statusCode);

  @Query(name = "messageLog.jpa.findByLogKey")
  Optional<MessageLogEntity> findByLogKey(@Param("logKey") String logKey);
}
