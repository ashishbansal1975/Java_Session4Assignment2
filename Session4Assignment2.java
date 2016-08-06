import java.util.Scanner;
public class Session4Assignment2
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);   
       int i, j, n, pos, value;
       
       System.out.println("Enter the number of elements in the array :");
       n = sc.nextInt(); 

      //Declaring the arrvalue array of int data type
       int[] arrvalue = new int[n];
       int temp;


       // Entering the values in arrvalue array using for loop
       for (i = 0; i < n; i++)
       {
           System.out.print("Enter the"+ " "+(i+1)+" element of the array :");
           arrvalue[i] = sc.nextInt();
       }   

        for (i = 0; i < n; i++) 

        {

            for (j = i + 1; j < n; j++) 

            {

                if (arrvalue[i] > arrvalue[j]) 

                {

                    temp = arrvalue[i];

                    arrvalue[i] = arrvalue[j];

                    arrvalue[j] = temp;

                }

            }

        }
       


      // print the values of the array in sorted order

       System.out.println("The entered array in sorted order is :");
       for (i = 0;i < arrvalue.length; i++)
       {
             System.out.print(arrvalue[i] + " ");
       } 

       System.out.println();


        System.out.print("Enter the position where you want to insert element:");

        pos = sc.nextInt();

        System.out.print("Enter the element you want to insert:");

        value = sc.nextInt();




        int[] newArray = new int[arrvalue.length + 1]; 

        for(i = 0; i < pos-1; i++)
        {
             newArray[i] = arrvalue[i]; 
        }
   
       newArray[i] = value; // insert the value

       i = i + 1; 

       // loop until you reach the length of the old array 
        while(i < arrvalue.length + 1)
       {
           newArray[i] = arrvalue[i-1];
           i = i+1;
       }


        System.out.print("The new array values after insertion of element is : ");

        for(i = 0; i <= n; i++)

        {
 
            System.out.print(newArray[i]+" ");

        }

      


    }
}

   
       