package com.androidlime.app.project;

import java.util.Scanner;

/**
 * Created by Mithun on 12/8/2018.
 */

public class Conditional1 {

    public static void main(String[] args) {



        float number;


        Scanner scanner= new Scanner(System.in);

        number=scanner.nextFloat();


        if (number>=80)
        {

            System.out.println("A+");

        }

        else if (number>=70)
        {

            System.out.println("A");

        }
       else if (number>=60)
        {

            System.out.println("A-");

        }

       else {

            System.out.println("A+");

        }
    }


}
