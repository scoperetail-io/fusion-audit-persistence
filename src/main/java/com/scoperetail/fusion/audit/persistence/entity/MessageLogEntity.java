package com.scoperetail.fusion.audit.persistence.entity;

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
  private String transportType; //JMS,  REST,  MAIL,  KAFKA

  @Column(name = "audit_type", nullable = false)
  private String auditType; //IN, OUT

  @Column(name = "result", nullable = false)
  private String result; //SUCCESS,  FAILURE

  @Column(name = "outcome", nullable = false)
  private String
      outcome; // COMPLETE,  ONLINE_RETRY_START,  ONLINE_RETRY_IN_PROGRESS,  OFFLINE_RETRY_START,  OFFLINE_RETRY_IN_PROGRESS

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
