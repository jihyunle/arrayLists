import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class arrayLists {
    public static void main(String[]args){
        // Create a list of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the list
        colors.add("red");
        colors.add("sky blue");
        colors.add("orange");
        colors.add("pink");

        // Print method 1) using for loop
        for(int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }

        // Print the value at index 1
        System.out.println();
        System.out.print("The color at index 1 is ");
        System.out.println(colors.get(1));

        // Prompt the user for one new color and add it to the array list
        System.out.println();
        System.out.println("Please enter a new color: ");
        Scanner keyboard = new Scanner(System.in);
        String temp = keyboard.nextLine();
        colors.add(temp);

        // Continue to prompt user for colors until they type in "Q" or "q" to quit
        // Each time user enters a color, add that to the array list
        // Print out the list at the end
        do {
            System.out.println("Please enter another color: ");
            temp = keyboard.nextLine();
            colors.add(temp);
        }
        while(! temp.equalsIgnoreCase("q"));

        // Remove the last "q"
        colors.remove(colors.size()-1);

        // Print method 2) using enhanced for loop
        System.out.println();
        System.out.println("Here is the list of the colors you entered: ");
        for(String c:colors){
            System.out.println(c);
        }

//        // Print method 3) using while loop
//        int index = 0;
//        while(colors.size()>index){
//            System.out.println(colors.get(index));
//            index++;
//        }
//
//        // Print method 4) using advanced for loop
//        Iterator iterator = colors.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        keyboard.close();
        System.exit(0);

    }
}
