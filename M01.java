// 12S24008 - Rospika Sarah Yosefin Siregar  
// 12S24013 - Adryan Julianto Panjaitan   

import java.util.*;
import java.lang.Math;

public class m01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kredit, nilaihuruf;
        double nilaiangka, a, aB, b, bC, c, d, e, pERFORMA, kredit0;

        do {
            kredit = input.nextLine();
            if (kredit.equals("---")) {
            } else {
                kredit0 = Double.parseDouble(kredit);
                nilaihuruf = input.nextLine();
                if (nilaihuruf.equals("A")) {
                    nilaiangka = 4.0;
                } else {
                    if (nilaihuruf.equals("AB")) {
                        nilaiangka = 3.5;
                    } else {
                        if (nilaihuruf.equals("B")) {
                            nilaiangka = 3.0;
                        } else {
                            if (nilaihuruf.equals("BC")) {
                                nilaiangka = 2.5;
                            } else {
                                if (nilaihuruf.equals("C")) {
                                    nilaiangka = 2.0;
                                } else {
                                    if (nilaihuruf.equals("D")) {
                                        nilaiangka = 1.0;
                                    } else {
                                        if (nilaihuruf.equals("E")) {
                                            nilaiangka = 0.0;
                                        } else {
                                            nilaiangka = 0.0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                pERFORMA = kredit0 * nilaiangka;
                System.out.println(toFixed(pERFORMA,1));
            }
        } while (!kredit.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
