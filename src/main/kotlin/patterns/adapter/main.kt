package patterns.adapter

import patterns.adapter.model.AudioPlayer

fun main() {
    val player = AudioPlayer()
    player.play(audioType = "mp4", fileName = "Dream on.." )
}