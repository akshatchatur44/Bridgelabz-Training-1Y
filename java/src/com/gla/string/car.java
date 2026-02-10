package com.gla.string;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class car {
    String colour;
    String Company;
    String Model;
    String Type;
    public static void main(){
        car c1 = new car();
        c1.colour = "Black";
        c1.Company = "BMW";
        c1.Model = "M5";
        c1.Type = "Sports";

        System.out.println(c1.colour);
    }
}
