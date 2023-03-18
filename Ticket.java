/*
 * TICKET PROGRAM 
 ****Algorithm
 *2D Array represents seat position in the room
 *Takes row and column as integers for seat input
 *Checks the taken input against the provided seats array
 *Outputs free for 0 seat number and Booked for 1 as seat number else returns invalid.
 */

 //Buckle up
 import java.util.Scanner;//input package

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
