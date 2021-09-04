package com.scoperetail.fusion.audit.persistence.repository;

/*-
 * *****
 * fusion-audit-persistence
 * -----
 * Copyright (C) 2018 - 2021 Scope Retail Systems Inc.
 * -----
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====
 */

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.scoperetail.fusion.audit.persistence.entity.MessageLogEntity;

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

  @Query(name = "message.log.keys.to.erase")
  List<String> findLogKeysToErase(@Param("pivoteDate") LocalDateTime pivoteDate, Pageable pageable);

  @Query(name = "delete.message.log")
  @Modifying
  @Transactional
  Integer deleteMessageLog(@Param("logKeyList") List<String> logKeyList);
}
