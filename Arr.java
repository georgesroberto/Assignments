class Arr{
    public static void main(String[]args){
        /*
         * Declare an array to hold monthly revenue for a company for a year
         * calculate average monthly revenue for the year #TIP#: Sum all monthly revenues and divide by no. of items in the array
         */
        double revenue[] = {87640,22380,98560,67890,82345,53000,76940,63700,12345,99900};
        double sum =0;
        double average = 0;
        for(double s: revenue){
            sum  += s;
            average = sum / revenue.length;
        }
        System.out.println(average);
        System.out.println();
        
        //Great program next is a multidimensional array

        String MArray[][] = {
            {"Georges Roberto"},
            {"Jane Ambutsy"},
            {"Perfect Couples","Hubby and Wifey","Ace"}
        };

        String x = MArray[2][2];
        System.out.println("Last item in array is: "+x);
        System.out.println();

        for(int r = 0; r<MArray.length; r++){
            for(int j = 0; j<MArray[r].length; j++){
                //for(int a = 0; a<MArray[j].length; a++){
                    System.out.println(MArray[r][j]);
                    System.out.println();
                //}
            }
        }

        //same program with integers
        int calc[][]={
            {10,20,30},
            {5,15,20}
        };

        int total = 0;
        for(int i =0; i < calc.length; i++){
            for(int j = 0; j < calc[i].length; j++){
                total += calc[i][j];
            }
        }
        System.out.println(total);
    }//Coolest Program upnext on ticket.java
}