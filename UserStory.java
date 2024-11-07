import java.util.Scanner;

public class UserStory {

  /*
   * Arrays that store the months and pounds of strawberries from the dataset
   * we chose. The month array is a String and the poundsOfStrawberries array 
   * is an integer
   */
  private String[ ] month;
  private int[ ] poundsOfStrawberries;

public UserStory() {

  /*
   * Constructor which initializes the empty arrays
   */
  this.month = new String[12];
  this.poundsOfStrawberries = new int[12];
}
  
  public UserStory(String monthFile, String poundsOfStrawberriesFile) {

  /*
   * Constructor which initializes arrays based on the file input
   */
    month = FileReader.toStringArray(monthFile);
    poundsOfStrawberries = FileReader.toIntArray(poundsOfStrawberriesFile);
}  

  /*
   * Method which finds the max pounds of strawberries and then returns
   * the max/result
   */
  public int findMaxPoundsOfStrawberries() {
    int max = 0;
    for (int pounds : poundsOfStrawberries) {
      if (pounds > max) {
        max = pounds;
      }
    }
    return max;
  }

  /*
   * toString method that returns a string for our UserStory, also provides
   * the answer to our ice cream maker's question
   */
  public String toString() {
    return "Month: " + month[6] + "\n" + 
      "Pounds of Frozen Strawberries: " + findMaxPoundsOfStrawberries();
  }

  
}