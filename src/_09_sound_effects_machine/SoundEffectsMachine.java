package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
	}
}
