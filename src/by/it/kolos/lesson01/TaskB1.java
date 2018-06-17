package by.it.kolos.lesson01;

public class TaskB1 {
    public static void main(String[] args) {
        Integer a = 34;
        Integer b = 27;
        String binarya = Integer.toBinaryString(a);
        String binaryb = Integer.toBinaryString(b);
        System.out.println(a + " - " + binarya + " " + b + " - " + binaryb);

        Integer c = 50;
        String binaryc = Integer.toBinaryString(c);
        System.out.println(c + " - " + binaryc);
        String hexc = Integer.toHexString(c);
        System.out.println(c + " - " + hexc);

        Integer d=134;
        Integer e=-5;
        String binaryd=Integer.toBinaryString(d);
        String binarye=Integer.toBinaryString(e);
        System.out.println(d + " - " + binaryd + " " + e+ " - " + binarye);

        Integer g=192;
        Integer j=168;
        Integer k=100;
        Integer n=7;
        String hexg=Integer.toHexString(g);
        String hexj=Integer.toHexString(j);
        String hexk=Integer.toHexString(k);
        String hexn=Integer.toHexString(n);
        System.out.println(g+"."+j+"."+k+"."+n+"."+" - "+hexg+"."+hexj+"."+hexk+"."+hexn+".");
    }
}
