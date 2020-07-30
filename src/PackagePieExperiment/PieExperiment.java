package PackagePieExperiment;

import java.util.Scanner;

public class PieExperiment {

	static double diag;
	static double diagLenth;
	static double area;
	static double diameter = 1;
	static double radius = .5;
	static double pie;
	static double SqArea = 1;
    
	//Method to calcuate the area ratio
	public void getAreaRatio(double a, double b) {
		System.out.println("The Four coordiantes of the square are mentioned below :-");
		System.out.println("(" + a + " , " + b + ") , (" + a + " , " + (b + 1) + ")" + " , (" + (a + 1) + " , "
				+ (b + 1) + ") , (" + (a + 1) + " , " + b + ") ");
		diag = (((a + 1) - a) * ((a + 1) - a)) + (((b + 1) - b) * ((b + 1) - b));
		diagLenth = Math.sqrt(diag);
		System.out.println("Centre of the circle is => (" + (a + .5) + " , " + (b + .5) + ")");
		System.out.println("Length of square's diagonal is => " + diagLenth);
		System.out.println("Area of square is => " + SqArea);
		System.out.println("Area of circle is => pie * " + radius * radius);
		// above is the common dimension for all the methods
		System.out.println("Area of circle divided by area of square");
		System.out.println("The ratio of the areas is => pie * " + radius * radius);

	}
	
    //Method to calculate the probablity
	public void getProbab(double a, double b) {
		System.out.println("The Four coordiantes of the square are mentioned below :-");
		System.out.println("(" + a + " , " + b + ") , (" + a + " , " + (b + 1) + ")" + " , (" + (a + 1) + " , "
				+ (b + 1) + ") , (" + (a + 1) + " , " + b + ") ");
		diag = (((a + 1) - a) * ((a + 1) - a)) + (((b + 1) - b) * ((b + 1) - b));
		diagLenth = Math.sqrt(diag);
		System.out.println("Centre of the circle is => (" + (a + .5) + " , " + (b + .5) + ")");
		System.out.println("Length of square's diagonal is => " + diagLenth);
		System.out.println("Area of square is => " + SqArea);
		System.out.println("Area of circle is => pie * " + radius * radius);
		// above is the common dimension for all the methods
		System.out.println("Probablity that the random point from within the square will also be inside the circle\n");
		System.out.println("Probablity = Area of circle/Area of square\n");
		System.out.println("Probablity = pie * " + radius * radius);
	}
	
    //Method to perform the experiment
	public void perforExp(double a, double b) {
		System.out.println("The Four coordiantes of the square are mentioned below :-");
		System.out.println("(" + a + " , " + b + ") , (" + a + " , " + (b + 1) + ")" + " , (" + (a + 1) + " , "
				+ (b + 1) + ") , (" + (a + 1) + " , " + b + ") ");
		diag = (((a + 1) - a) * ((a + 1) - a)) + (((b + 1) - b) * ((b + 1) - b));
		diagLenth = Math.sqrt(diag);
		System.out.println("Centre of the circle is => (" + (a + .5) + " , " + (b + .5) + ")");
		System.out.println("Length of square's diagonal is => " + diagLenth);
		System.out.println("Area of square is => " + SqArea);
		System.out.println("Area of circle is => pie * " + radius * radius);
		// above is the common dimension for all the methods
		double xCentre = a + .5;
		double yCentre = b + .5;
		System.out.println("\nInstructions for the Experiment is given below :- \n");
		System.out.println("How manny times do you want to run the experiment\n");
		Scanner expObj = new Scanner(System.in);
		int attempts = expObj.nextInt();
		System.out.println("You will perform the Experiment " + attempts + " times");
		System.out.println(
				"Choose a point which is inside the the square.\nBelow mentioned are the cordinates of the selected square :- \n");
		System.out.println("(" + a + " , " + b + ") , (" + a + " , " + (b + 1) + ")" + " , (" + (a + 1) + " , "
				+ (b + 1) + ") , (" + (a + 1) + " , " + b + ") ");
		double inCircle = 0;
		double onCircle = 0;
		double outCircle = 0;
		double result = 0;
		for (int counter = 1; counter < attempts + 1; counter++) {
			double xChosen = (a + (Math.random() * 1));
			double yChosen = (b + (Math.random() * 1));

			double dist = (((xChosen - xCentre) * (xChosen - xCentre)) + ((yChosen - yCentre) * (yChosen - yCentre)));
			double totalDist = Math.sqrt(dist);
			if (totalDist < radius) {
				//System.out.println("\n point is within the circle");
				inCircle = inCircle + 1;
				//System.out.println("( " + xChosen + " ) , ( " + yChosen + " )");
				//System.out.println("( " + xCentre + " ) , ( " + yCentre + " )");
				//System.out.println("Total distance =>" + totalDist);
				//System.out.println("radius =>" + radius);

			} else if (totalDist > radius) {
				//System.out.println("\n point is outside the circle");
				outCircle = outCircle + 1;
				//System.out.println("( " + xChosen + " ) , ( " + yChosen + " )");
				//System.out.println("( " + xCentre + " ) , ( " + yCentre + " )");
				//System.out.println("Total distance =>" + totalDist);
				//System.out.println("radius =>" + radius);

			} else {
				//System.out.println("\n point is on the circle");
				onCircle = onCircle + 1;
				//System.out.println("( " + xChosen + " ) , ( " + yChosen + " )");
				//System.out.println("( " + xCentre + " ) , ( " + yCentre + " )");
				//System.out.println("Total distance =>" + totalDist);
				//System.out.println("radius =>" + radius);

			}

			if (counter == attempts) {
				System.out.println("You have completed the attempts");
			}
		}
		System.out.println("No of points inside the Circle => " + inCircle);
		System.out.println("No of points on the Circle => " + onCircle);
		System.out.println("No of points outside the Circle => " + outCircle);
		System.out.println("Total points are => " + attempts);
		result = inCircle / attempts;
		System.out.println("Ratio of the points within the circle to the points within the square => " +result);
		System.out.println("The value of pie is => " + (result * 4));

	}

	public static void main(String args[]) {
		String[] options = { "1)What is the ratio of the areas of the inscribed circle to that of the unit square?",
				"2)If we pick a random point within the unit square what is the probability that the point will also lie within the circle?",
				"3)Perform the an experiment arbitrary (determined at run-time) number of times and report back the approximate value of pie." };

		System.out.println("A circle is inscribed within a unit square.\nChoose the starting cordinates.\n");

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the X cordinate of the bottom left corner of the square");
		double xCord = myObj.nextDouble();
		System.out.println("Enter the Y cordinate of the bottom left corner of the square");
		double yCord = myObj.nextDouble();
		System.out.println("Chosen X and Y coordinates are ( " + xCord + " , " + yCord+" )");
		System.out.println("\nConsider the following questions:\n");
		for (int i = 0; i < options.length; i++) {
			System.out.println(options[i]);
		}
		System.out.println("\nSelect an option from the above three to proceed");
		int entrdOpt = myObj.nextInt();
		System.out.println("\nThe Chosen option is " + entrdOpt);
		PieExperiment calObj = new PieExperiment();
		if (entrdOpt == 1) {
			calObj.getAreaRatio(xCord, yCord);

		} else if (entrdOpt == 2) {
			calObj.getProbab(xCord, yCord);

		} else if (entrdOpt == 3) {
			calObj.perforExp(xCord, yCord);
		} else {
			System.out.println("Your selection is not in the given options");
		}

	}

}
