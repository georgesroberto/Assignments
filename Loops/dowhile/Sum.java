/*
QUICK QUIZ
You11:31
Calclutae sum of numbers 1 to N where N is given

Sample input 10
Sample output 55
 */

class Sum {
    public static void main(String[] args){
        int N = 10;
        int x = 1;
        int sum =0;

        while(x <= N){
            sum = sum + x;
            x++;
        }
        System.out.print(sum);
    }    
}
