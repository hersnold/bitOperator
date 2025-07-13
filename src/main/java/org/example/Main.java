package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //verificacao bit a bit do valor inputado no scanner
        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000;
        int n = sc.nextInt();

        if ((n & mask) !=0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        sc.close();
    }
}