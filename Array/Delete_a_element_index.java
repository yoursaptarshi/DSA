import java.util.Scanner;
public class Delete_a_element_index {
    public static void main(String[]args){
                //defining variables
        int size,element,index,position;

        Scanner sc =new Scanner(System.in);

        //taking size of array
        System.out.println("Enter the size of array: ");
        size = sc.nextInt();

        //declaring array
        int[]array = new int[size];

        //taking elements
        for(int i=0;i<size;i++){
            System.out.println("Enter element for index "+(i+1)+" : ");
            element = sc.nextInt();
            array[i] = element;
        }

        //which index to delete
        System.out.println("Enter the position to delete: ");
        position = sc.nextInt();
        //as we are starting from index =0, so index = position-1
        index = position-1;

        //for loop to delete
        for(int i=(index+1);i<size;i++){
            array[i-1] = array[i];
        }
        //since one element is deleted, decrease the size
        size--;

        //display
        for(int i=0;i<size;i++){
            System.out.println("The element of index "+(i+1)+" is : "+(array[i]));
        }
    }
}
