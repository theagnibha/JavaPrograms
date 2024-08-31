package Javapractise;

import java.lang.*;
import java.util.*;

public class Cuboid {

	public static void main(String[] args) {
		int length, height, breadth;
		int totalArea, volume;

		System.out.println("enter length,height,breadth of a cuboid:");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		height = sc.nextInt();
		breadth = sc.nextInt();

		totalArea = 2 * (length * height + length * breadth + breadth * height);
		System.out.println("the total area of the cuboid is: " + totalArea);

		volume = (length * breadth * height);
		System.out.println("the volume of the cuboid is: " + volume);

	}

}
