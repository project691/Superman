package org.team691.superman;

import java.util.Scanner;

public class Superman {
    
    static Scanner input;
    
    static double ku = 0.0;
    static double tu = 0.0;
    static double kp = 0.0;
    static double ki = 0.0;
    static double kd = 0.0;

    //Do some math to help tune PID faster.
    //This uses the Ziegler-Nichols method, using the "some overshoot" section on wikipedia.
    public static void main(String[] args) {
        input = new Scanner(System.in);
        while(true) {
            //Users love this stuff. Also, it makes you feel less forever alone.
            System.out.println("Hello sweetie! I'm here to assist your calculations. Just give me the numbers.");
            //Calculate the Kp from the Ku (Ku is basically the Kp rating you got from your attempts at guessing).
            System.out.println("Let's start with U: ");
            ku = input.nextDouble();
            kp = ku * 0.33;
            System.out.println("Kp is: " + kp);

            //Calculate the Ki, right now we just use a stop watch to time it. Centiseconds just look nice too.
            System.out.println("I would also like to know the time in centiseconds: ");
            tu = input.nextDouble();
            ki = kp / tu;
            System.out.println("Hm...that would make Ki about:" + ki);	
            
            //Prints the Kd value, using already gathered intergers (Kp and Tu) making this a fairly simple code.
            kd = (kp * tu) / 3;
            System.out.println("And of course, master, the Kd is: " + kd);
            
            //This block is just to give you a clear export of numbers to quickly refrence.
            System.out.println("Basically,\nKp = " + kp + "\nKi = " + ki + "\nKd = " + kd);
            System.out.println("Type something and press any key to run again...");
            input.next();
        }
    }
}
