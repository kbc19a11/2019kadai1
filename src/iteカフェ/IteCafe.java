package iteカフェ;

import java.util.Scanner;

public class IteCafe {

    public static void main(String[] args) {
        Pass.passWord();
        Item items[] = Instance.ins();
        Calculation.calc(items);

    }

}
