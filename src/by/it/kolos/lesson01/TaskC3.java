package by.it.kolos.lesson01;

public class TaskC3 {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.printf("%8s %4d %8s %8s %n", binary, i, octal, hex);
        }
    }
}

