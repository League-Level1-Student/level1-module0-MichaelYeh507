package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public static void run() {
		rob.setX(50);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(10);
		rob.setRandomPenColor();
		rob.move(80);
		roof();
		rob.move(80);
		turn();
		
		rob.move(200);
		rob.turn(90);
		rob.move(15);
		rob.turn(90);
		rob.move(200);
		turn();
		
		rob.move(40);
		roof();rob.move(40);
		turn();
		
		rob.move(100);
		flat_roof();
		rob.move(100);
		turn();
		
		rob.move(60);
		roof();
		rob.move(60);
		turn();
		
		rob.move(120);
		flat_roof();
		rob.move(120);
		turn();
		
		rob.move(40);
		roof();
		rob.move(40);
		turn();
		
		rob.move(150);
		flat_roof();
		rob.move(150);
		turn();
		
		rob.move(110);
		flat_roof();
		rob.move(110);
	}
	public static void main(String[] args) {
		run();
	}

	public static void turn() {
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(10);
		rob.turn(-90);
		rob.setRandomPenColor();
	}

	public static void roof() {
		rob.turn(45);
		rob.move(10);
		rob.turn(90);
		rob.move(10);
		rob.turn(45);
	}
	
	public static void flat_roof() {
		rob.turn(90);
		rob.move(15);
		rob.turn(90);
	}
}
