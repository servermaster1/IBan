package mike.uebl.iban;

import android.annotation.SuppressLint;

@SuppressLint("DefaultLocale")
public class Iban {

    public static int Kontrolziffer(String s) throws WrongIban {
        String s2 = "";
        char k1, k2, k3, k4;
        k1 = s.charAt(0);
        k2 = s.charAt(1);
        k3 = s.charAt(2);
        k4 = s.charAt(3);
        for (int n = 4; n < s.length(); n++) {
            s2 = s2 + s.charAt(n);
        }
        s2 = s2 + k1 + k2 + k3 + k4;
        String temps;
        char temp;
        int x = 0;
        int[] z = new int[30];
        for (int n = 0; n < s2.length(); n++) {
            temp = s2.charAt(n);
            temps = "" + temp;
            temps = temps.toUpperCase();
            int i;
            if (temps.contains("A")) {
                i = 10;
                x = x * 10;
            } else if (temps.contains("B")) {
                i = 11;
                x = x * 10;
            } else if (temps.contains("C")) {
                i = 12;
                x = x * 10;
            } else if (temps.contains("D")) {
                i = 13;
                x = x * 10;
            } else if (temps.contains("E")) {
                i = 14;
                x = x * 10;
            } else if (temps.contains("F")) {
                i = 15;
                x = x * 10;
            } else if (temps.contains("G")) {
                i = 16;
                x = x * 10;
            } else if (temps.contains("H")) {
                i = 17;
                x = x * 10;
            } else if (temps.contains("I")) {
                i = 18;
                x = x * 10;
            } else if (temps.contains("J")) {
                i = 19;
                x = x * 10;
            } else if (temps.contains("K")) {
                i = 20;
                x = x * 10;
            } else if (temps.contains("L")) {
                i = 21;
                x = x * 10;
            } else if (temps.contains("M")) {
                i = 22;
                x = x * 10;
            } else if (temps.contains("N")) {
                i = 23;
                x = x * 10;
            } else if (temps.contains("O")) {
                i = 24;
                x = x * 10;
            } else if (temps.contains("P")) {
                i = 25;
                x = x * 10;
            } else if (temps.contains("Q")) {
                i = 26;
                x = x * 10;
            } else if (temps.contains("R")) {
                i = 27;
                x = x * 10;
            } else if (temps.contains("S")) {
                i = 28;
                x = x * 10;
            } else if (temps.contains("T")) {
                i = 29;
                x = x * 10;
            } else if (temps.contains("U")) {
                i = 30;
                x = x * 10;
            } else if (temps.contains("V")) {
                i = 31;
                x = x * 10;
            } else if (temps.contains("W")) {
                i = 32;
                x = x * 10;
            } else if (temps.contains("X")) {
                i = 33;
                x = x * 10;
            } else if (temps.contains("Y")) {
                i = 34;
                x = x * 10;
            } else if (temps.contains("Z")) {
                i = 35;
                x = x * 10;
            } else if (temps.contains("1")) {
                i = 1;
            } else if (temps.contains("2")) {
                i = 2;
            } else if (temps.contains("3")) {
                i = 3;
            } else if (temps.contains("4")) {
                i = 4;
            } else if (temps.contains("5")) {
                i = 5;
            } else if (temps.contains("6")) {
                i = 6;
            } else if (temps.contains("7")) {
                i = 7;
            } else if (temps.contains("8")) {
                i = 8;
            } else if (temps.contains("9")) {
                i = 9;
            } else if (temps.contains("0")) {
                i = 0;
            } else {
                throw new WrongIban("Falscher Iban");
            }
            z[n] = i;
            if (n == 0) {
                x = i;
            } else {
                x = (x * 10) + i;
            }
            if (n % 2 == 0) {
                if (n > 1) {
                    x = x % 97;
                    x = x * 1;
                }
            }

        }

        x = x % 97;
        x = 98 - x;
        String out = "";
        for (int n = 0; n < s.length(); n++) {
            out = out + z[n];
        }
        return x;
    }

    public static int Testiban(String s) throws WrongIban {
        int m = Kontrolziffer(s);
        m = (m + 98) % 97;
        if (m != 1) {
            String me = "00";
            char k1, k2, k3, k4;
            k1 = s.charAt(0);
            k2 = s.charAt(1);
            k3 = me.charAt(0);
            k4 = me.charAt(1);
            String s2 = "";
            for (int n = 4; n < s.length(); n++) {
                s2 = s2 + s.charAt(n);
            }
            s2 = "" + k1 + k2 + k3 + k4 + s2;
            m = Kontrolziffer(s2);
            return m;
        } else {
            return m;
        }
    }

}
