package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
	String animal = "";
	String rept = "";
	for (int i = 0; i < 10; i++) {
			try {
				Desktop.getDesktop().browse(new URI("https://youtu.be/dQw4w9WgXcQ"));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				wait(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Desktop.getDesktop().browse(new URI("https://youtu.be/dQw4w9WgXcQ"));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Desktop.getDesktop().browse(new URI("https://youtu.be/dQw4w9WgXcQ"));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/* 2. Make it so that the user can keep entering new animals. */
	for (int rep = 0; rep == 0; ) {
		animal = JOptionPane.showInputDialog("WHAT ANIMAL (cow, duck or duggo)");
		if(animal.equals("cow")) {
			playMoo();
		}else if(animal.equals("duck")) {
			playQuack();
		}else {
			playWoof();
		}
		
		rept = JOptionPane.showInputDialog("repeat? (y for yes)");
		if(rept.equals("y")) {
			rep = 0;
		}else {
			rep = 1;
		}
	}
}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

