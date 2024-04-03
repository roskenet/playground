package jpademo

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.Instant
import java.util.UUID

@Entity
data class Artist (
    @Id
    var id: UUID = UUID.randomUUID(),
    var name: String = "",
    @CreatedDate
    @Column(name = "created_at")
    var created_at: Instant = Instant.now(),
    @LastModifiedDate
    @Column(name = "last_modified_at")
    var last_modified_at: Instant = Instant.now()
)