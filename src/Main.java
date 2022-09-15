import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sesli harf girin(Büyük harf şeklinde): ");
        char letter = scanner.next().charAt(0);

        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harfler");
                break;
            default:
                System.out.println("İnce sesli harfliler");
        }
    }
}