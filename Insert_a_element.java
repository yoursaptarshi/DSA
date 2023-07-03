import java.util.Scanner;

public class Insert_a_element {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //taking the upper bound of array
        System.out.println("Enter the upper bound of the array: ");
        int upper_bound = sc.nextInt();

        //initializing the array
        int[] array = new int [upper_bound];

        //Enter the size of array you want to make initially
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int element;
        //taking the elements
        for(int i = 0;i<size;i++){
            System.out.println("Enter the element for index "+(i+1)+" : ");
            element=sc.nextInt();
            array[i] = element;
        }

        //taking the position
        System.out.println("Enter the index: ");
        int position = sc.nextInt();
        System.out.println("Enter the element: ");
        element = sc.nextInt();

        //we have last index as size-1 as we started from inde 0
        int last_index =size-1;
        //shifting elements before the position (position=index-1)
        for(int i=last_index;i>=(position-1);i--){
            array[i+1]=array[i];
        }
        size=size+1;
        array[position-1]=element;
        //displaying the array
        for(int i=0;i<size;i++){
            System.out.println("The element of index "+(i+1)+" is : "+(array[i]));
        }
    }
}
