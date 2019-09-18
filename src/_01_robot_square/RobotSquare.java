package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot jackie=new Robot( );

        // 3. Put the robot's pen down
jackie.penDown();

        // 6. Make the robot move as fast as possible
jackie.setSpeed(17);
int sides=0;
        // 5. Do everything below here 4 times
while(sides<4) {
jackie.setRandomPenColor();


jackie.move(100);
jackie.turn(90);
sides=sides+1;
}}
}


