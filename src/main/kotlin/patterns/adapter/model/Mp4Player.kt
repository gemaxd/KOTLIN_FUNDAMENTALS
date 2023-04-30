package patterns.adapter.model

import patterns.adapter.interfaces.AdvancedMediaPlayer

class Mp4Player : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        // Não faz nada
    }

    override fun playMp4(fileName: String) {
        println("Playing MP4 file: $fileName")
    }
}