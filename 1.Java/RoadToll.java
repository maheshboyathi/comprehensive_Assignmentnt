package SDET_Task;

public class RoadToll {
	
		// Member variables
		private String typeOfVehicle;
		private int numberOfTires;

		// Constructor

		public RoadToll(String typeOfVehicle, int numberOfTires) {

			this.typeOfVehicle = typeOfVehicle;

			this.numberOfTires = numberOfTires;

		}
		// Method to calculate Road Toll

		public int calculateRoadToll() {

			if (numberOfTires == 2) {

				return 0;

			} else if (numberOfTires == 4) {

				return 50;

			} else {

				return 100;
			}
		}
		public static void main(String[] args) {

			// Create an object and call the corresponding methods

			RoadToll vehicle1 = new RoadToll("bike", 2);

			RoadToll vehicle2 = new RoadToll("car", 4);

			RoadToll vehicle3 = new RoadToll("truck", 6);

			System.out.println("Toll for " + vehicle1.typeOfVehicle + " with " + vehicle1.numberOfTires + " tires : Rs " + vehicle1.calculateRoadToll());

			System.out.println("Toll for " + vehicle2.typeOfVehicle + " with " + vehicle2.numberOfTires + " tires : Rs " + vehicle2.calculateRoadToll());

			System.out.println("Toll for " + vehicle3.typeOfVehicle + " with " + vehicle3.numberOfTires + " tires : Rs " + vehicle3.calculateRoadToll());

		}

	}


