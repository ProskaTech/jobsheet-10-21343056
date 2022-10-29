package tugas.tugas1;

public class AndroMain {
    public static void main(String[] args) {
        Android sumsang = new Android();
        
        System.out.println("\n+------------------------------------+");
        System.out.println("|   Android Sumsang Made in Padang   |");
        System.out.println("+------------------------------------+\n");

        sumsang.nyala();
        sumsang.panggilan();
        sumsang.sms();
        sumsang.shutdown();
        System.out.println();

    }
}