/*
    Naval Sharma
    A00241484

		This main class is used to create die of your choice and then call the roll
		function on it to get random values

		The bonus part is included which creates  5 six sided dies and roll them
		until all  one a kind values appear on all the dices and print the number of attempts it took to achieve that

*/


import java.util.*;
import java.lang. *;

public class DiceGame
{
	public static void main(String[] args) {

    // get the input string from the user to encrypt
    System.out.println("Creating a d6 dice");

    Die dSix = new Die(6);

		System.out.println("Creating a d20 dice");
		Die dTwenty = new Die(20);

		System.out.println("Creating a percentile dice d10");
		Die dTen = new Die(10);

		System.out.println("the current side up for d6 is " + dSix.getCurrentSideUp());
		System.out.println("the current side up for d20 is " + dTwenty.getCurrentSideUp());
		System.out.println("the current side up for d10 is " + dTen.getCurrentSideUp());

		System.out.println("Testing the rounding method..");

		System.out.println("Rolling the d6");
		dSix.roll();
		System.out.println("the new value is " + dSix.getCurrentSideUp());

		System.out.println("Rolling the d20");
		dTwenty.roll();
		System.out.println("the new value is " + dTwenty.getCurrentSideUp());

		System.out.println("Rolling the d10");
		dTen.roll();
		System.out.println("the new value is " + dTen.getCurrentSideUp());



		//setting the highest value in d20
		System.out.println("Setting the d20 to show highest value");
		dTwenty.setCurrentSideUp(dTwenty.numberOfSides);
		System.out.println("The new side up for d20 is " + dTwenty.getCurrentSideUp() + "/n");

		//create 5 6 sided dies and roll them until ome a kind values appear..

		System.out.println("Creating 5 d6");
		int numOFInterations = getOneOfKind();
		System.out.println("It took " + numOFInterations + " tries");



  }

	private static int getOneOfKind(){
		//	creating  5 snew six-sided dices. Rolling  all Dies in a loop until we get 5 of a kind.
		//	keeping a counter  and displaying the number of rolls.
		Die[] dices = new Die[5];
		for(int i=0; i<5 ;++i){
			dices[i] = new Die(6);
		}
		boolean keepRolling = true;
		int counter = 1;
		while(keepRolling){
			int[] sideUpValues = new int[5];
			for(int j =0;j<5;j++){
				dices[j].roll();
				sideUpValues[j] = dices[j].getCurrentSideUp();
			}

			if(!checkForDuplicates(sideUpValues)){
				keepRolling = false;
			}
			else{
				counter++;
			}
		}
		return counter;
	}

// Generic method to check for duplicates in an array
private static  boolean checkForDuplicates(int[] sideUpValues)
{
    // create an empty set
    Set<Integer> set = new HashSet<Integer>();

    // do for every array element
    for (int side: sideUpValues)
    {
        // return true if a duplicate is found
        if (set.contains(side)) {
            return true;
        }

        // insert the current element into a set
            set.add(side);
      }

    // no duplicate is found
    return false;
}
}
