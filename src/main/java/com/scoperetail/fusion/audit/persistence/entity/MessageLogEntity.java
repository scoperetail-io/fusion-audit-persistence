/* ScopeRetail (C)2021 */
package com.scoperetail.fusion.audit.persistence.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.*;

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

  @Column(name = "source_ts", nullable = false)
  private LocalDateTime sourceTs;

  @Column(name = "payload", nullable = false)
  private String payload;

  @Column(name = "status_code", nullable = false)
  private Integer statusCode;

  @Column(name = "create_ts")
  private LocalDateTime createTs;
}
