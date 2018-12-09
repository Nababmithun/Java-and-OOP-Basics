package com.androidlime.app.project;

/**
 * Created by Mithun on 12/8/2018.
 */

public class Arraypro {


    public static void main(String[] args) {

        String[] Group= {"Mithun", "Riju", "Rana", "Laboni"};

        String message = "Love U frnd ";


        for (int i = 0; i < Group.length; i++) {


            if (Group[i].equals( "Mithun"))
            {
                continue;


            }


            System.out.println(Group[i] + " " + message);

        }
    }
}


