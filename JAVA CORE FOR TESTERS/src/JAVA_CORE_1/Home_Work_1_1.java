/*Change the class HelloWorld, to print your home (or another) address with a few calls println () method.
*/


        package JAVA_CORE_1;

import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Home_Work_1_1 {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String Town = in.readLine();
        String Street = in.readLine();
        String Building = in.readLine();
        String Appartment = in.readLine();

        System.out.println("Your adress is: " + Town +" " + Street +" " + Building+ " " + Appartment);
    }
}

