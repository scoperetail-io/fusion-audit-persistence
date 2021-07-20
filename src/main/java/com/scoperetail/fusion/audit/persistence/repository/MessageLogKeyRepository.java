package com.scoperetail.fusion.audit.persistence.repository;

/*-
 * *****
 * fusion-audit-persistence
 * -----
 * Copyright (C) 2018 - 2021 Scope Retail Systems Inc.
 * -----
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =====
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.scoperetail.fusion.audit.persistence.entity.MessageLogKeyEntity;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface MessageLogKeyRepository extends JpaRepository<MessageLogKeyEntity, String> {
  @Query(name = "delete.message.log.key")
  @Modifying
  @Transactional
  Integer deleteMessageLogKey(@Param("logKeyList") List<String> logKeyList);
}
