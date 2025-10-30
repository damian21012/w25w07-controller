package kr.ac.kumoh.s20220809.w25w07_controller.repository

import kr.ac.kumoh.s20220809.w25w07_controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = listOf(
        Song(1, "Golden", "HUNTR/X"),
        Song(2, "Blue Valentine", "NMIXX"),
        Song(3, "타입캡슐", "다비치"),
    )

    fun findAll() = songs
}