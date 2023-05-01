import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Questions {
    private static String text;
    private static char value;
    static List<String> Questions = new ArrayList<>();
    static List<String> AnswerOption = new ArrayList<>();


    public Questions(String text, char value){
        this.text = text;
        this.value = value;
    }

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
            case '3' -> addAnswerOptions1();

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
        addAnswerOptions1();
    }
    public static char insert(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);

    }

    public static void addAnswerOptions1(){
        System.out.println("Введите варианты ответов к вашему вопросу");
        for (int i = 1 ;i <= 4; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите " + i + " вариант ответа: ");
            String answerOption1 = scanner1.nextLine();
            System.out.println("Ваш вариант ответа:"+"'" + answerOption1 + "'" + "успешно добавлен");
            AnswerOption.add(answerOption1);
        }
    }


}
