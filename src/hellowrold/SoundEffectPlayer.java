package hellowrold;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class SoundEffectPlayer {

    public void playSound(String soundFilePath) {
        try {
            URL soundFile = getClass().getResource(soundFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
