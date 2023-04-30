package patterns.adapter.adapters

import patterns.adapter.interfaces.AdvancedMediaPlayer
import patterns.adapter.interfaces.MediaPlayer
import patterns.adapter.model.Mp4Player
import patterns.adapter.model.VlcPlayer

class MediaAdapter(audioType: String) : MediaPlayer {
    private val advancedMediaPlayer: AdvancedMediaPlayer

    init {
        advancedMediaPlayer = when (audioType) {
            "vlc" -> VlcPlayer()
            "mp4" -> Mp4Player()
            else -> throw IllegalArgumentException("Invalid media type")
        }
    }

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "vlc" -> {
                advancedMediaPlayer.playVlc(fileName)
            }
            "mp4" -> {
                advancedMediaPlayer.playMp4(fileName)
            }
            else -> throw IllegalArgumentException("Invalid media type")
        }
    }
}