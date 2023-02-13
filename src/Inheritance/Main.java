package Inheritance;

public class Main {
    public static void main(String[] args) {
        Honda honda = new Honda("Manual");

        honda.ChangeHondaSpeed(20, 5);

        honda.Stop();
    }
}
