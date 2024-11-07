import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

   /*
   * Create a UserStory object with our file names
   */
    UserStory userStory = new UserStory("Months.txt", "Pounds.txt");

    /*
   * Prints the question that our ice cream maker is asking and
   * then makes a new line
   */
    System.out.println("What Month Had the Most Frozen Strawberries in 2023? "  + "\n");


    /*
   * Prints the answer to the question the ice cream maker asked, or
   * will print the month of the year with the most amount of frozen
   * strawberry sales, along with the max number of pounds.
   */
    System.out.println(userStory);

  }
  }