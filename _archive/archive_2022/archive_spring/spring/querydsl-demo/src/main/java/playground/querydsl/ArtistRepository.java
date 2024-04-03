package playground.querydsl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.UUID;

public interface ArtistRepository extends JpaRepository<Artist, UUID>,
        QuerydslPredicateExecutor<Artist> {

}
