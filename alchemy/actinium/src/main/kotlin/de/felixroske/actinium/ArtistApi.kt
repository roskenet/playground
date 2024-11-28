package de.felixroske.actinium

import org.springframework.beans.factory.annotation.Value
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ArtistApi {

    @Value("\${scope.read}")
    private lateinit var scope: String

    @GetMapping("/artists")
    @PreAuthorize("hasAuthority(@scope)")
    fun getArtists(): List<Artist> = listOf(
        Artist("Amy Winehouse", 1983),
        Artist("Elvis Presley", 1935)
    )

}