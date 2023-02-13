package JavaProgrammingMasterClass;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        }

        System.out.println(kilobytes + " KB = " + Math.round(kilobytes / 1024) + " MB and " + kilobytes % 1024 + " KB");
    }
}
