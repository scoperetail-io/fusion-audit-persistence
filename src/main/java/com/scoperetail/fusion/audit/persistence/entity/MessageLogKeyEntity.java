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
