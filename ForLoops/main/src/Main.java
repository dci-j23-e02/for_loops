import java.util.Locale;
import java.util.Scanner; // more readable to mention the class you've used

public class Main {

  public static void main(String[] args) {
   /*
   int i = 0;
   String name = "Safwan";
     */

    /*
      while( i < 10){
        System.out.println("Hello , i is " + i);
        i= i +3;

      }*/


    /*
 if(i < 10 ){
        System.out.println("Hello , i is " + i);
        i= i +3;
      }*/

     // boolean x = 5 < 6;


    /**
     * while loop
     * do .. while loop
     * for loop
     * forEach loop
     * */

    /**
     *     for (initialisation; condition ; increment / decrement){
     *          // code to be executed
     *     }
     * */
   /* String name = "Safwan";
    for (int i = 0; i < name.length() ;  i++){
      System.out.println("The value of i is " + i);
      System.out.println("The charAt "+ i + " is "+ name.charAt(i));
    }

*/
    /**
     * Write a small Java program that reads a phrase from the
     * console and then check where is the position of character 's' inside it.
     * if there is no 's' , then print , there is no 's'
     * 's' could be  Upper or lower case.
     * hint 1: you might use Scanner class
     * hint 2: use 'for loop' and you might need' if statement'  inside it.
     * hint 3: provide only the first occurrence.
     * */
/*
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the phrase of your choice: ");
    String phrase = input.nextLine();
    phrase = phrase.toLowerCase(); // 's' could be  Upper or lower case.
    boolean found = false; // provide only the first occurrence, no need to use it if we use break;
    int positions = 0; // print the positions outside the loop
*/
    /**
     * i < phrase.length() && !found : return false if one of these returns false
     *
     * */

    /* Mu*eum* : phrase.length() = 7
    *  i: 0 -> M (  i < phrase.length() : true )
    *  i: 1 -> u (  i < phrase.length() : true )
    *  i: 2 -> * (  i < phrase.length() : true )
    *  i: 3 -> e (  i < phrase.length() : true )
    *  i: 4 -> u (  i < phrase.length() : true )
    *  i: 5 -> m (  i < phrase.length() : true )
    *  i: 6 -> * (  i < phrase.length() : true )
    *  i: 7 ->   (  i < phrase.length() : false )

     */

    /* Mu*eums : phrase.length() = 7
     *  i: 0 -> M (  i < phrase.length() : true )
     *  i: 1 -> u (  i < phrase.length() : true )
     *  i: 2 -> * (  i < phrase.length() : true )
     *  i: 3 -> e (  i < phrase.length() : true )
     *  i: 4 -> u (  i < phrase.length() : true )
     *  i: 5 -> m (  i < phrase.length() : true )
     *  i: 6 -> s (  i < phrase.length() : true ) && ( !found = false) = false
     *  i: 7 ->   (  i < phrase.length() : false )

     */

    /* Museums : phrase.length() = 7
     *  i: 0 -> M (  i < phrase.length() : true )
     *  i: 1 -> u (  i < phrase.length() : true )
     *  i: 2 -> s (  i < phrase.length() : true )  && ( !found = false) = false // Only first occurrence is provided.
     *

     */
/*
    for (int i = 0; i < phrase.length() && !found ; i++){
      if(phrase.charAt(i) == 's'){
        found = true;
        positions = i + 1 ;
      }
    }

   if(positions > 0){
      System.out.println("We could find the character 's' at position " +  positions );
    }else{
      System.out.println("We couldn't find the character 's' inside given phrase " );
    }

*/
   // int test;
   // System.out.println(test); : java: variable test might not have been initialized


    // Loops control statements ( break; continue; )
/*
    for (int i = 0; i < phrase.length() ; i++){
      if(phrase.charAt(i) == 's'){
        positions = i + 1 ;
        System.out.println(i);
        break;
      }
      System.out.println(i);
    }

    if(positions > 0){
      System.out.println("We could find the character 's' at position " +  positions );
    }else{
      System.out.println("We couldn't find the character 's' inside given phrase " );
    }

    */

   // continue; example :
    /** without // continue;
     * j:0 -> "Sunday" : {j:1  , print "Monday", j:2}
     * j:2 -> "Tuesday": {print "Tuesday", j:3 }
     * j:3 -> "Wednesday": {print "Wednesday", j:4 }
     * j:4 -> "Thursday": {print "Thursday", j:5 }
     * j:5 -> "Friday": {print "Friday", j:6 }
     * j:6 -> "Saturday":  {j:7  , print "weekDays[7]" Index 7 out of bounds for length 7 }
     * We don't want to have errors , therefore continue wouldf be the best solution
     * */
   /* String[]  weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int j =0;
    while( j < weekDays.length) {
      if(weekDays[j].equals("Saturday") || weekDays[j].equals("Sunday") ){
        j++;
        continue;
      }
      System.out.println(weekDays[j]);
      j++;
    }
*/

    // Arrays and ForEach loops :
      // One Dimension Arrays:
    String [] names = {"Safwan", "Gizem", "Aria"};
    // forEach
  /*  for(String name : names){
      System.out.println(name.length());
    }
    // for
    for(int i = 0; i< names.length; i++){
      System.out.println(names[i].length());
    }
*/
    // 2 Dimension Arrays:

    int [][] numbers = { {80, 90, 70} , {20, 80, 75} , {10, 15, 60} };

    // forEach
    // Calculate the Avg :
    double total = 0;
    for(int[] row: numbers){
      System.out.println("Row ........");
        for(int value : row){
            System.out.println(value);
            total = total + value;
          }
    }

    double Avg = total / (numbers.length * numbers[0].length);

    System.out.println("The total is :"+total);
    System.out.println("The Avg is "+ Avg);


/*
    // for loop
    for(int i =0 ; i < numbers.length; i++){
      System.out.println("Row number ["+i+"]........");
      for(int j = 0; j < numbers[i].length; j++){
        System.out.println(numbers[i][j]);
      }
    }*/
  }
}
