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
@Table(name = "dedupe_key")
public class DedupeKeyEntity {
  @Id
  @Column(name = "log_key", nullable = false)
  private String logKey;

  @Column(name = "create_ts")
  private LocalDateTime createTs;
}
