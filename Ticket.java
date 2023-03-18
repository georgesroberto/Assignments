/*
 * TICKET PROGRAM WITH BOOL VALUES
 ****Algorithm
 *2D Array represents seat position in the room
 *Takes 0 or 1 as seat input
 *Outputs 0 for free and 1 for sold
 */

 //Buckle up
 import java.util.Scanner;

 class Ticket{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int seats[][] = {
            {0,0,0,1,1,1,0,0,1,1},
            {1,1,0,1,0,1,1,0,0,0},
            {1,1,1,1,1,1,1,1,1,1},
            {0,0,0,1,1,1,1,0,0,0},
            {0,1,1,1,0,0,0,1,1,1}
        };

        int s10 = seats[2][3];
        System.out.println(s10);

        //##GRAB THE CODE
        System.out.print("Input Seat Row: ");
        int row = sc.nextInt();
        System.out.print("Input Seat Column: ");
        int col = sc.nextInt();
        
        if(seats[row][col] == 0){
            System.out.println("Free");
        }
        else if(seats[row][col] == 1){
            System.out.println("Booked");
        }
        else{
            System.out.println("Invalid");
        }
    }
}