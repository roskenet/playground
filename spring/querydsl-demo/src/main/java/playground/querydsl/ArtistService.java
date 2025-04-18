package playground.querydsl;

import com.querydsl.core.BooleanBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArtistService {

    public static class SearchParams {
        public String name;
    }

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getFiltered(SearchParams params) {
        QArtist qArtist = QArtist.artist;

        BooleanBuilder predicate = new BooleanBuilder();
        predicate.and(qArtist.name.eq(params.name));

        return StreamSupport
                .stream(artistRepository
                        .findAll(predicate.getValue())
                        .spliterator(), false)
                .collect(Collectors.toList());
    }
}
