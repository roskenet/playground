package de.felixroske.actinium

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ArtistApi {

    @GetMapping("/artists")
    fun getArtists(): List<Artist> = listOf(
        Artist("Amy Winehouse", 1983),
        Artist("Elvis Presley", 1935)
    )

}