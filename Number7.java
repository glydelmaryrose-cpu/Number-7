
/**
 * Write a description of class Number7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number7
{
    public static void main(String [] args){
    
        int [] arr = {-2, 5, -8, 10};
        
        System.out.println("Original array: ");
        for (int x : arr) 
            System.out.print(x + " ");
        
        for (int z = 0; z < arr.length; z++)
            if (arr[z] < 0) arr[z] = -arr[z];
            
        System.out.println("Converted array: ");
        
        for (int x : arr) System.out.print(x + " ");
        System.out.println("\n");
        }
    }
