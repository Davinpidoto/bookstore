package db.migration

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration
import org.springframework.jdbc.core.JdbcTemplate

class V1_3__insert_book_types implements SpringJdbcMigration {

  void migrate(JdbcTemplate jdbcTemplate) throws Exception {
    jdbcTemplate.execute("INSERT INTO book_types (id, type) VALUES(1, 'Hard Cover')")
    jdbcTemplate.execute("INSERT INTO book_types (id, type) VALUES(2, 'Soft Cover')")
  }
}
