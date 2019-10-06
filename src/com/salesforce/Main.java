package com.salesforce;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Fib();
    }

    private static int fibonachi(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    private static String reverseString(String inputStr) {
        int strLength = inputStr.length();
        String result = "";
        for (int i = 0; i < strLength; i++) {
            result = inputStr.charAt(i) + result;
        }
        return result;
    }

    private static void Fib() throws IOException {
        Scanner sc = new Scanner(new File("D:\\source.txt"));
        FileWriter wr = new FileWriter("D:\\output.txt", false);
        String [] splitted;
        int tmpNum;
        String tmpWord;
        while (sc.hasNext()) {
            splitted = sc.nextLine().split(" ");
            tmpNum = Integer.parseInt(splitted[1]);
            tmpWord = splitted[0];
            String s = Integer.toString(fibonachi(tmpNum));
            wr.append(s).append(" ").append(reverseString(tmpWord)).append("\r\n");
            wr.flush();
        }
    }
}