import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do{Questions.startQuestions();
            Scanner scanner = new Scanner(System.in);
            char num = scanner.next().charAt(0);
            Questions.checkOption(num);


        }while (Questions.insert() != '5');
        System.out.println("сас");
    }
}