class LearnDoWhile{
    // do while loop
    /*
    *Loops allow you to repeat a bunch of code multiple times
    *First let's understand the while Loop
    *A while loop tests an argument against a condition and if it's true, then it executes the statement within its body
    */   

    public static void main(String[] args){
        int x = 5;
        
	while(x > 0){
            System.out.println(x);
	    x--;
	}
        //outputs 5,4,3,2,1
    /*our x is 5
     * So it tests 5 against 0
     * It's true 5 is greater than zero 
     * So it executes the print statement which prints the value of x
     * The code "x-- " means we decrement the value of x by 1 so our new x is 4.
     * And the loop repeats itself till when 0 is not greater than 0 so the condition is not met and it exits.
    */

    //////////////////Lets run the dowhile loop
    doWhile();

    }
    
    public static void doWhile(){
        /*
         * Do while is just like while loop
         * The differences is that it guarantees the proram will run at least once.
         * For instance:
         */

        int  m = 3;
        do{
            System.out.println("Hello World");
        } 
         while(m<3);
            System.out.println("Hi there");
        }
    }
}
