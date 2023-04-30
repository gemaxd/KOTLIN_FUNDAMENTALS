package patterns.adapter.model

import patterns.adapter.adapters.MediaAdapter
import patterns.adapter.interfaces.MediaPlayer

class AudioPlayer(
    audioType: String = "mp4"
) : MediaPlayer {
    private val mediaAdapter: MediaAdapter = MediaAdapter(audioType)

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "mp3" -> println("Playing MP3 file: $fileName")
            "vlc", "mp4" -> mediaAdapter.play(audioType, fileName)
            else -> throw IllegalArgumentException("Invalid media type")
        }
    }
}