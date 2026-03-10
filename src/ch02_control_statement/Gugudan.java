package ch02_control_statement;

public class Gugudan {
    static void main(String[] args) {
        int dan = 3 ;

        for (int i = 1; i < 10; i++) {
            String message = "%d * %d = %d" ;
            System.out.printf(message, dan, i, (dan * i));
            System.out.println();
        }
    }
}
