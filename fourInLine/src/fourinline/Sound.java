/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fourinline;

/**
 *
 * @author henrydiazlds
 */
import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {
	public static final AudioClip CHIP = Applet.newAudioClip(Sound.class.getResource("chip.wav"));
	public static final AudioClip LOSER = Applet.newAudioClip(Sound.class.getResource("loser.wav"));
        public static final AudioClip WINNER = Applet.newAudioClip(Sound.class.getResource("winner.wav"));
	public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("back.wav"));
}
