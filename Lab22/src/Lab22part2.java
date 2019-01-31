/*
 * Keven Disen
 * ID: 111433335
 * December 5, 2018
 * CSE 114 Lab# 22 part 2
 */
import java.util.*;
	abstract class Vehicle{
		private String ownerName;
		private int wheels;
		public Vehicle() {
		}
		public Vehicle(String name, int wheels) {
			this.ownerName = name;
			this.wheels = wheels;
		}
		public abstract String getOwnerName();
		public abstract int getNumWheels();
	}
	class Bicycle extends Vehicle{
		private String ownerName;
		private int wheels;
		public Bicycle() {
		}
		public Bicycle(String owner) {
			ownerName = owner;
			wheels =2;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public int getNumWheels() {
			return wheels;
		}
	}
	class MotorizedVehicle extends Vehicle{
		private String ownerName;
		private int wheels;
		private double engineVolume;
		public MotorizedVehicle() {
		}
		public MotorizedVehicle(String name, int wheels, double engineVolume) {
			this.ownerName = name;
			this.wheels = wheels;
			this.engineVolume = engineVolume;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public int getNumWheels() {
			return wheels;
		}
		public double getEngineVolumeDisplacement() {
			return engineVolume;
		}
		public double getHorsePower() {
			double horsePower = engineVolume * wheels;
			return horsePower;
		}
	}
	public class Lab22part2 {
	public static void main(String[] args) {
			//Bicycle
			  System.out.println("Bicycle");
			  Bicycle bc = new Bicycle("Keven");
			  System.out.println("Owner = " + bc.getOwnerName());
			  System.out.println("Number of Wheels = "+bc.getNumWheels());
			  
			  System.out.println();
			 //Motorized Vehicle
			  System.out.println("Motorized Vehicle");
			  MotorizedVehicle mv = new MotorizedVehicle("Jose", 4, 3.5);
			  System.out.println("Vehicle owner = "+mv.getOwnerName());
			  System.out.println("Wheels = "+mv.getNumWheels());
			  System.out.println("Engine Volume Displacement = "+mv.getEngineVolumeDisplacement() + " liters");
			  System.out.println("Horse Power = "+mv.getHorsePower());

	}
}
