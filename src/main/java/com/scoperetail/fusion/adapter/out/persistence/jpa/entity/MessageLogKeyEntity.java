/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.adapter.out.persistence.jpa.entity;

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
