import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions {

    static List<String> Questions = new ArrayList<>();
    static List<String> AnswerOption = new ArrayList<>();

    public static void startQuestions(){
        System.out.println("Выберите команду");
        System.out.println("1 - Помощь");
        System.out.println("2 - AddQ");
        System.out.println("3 - AddAO");
        System.out.println("4 - TransferT");
        System.out.println("5 - QuitP");
    }

    public static void checkOption(char num){
        switch (num){
            case '1' -> help();
            case '2' -> addQuestion();
            case '3' -> addAnswerOptions();



        }
    }


    public static void help(){
        System.out.println("AddQ - Добавить ваш вопрос");
        System.out.println("AddAO - Добавить варианты ответов");
        System.out.println("TransferT - Передать тестируемому");
        System.out.println("QuitP - Выход из программы");
        System.out.println();
    }
    public static void addQuestion(){
        System.out.println("Введите ваш вопрос");
        Scanner scanner1 = new Scanner(System.in);
        String Question = scanner1.nextLine();
        Questions.add(Question);
        System.out.println("Ваш вопрос: " + "'"+Question +"'"+ " успешно добавлен");
    }
    public static void insert(){
        Scanner scanner = new Scanner(System.in);
        char num = scanner.next().charAt(0);
    }
    public static void addAnswerOptions(){
        System.out.println("Введите варианты ответов");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите 1 вариант ответа");
        String answerOption1 = scanner1.nextLine();
        System.out.println("Ваш вариант ответа:"+"'" + answerOption1 + "'" + "успешно добвален");
        System.out.println("Введите 2 вариант ответа");
        String answerOption2 = scanner2.nextLine();
        System.out.println("Ваш вариант ответа:"+"'" + answerOption2 + "'" + "успешно добвален");
        System.out.println("Введите 3 вариант ответа");
        String answerOption3 = scanner3.nextLine();
        System.out.println("Ваш вариант ответа:"+"'" + answerOption3 + "'" + "успешно добвален");
        System.out.println("Введите 4 вариант ответа");
        String answerOption4 = scanner4.nextLine();
        System.out.println("Ваш вариант ответа:"+"'" + answerOption4 + "'" + "успешно добвален");
        AnswerOption.add(answerOption1);
        AnswerOption.add(answerOption2);
        AnswerOption.add(answerOption3);
        AnswerOption.add(answerOption4);
    }

}
