package _09_sound_effects_machine;

import java.applet.AudioClip;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

@SuppressWarnings("deprecation")
public class SoundEffectsMachine implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		JButton leftButton = new JButton();
		JButton rightButton = new JButton();
		panel.add(leftButton);
		panel.add(rightButton);
		frame.add(panel);
		frame.pack();
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		playSound("sawing-wood-daniel_simon.wav");
	}

	private void playSound(String fileName) {
		
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();

//		try {
//			File musicPath = new File(fileName);
//			
//			if (musicPath.exists()) {
//				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
//				Clip clip = AudioSystem.getClip();
//				JOptionPane.showMessageDialog(null, "Press OK to stop playing");
//				
//			} else {
//				System.out.println("Can't find file");
//			}
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		}
	}
}