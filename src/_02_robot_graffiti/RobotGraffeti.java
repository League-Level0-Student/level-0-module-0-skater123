package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffeti {
public static void main(String[] args) {
	Robot Mendoza= new Robot();

	
	Mendoza.penDown();
	Mendoza.miniaturize();
	Mendoza.turn(45);
Mendoza.move(24);
	Mendoza.move(45);
	Mendoza.turn(90);
	Mendoza.turn(45);
	Mendoza.turn(90);
	Mendoza.turn(45);
}


}