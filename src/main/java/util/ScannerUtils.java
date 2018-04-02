package util;

import java.util.Scanner;

public class ScannerUtils {

    public static Scanner scanner;


    public static Scanner getScanner() {
        if (scanner == null) {
            return new Scanner(System.in);
        }return scanner;
    }

    public String getString(){
        return getScanner().nextLine();
    }

    public int getInt(){
        return getScanner().nextInt();
    }
}
