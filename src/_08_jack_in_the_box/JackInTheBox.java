package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class JackInTheBox implements ActionListener {
	JButton button = new JButton();
	int buttonClicked = 0;
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		button.setText("Suprise");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		buttonClicked ++;
		if (buttonClicked == 5) {
			showPicture("jackInTheBox.png");
			createLabelImage("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
		
	}
	
	
	private void showPicture(String jackInTheBox) { 
	     try {
	          JLabel imageLabel = createLabelImage("jackInTheBox.png");
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String jackInTheBox) {
	     try {
	          URL imageURL = getClass().getResource("jackInTheBox.png");
	          if (imageURL == null) {
	               System.err.println("Could not find image " + "jackInTheBox.png");
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + "jackInTheBox.png");
	          return new JLabel();
	     }
	}
	
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
