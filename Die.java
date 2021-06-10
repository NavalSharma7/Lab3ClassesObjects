/*
    Naval Sharma
    A00241484

		This program has certain array tools like -

*/


import java.util.*;
import java.lang. *;

public class Die
{
	// data fields to describe the die..

	private String type;
	private int numberOfSides;
	private int currentSideUp;

	// custructors..

	//constructor with no argument sets the numberOfSides as 6 default and the type d6
	//to that and gives a ramdom value to the currentSideUp

	public Die(){
		this.type = "d6";
		this.numberOfSides = 6;
		this.currentSideUp = (int) (Math.random() * (6 - 1)) + 1;
	}

	//constructor with one argument sets the numberOfSides and the type accroding
	//to that and givees a ramdom value to the currentSideUp
	public Die(int numberOfSides){
		this.numberOfSides = numberOfSides;
		this.type = "d" + numberOfSides;
		this.currentSideUp = (int) (Math.random() * (numberOfSides - 1)) + 1;
	}
	//constructor with two argument sets the numberOfSides and the type
	//to that and gives a ramdom value to the currentSideUp..

	public Die(String type, int numberOfSides){
		this.type = type;
		this. numberOfSides = numberOfSides;
		this.currentSideUp = (int) (Math.random() * (numberOfSides - 1)) + 1;
	}

	public String getType(){
		return type;
	}

	public int getNumOfSides(){
		return numberOfSides;
	}
	public int getCurrentSideUp(){
		return currentSideUp;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setNumOfSides(int numberOfSides){
		this.numberOfSides = numberOfSides;
		this.type = "d" + numberOfSides;
	}

	public void setCurrentSideUp(int currentSideUp){
		this.currentSideUp = currentSideUp;
	}

	public void roll(){
		setCurrentSideUp((int) (Math.random() * (numberOfSides - 1)) + 1);
	}
  }
