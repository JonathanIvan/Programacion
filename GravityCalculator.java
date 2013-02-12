package JAVA;

public class GravityCalculator {
	public static void main(String[] arguments) {

		double gravity = 9.81;  // Earth's gravity in m/s^
		double gravitysol = 273.61;
		double gravitylun = 1.62;
		double gravitymer = 3.70;
		double gravitymar = 3.72;
		double gravityvenu = 8.85;
		double initialVelocity = 0.0;

		double fallingTime = 10.0;

		double initialPosition = 0.0;

		double finalPosition = 0.5 * (gravity*(fallingTime*fallingTime))+ initialVelocity *(fallingTime) + initialPosition;
		double finalPositionsol = 0.5 * (gravitysol*(fallingTime*fallingTime))+ initialVelocity *(fallingTime) + initialPosition;
		double finalPositionlun = 0.5 * (gravitylun*(fallingTime*fallingTime))+ initialVelocity *(fallingTime) + initialPosition;
		double finalPositionmer = 0.5 * (gravitymer*(fallingTime*fallingTime))+ initialVelocity *(fallingTime) + initialPosition;
		double finalPositionmar= 0.5 * (gravitymar*(fallingTime*fallingTime))+ initialVelocity *(fallingTime) + initialPosition;
		double finalPositionvenu = 0.5 * (gravityvenu*(fallingTime*fallingTime))+ initialVelocity *(fallingTime) + initialPosition;

		System.out.println("The object's position after " + fallingTime +" seconds is " + finalPosition + " m. Eart");
		System.out.println("The object's position after " + fallingTime +" seconds is " + finalPositionsol + " m. The Sun");
		System.out.println("The object's position after " + fallingTime +" seconds is " + finalPositionlun + " m. The Moon");
		System.out.println("The object's position after " + fallingTime +" seconds is " + finalPositionmer + " m. Mercury");
		System.out.println("The object's position after " + fallingTime +" seconds is " + finalPositionmar + " m. Mars");
		System.out.println("The object's position after " + fallingTime +" seconds is " + finalPositionvenu + " m. Venus");
		System.out.println ("NAVISOUND");
		}


}
