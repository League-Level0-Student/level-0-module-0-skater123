package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffeti {
public static void main(String[] args) {
	Robot Mendoza= new Robot();

	Mendoza.setSpeed(20);
	Mendoza.penDown();
	Mendoza.miniaturize();
	Mendoza.turn(45);
Mendoza.move(69);

Mendoza.turn(90);
	Mendoza.move(69);
Mendoza.turn(180);
Mendoza.move(40);
Mendoza.turn(-60);
Mendoza.move(45);
Mendoza.sparkle();
}}