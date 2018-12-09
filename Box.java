package com.androidlime.app.ClassAndObject;

/**
 * Created by Mithun on 12/8/2018.
 */

public class Box {


    int width;
    int hight;
    int dept;



    public void setdata(int width,int hight,int dept)

    {


        this.width=width;
        this.hight=hight;
        this.dept=dept;


    }


     public  void  printBox()


     {

         System.out.println("width="+width+",Hight="+hight+",Dept="+dept);


     }


}
