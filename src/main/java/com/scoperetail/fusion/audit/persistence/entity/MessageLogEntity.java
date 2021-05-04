package com.scoperetail.fusion.audit.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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

  @Column(name = "log_key", nullable = false)
  private String logKey;

  @Column(name = "event_id", nullable = false)
  private String eventId;

  @Column(name = "payload", nullable = false)
  private String payload;

  @Column(name = "message_status", nullable = false)
  private Integer messageStatus;

  @Column(name = "duplicate_cnt")
  private Integer duplicateCnt;

  @Column(name = "create_ts")
  private LocalDateTime createTs;

  @Column(name = "mark_delete")
  private String markDelete;
}
