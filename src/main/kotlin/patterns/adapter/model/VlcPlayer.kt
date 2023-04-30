package patterns.adapter.model

import patterns.adapter.interfaces.AdvancedMediaPlayer

class VlcPlayer : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        println("Playing VLC file: $fileName")
    }

    override fun playMp4(fileName: String) {
        // Não faz nada
    }
}