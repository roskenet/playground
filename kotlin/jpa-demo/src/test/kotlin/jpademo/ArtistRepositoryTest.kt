package jpademo

import jakarta.transaction.Transactional
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class ArtistRepositoryTest {

    @Autowired
    lateinit var artistRepository: ArtistRepository

    @Test
    @Transactional
    fun testInsertArtist() {
        // Let's save Michael:
        val michaelJackson = Artist(name = "Michael Jackson")
        artistRepository.save(michaelJackson)

        // We get all artists:
        val allArtists = artistRepository.findAll()

        // There should only be one:
        assertThat(allArtists.count()).isEqualTo(1)
    }
}