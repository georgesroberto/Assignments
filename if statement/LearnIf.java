import java.util.Scanner;

class LearnIf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("LOGIN SYSTEM");
        System.out.print("Username: ");
        String user = sc.nextLine();
        //System.out.print("Password: ");
        //String pass = sc.nextLine();
        
        if(user == "User"){
            System.out.println("LOGIN successful");
        }
        else{
            System.out.println("LOGIN unsuccessful");
        }
    }
}

/*
 * Open command prompt
 * change directory to your projects' directory
 * 
 * once in the folder of your program
 * 
 * run javac programName.java // for compilation
 * run java programme.java //For Output
 */