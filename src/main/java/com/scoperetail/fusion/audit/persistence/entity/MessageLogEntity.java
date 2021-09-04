package com.scoperetail.fusion.audit.persistence.entity;

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

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "message_log")
public class MessageLogEntity {
  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "transport_type", nullable = false)
  private String transportType;

  @Column(name = "audit_type", nullable = false)
  private String auditType;

  @Column(name = "result", nullable = false)
  private String result;

  @Column(name = "outcome", nullable = false)
  private String outcome;

  @Column(name = "log_key", nullable = false)
  private String logKey;

  @Column(name = "event_id", nullable = false)
  private String eventId;

  @Column(name = "source_ts", nullable = false)
  private LocalDateTime sourceTs;

  @Column(name = "payload", nullable = false)
  private String payload;

  @Column(name = "status_code", nullable = false)
  private Integer statusCode;

  @Column(name = "create_ts")
  private LocalDateTime createTs;
}
