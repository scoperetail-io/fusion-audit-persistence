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

import javax.persistence.*;
import lombok.*;
import org.springframework.data.domain.Persistable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "message_log_key")
public class MessageLogKeyEntity implements Persistable {
  @Id
  @Column(name = "log_key", nullable = false)
  private String logKey;

  @Column(name = "k01")
  private String k01;

  @Column(name = "k02")
  private String k02;

  @Column(name = "k03")
  private String k03;

  @Column(name = "k04")
  private String k04;

  @Column(name = "k05")
  private String k05;

  @Override
  public Object getId() {
    return logKey;
  }

  @Override
  public boolean isNew() {
    return true;
  }}
