/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newcoursework;
import java.util.Scanner;

/**
 *
 * @author HESHAN
 */
public class NumberConverter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        L1: do {
            System.out.println("                            __   ______             __           ");
            System.out.println("                           |  \\ /      \\           |  \\          ");
            System.out.println("                            \\$$|  $$$$$$\\  ______  | $$  _______ ");
            System.out.println("                           |  \\| $$   \\$$ |      \\ | $$ /       \\");
            System.out.println("                           | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
            System.out.println("                           | $$| $$   __  /      $$| $$| $$      ");
            System.out.println("                           | $$| $$__/  \\|  $$$$$$$| $$| $$_____ ");
            System.out.println("                           | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
            System.out.println("                            \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");        

            System.out.println(" ");

            System.out.println("  _   _                    _                    _____                                   _              ");
            System.out.println(" | \\ | |                  | |                  / ____|                                 | |             ");
            System.out.println(" |  \\| | _   _  _ __ ___  | |__    ___  _ __  | |       ___   _ __  __   __  ___  _ __ | |_   ___  _ __ ");
            System.out.println(" | . ` || | | || '_ ` _ \\ | '_ \\  / _ \\| '__| | |      / _ \\ | '_ \\ \\ \\ / / / _ \\| '__|| __| / _ \\| '__|");
            System.out.println(" | |\\  || |_| || | | | | || |_) ||  __/| |    | |____ | (_) || | | | \\ V / |  __/| |   | |_ |  __/| |    | |\\  || |_| || | | | | || |_) ||  __/| |    | |____ | (_) || | | | \\ V / |  __/| |   | |_ |  __/| |   ");
            System.out.println(" |_| \\_| \\__,_||_| |_| |_||_.__/  \\___||_|     \\_____| \\___/ |_| |_|  \\_/   \\___||_|    \\__| \\___||_|   ");

            System.out.println("===============================================================================================");

            System.out.println(" ");

            System.out.println("[01] Decimal Converter");
            System.out.println("[02] Binary Converter");
            System.out.println("[03] Octal Converter");
            System.out.println("[04] Hexadecimal Converter");
            System.out.println("[05] Roman Number Converter");
            System.out.println("[00] Exit");
            System.out.println(" ");
            System.out.print("Enter option -> ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    L2: do {
                        System.out.println("+------------------------------------+");
                        System.out.println("|          Decimal Converter         |");
                        System.out.println("+------------------------------------+");
                        char doAgain;
                        System.out.println("Enter a decimal number: ");
                        int decimal = sc.nextInt();
                        if (decimal < 0) {
                            System.out.println("Invalid input... ");
                            continue L2;
                        }

                        else { 
                        String binary = "";
                        int newDecimal = decimal;
                        while (newDecimal > 0) {
                            binary = (newDecimal % 2) + binary;
                            newDecimal /= 2;
                        }

                       
                        String octal = "";
                        newDecimal = decimal;
                        while (newDecimal > 0) {
                            octal = (newDecimal % 8) + octal;
                            newDecimal /= 8;
                        }

                       
                        String hex = "";
                        newDecimal = decimal;
                        char[] hexChars = "0123456789ABCDEF".toCharArray();
                        while (newDecimal > 0) {
                            hex = hexChars[newDecimal % 16] + hex;
                            newDecimal /= 16;
                        }

                        System.out.println("Binary number: " + binary);
                        System.out.println("Octal number: " + octal);
                        System.out.println("Hexadecimal number: " + hex);
                        
                        }
                        System.out.println("Do you want to go to homepage? (Y/N): ");
                        doAgain = sc.next().charAt(0);
                        if (doAgain == 'Y' || doAgain == 'y') {
                            continue L1;
                              } else if (doAgain == 'N' || doAgain == 'n') {
                            continue L2;
                        }
                    } while (true);
                    
                    case 2:
                    L3: do {
                        System.out.println("+------------------------------------+");
                        System.out.println("|          Binary Converter          |");
                        System.out.println("+------------------------------------+");
                        char doAgain;
                        System.out.println("Enter a binary number: ");
                        String binary = sc.next();
                        
                        if (!binary.matches("[01]+")) {
                            System.out.println("Invalid input... ");
                            continue L3;
                        }

                        
                        int decimal = 0;
                        for (int i = 0; i < binary.length(); i++) {
                            char digit = binary.charAt(i);
                            decimal = decimal * 2 + (digit - '0');
                        }

                         
                        String octal = "";
                        int newDecimal = decimal;
                        while (newDecimal > 0) {
                            octal = (newDecimal % 8) + octal;
                            newDecimal /= 8;
                        }

                        
                        String hex = "";
                        newDecimal = decimal;
                        char[] hexChars = "0123456789ABCDEF".toCharArray();
                        while (newDecimal > 0) {
                            hex = hexChars[newDecimal % 16] + hex;
                            newDecimal /= 16;
                        }

                        System.out.println("Decimal number: " + decimal);
                        System.out.println("Octal number: " + octal);
                        System.out.println("Hexadecimal number: " + hex);
                        
                        System.out.println("Do you want to go to homepage? (Y/N): ");
                        doAgain = sc.next().charAt(0);
                        if (doAgain == 'Y' || doAgain == 'y') {
                            continue L1;
                        }
                        else if (doAgain == 'N' || doAgain == 'n') {
                            continue L3;
                        }
                    } while (true);
                    
                        case 3:
                        L4: do {
                        System.out.println("+------------------------------------+");
                        System.out.println("|          Octal Converter           |");
                        System.out.println("+------------------------------------+");
                        char doAgain;
                        System.out.println("Enter an octal number: ");
                        String octal = sc.next();
                        if (!octal.matches("[0-7]+")) {
                            System.out.println("Invalid input... ");
                            continue L4;
                        }

                        
                        int decimal = 0;
                        for (int i = 0; i < octal.length(); i++) {
                            char digit = octal.charAt(i);
                            decimal = decimal * 8 + (digit - '0');
                        }

                        
                        String binary = "";
                        int newDecimal = decimal;
                        while (newDecimal > 0) {
                            binary = (newDecimal % 2) + binary;
                            newDecimal /= 2;
                        }
 
                        
                        String hex = "";
                        newDecimal = decimal;
                        char[] hexChars = "0123456789ABCDEF".toCharArray();
                        while (newDecimal > 0) {
                            hex = hexChars[newDecimal % 16] + hex;
                            newDecimal /= 16;
                        }

                        System.out.println("Decimal number: " + decimal);
                        System.out.println("Binary number: " + binary);
                        System.out.println("Hexadecimal number: " + hex);
                        
                        System.out.println("Do you want to go to homepage? (Y/N): ");
                        doAgain = sc.next().charAt(0);
                        if (doAgain == 'Y' || doAgain == 'y') {
                            continue L1;
                        } 
                        else if (doAgain == 'N' || doAgain == 'n') {
                            continue L4;
                        }
                    } while (true);
                    
                    case 4:
                    L5: do {
                        System.out.println("+------------------------------------+");
                        System.out.println("|          Hexadecimal Converter     |");
                        System.out.println("+------------------------------------+");
                        char doAgain;
                        System.out.println("Enter a hexadecimal number: ");
                        String hex = sc.next();
                        if (!hex.matches("[0-9A-Fa-f]+")) {
                            System.out.println("Invalid input... ");
                            continue L5;
                        }

                        
                        int decimal = 0;
                        for (int i = 0; i < hex.length(); i++) {
                            char digit = hex.charAt(i);
                            int value = (digit >= '0' && digit <= '9') ? digit - '0' : digit - 'A' + 10;
                            decimal = decimal * 16 + value;
                        }

                        
                        String binary = "";
                        int newDecimal = decimal;
                        while (newDecimal > 0) {
                            binary = (newDecimal % 2) + binary;
                            newDecimal /= 2;
                        }
                        
                        
                        String octal = "";
                        newDecimal = decimal;
                        while (newDecimal > 0) {
                            octal = (newDecimal % 8) + octal;
                            newDecimal /= 8;
                        }

                        System.out.println("Decimal number: " + decimal);
                        System.out.println("Binary number: " + binary);
                        System.out.println("Octal number: " + octal);
                        
                        System.out.println("Do you want to go to homepage? (Y/N): ");
                        doAgain = sc.next().charAt(0);
                        if (doAgain == 'Y' || doAgain == 'y') {
                            continue L1;
                        } else if (doAgain == 'N' || doAgain == 'n') {
                            continue L5;
                        }
                    } while (true);
                    
                    case 5:
                    L6: do {
                        System.out.println("+------------------------------------+");
                        System.out.println("|       Roman Number Converter       |");
                        System.out.println("+------------------------------------+");
                        System.out.println("[1] Decimal Number to Roman Number Converter");
                        System.out.println("[2] Roman Number to Decimal Number Converter");
                        System.out.println("[3] Exit");
                        System.out.println("Enter an option ->");
                        int romanOption = sc.nextInt();
                        switch (romanOption) {
                        case 1:
                                char doAgain;
                                System.out.println("+----------------------------------------------------+");
                                System.out.println("|     Decimal Number to Roman Number Converter       |");
                                System.out.println("+----------------------------------------------------+");
                                int decimal = sc.nextInt();
                                if (decimal < 0) {
                                    System.out.println("Invalid input... ");
                                    continue L6;
                                }

                         
                                int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                                String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                                StringBuilder roman = new StringBuilder();
                                for (int i = 0; i < values.length; i++) {
                                    while (decimal >= values[i]) {
                                        decimal -= values[i];
                                        roman.append(romans[i]);
                                    }
                                }

                                 System.out.println("Roman number: " + roman.toString());
                                
                                System.out.println("Do you want to go to homepage? (Y/N): ");
                                doAgain = sc.next().charAt(0);
                                if (doAgain == 'Y' || doAgain == 'y') {
                                    continue L1;
                                } else if (doAgain == 'N' || doAgain == 'n') {
                                    continue L6;
                                }
                                
                            case 2:
                                char doAgain1;
                                System.out.println("+----------------------------------------------------+");
                                System.out.println("|     Roman Number to Decimal Number Converter       |");
                                System.out.println("+----------------------------------------------------+");
                                String romanInput = sc.next();
                                if (!romanInput.matches("[IVXLCDMivxlcdm]+")) {
                                    System.out.println("Invalid input... ");
                                    continue L6;
                                }

                                
                                int[] Values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                                String[] Romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                                int decimalResult = 0;
                                for (int i = 0; i < Romans.length; i++) {
                                    while (romanInput.startsWith(Romans[i])) {
                                        decimalResult += Values[i];
                                        romanInput = romanInput.substring(Romans[i].length());
                                    }
                                }


                                System.out.println("Decimal number: " + decimalResult);
                                
                                System.out.println("Do you want to go to homepage? (Y/N): ");
                                doAgain1 = sc.next().charAt(0);
                                if (doAgain1 == 'Y' || doAgain1 == 'y') {
                                    continue L1;
                                } else if (doAgain1 == 'N' || doAgain1 == 'n') {
                                    continue L6;
                                }
                            case 3:
                                continue L1;
                        }
                    } while (true);
                    
                case 6:
                    System.out.println("Exit");
                    break L1;
                
            }
        }while(true);
     }
}
