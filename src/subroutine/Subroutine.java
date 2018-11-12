/*
 * Julianne Wojdak
 * 08/11/18
 * My first subroutine
 */

package subroutine;
import java.util.Scanner;
/**
 *
 * @author JuWoj8013
 */
public class Subroutine {

//Perimeter of a square
    public static void perimeterOfSquare (int length, int width, int perimeter)
    {
       perimeter = length + length + width + width;
       System.out.println("The perimeter is " + perimeter);
       System.out.println("    ");
    }
    
    //Area of a square
    public static void areaOfSquare (int length, int width, int area)
    {
        area = length*width;
        System.out.println("The area is " + area);
    }
         
    //Average of 3 numbers
    public static void averageOfNums (int num1, int num2, int num3, int total, int average)
    {
        total = num1 + num2 + num3;
        average = total/3;
        System.out.println("The average is " + average);
    }
    
    //Area of a triangle
    public static void areaOfTriangle (int base, int height, int area)
    {
        area = base*height/2;
        System.out.println("The area is " + area);
    }
    
    //Volume of a cube
    public static void volumeOfCube (int length, int width, int height, int volume)
    {
        volume = length*width*height;
        System.out.println("The volume is " + volume);
    }
    
    //Main subroutine
    public static void main (String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        //Variables
        int choice;
        int length;
        int width;
        int height;
        int base;
        int measurements;
        int perimeter;
        int volume;
        int area;
        int num1;
        int num2;
        int num3;
        int total;
        int average;
        
        //Home display
        while (true)
        {
        System.out.println("-----My first subroutine-----");
        System.out.println("");
        
        System.out.println("Choose one of the following");
        System.out.println("1...Find the perimeter of a square");
        System.out.println("2...Find the area of a square");
        System.out.println("3...Find the average of 3 numbers");
        System.out.println("4...Find the area of a triangle");
        System.out.println("5...Find the volume of a cube");
        
        choice = keyedInput.nextInt();
        
        //If stetements
        if (choice == 1)
        {
        System.out.println("Your have chosen to find the perimeter of a square.");
        System.out.println("    ");
        
        //Input
        System.out.println("Enter the length");
        length = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the width");
        width = keyedInput.nextInt();
        System.out.println("    ");
        
        //Output
        perimeter = 0;
        perimeterOfSquare(length, width, perimeter);
        }
        
        if (choice == 2){
        System.out.println("You have chosen to find the area of a square.");
        System.out.println("    ");
        
        //Input
        System.out.println("Enter the length");
        length = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the width");
        width = keyedInput.nextInt();
        System.out.println("    ");
        
        //Output
        area = 0;
        areaOfSquare(length, width, area);
       
        }
        
        if (choice == 3){
        System.out.println("You have chosen to find the area of 3 numbers.");
        System.out.println("    ");
        
        //Input
        System.out.println("Enter the first number");
        num1 = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the second number");
        num2 = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the third number");
        num3 = keyedInput.nextInt();
        System.out.println("    ");
        
        //Output
        total = 0;
        average = 0;
        averageOfNums(num1, num2, num3, total, average);
        }
        
        if (choice == 4){
        System.out.println("You have chosen to find the area of a triangle");
        System.out.println("    ");
        
        //Input
        System.out.println("Enter the base length");
        base = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the height");
        height = keyedInput.nextInt();
        System.out.println("    ");
        
        //Output
        area = 0;
        areaOfTriangle(base, height, area);
        }
        
        if (choice == 5){
        System.out.println("You have chosen to find the volume of a cube");
        System.out.println("    ");
        
        //Input
        System.out.println("Enter the length");
        length = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the width");
        width = keyedInput.nextInt();
        System.out.println("    ");
        
        System.out.println("Enter the height");
        height = keyedInput.nextInt();
        System.out.println("    ");
        
        //Output
        volume = 0;
        volumeOfCube(length, width, height, volume);
        }
            
        // TODO code application logic here
    }

    }
}
