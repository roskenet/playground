package jpademo.config

import io.zonky.test.db.postgres.embedded.EmbeddedPostgres
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DatasourceConfig {
    @Bean
    fun dataSource(): DataSource {
        return EmbeddedPostgres.builder().start().postgresDatabase
    }
}