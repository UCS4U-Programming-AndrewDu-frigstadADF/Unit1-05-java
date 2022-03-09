/** calculating the width of a board foot given the length and height by the user
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-03-08
 * */ 


import java.util.Scanner;

class BoardFoot {
  // doing calculations in another function
  public static float widthCalculations(float userHeightFloat, float userLengthFloat) {
    float calcWidth = 0;
    calcWidth = (144 / userLengthFloat)/ userHeightFloat;
    return calcWidth;
  }
  public static void main(String[] args) {

    // declaring varaibles
    float userHeightFloat = 0;
    float userLengthFloat = 0;
        
      //getting user input
      Scanner myObj = new Scanner(System.in);
      System.out.println("How long is your board foot?");
      String userLength = myObj.nextLine();
      System.out.println("How tall is your board foot?");
      String userHeight = myObj.nextLine();
        
      // try catch for both length and height
    try {
      // converting user strings to floats
      userLengthFloat = Float.parseFloat(userLength);
      userHeightFloat = Float.parseFloat(userHeight);
    } catch (NumberFormatException e) {
      userLengthFloat = -1;
      userHeightFloat = -1;
    }

    if (userLengthFloat == -1) {
      System.out.println("input a positive number");
    } else if (userHeightFloat == -1) {
      System.out.println("input a positive number");
    } else {
      // calling method
      float width = widthCalculations(userHeightFloat, userLengthFloat);

      // printing user's calculated board foot
      System.out.println("Your width in cubic inches is " + width);
    }
  }
}