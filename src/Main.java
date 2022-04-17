import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputFile inputFile = new InputFile();
        OutputFile outputFile = new OutputFile();
        Offset offset = new Offset();
        BruteMethod brute = new BruteMethod();
        Scanner scanner = new Scanner(System.in);
        int key;
        String inputFileString, menuChoice;

        System.out.println("Программа шифровки/дешифровки методом Цезаря");
        System.out.println("Введите файл ввода данных: ");
        inputFileString = scanner.nextLine();

        while (inputFileString == null || inputFileString.equals("")){
            inputFileString = scanner.nextLine();

        }
        System.out.println("Для зашифровки/расшифровки - 1\n"
                + "Для поиска ключа (Brute Force) - 2");

        while (true) {
            menuChoice = scanner.nextLine();
            if (menuChoice.equals("0")){
                break;
            } else if (menuChoice.equals("1")) {

                System.out.print("Выберите диапазон сдвига(от -50 до 50): ");
                key = scanner.nextInt();
                while (key < -50 || key > 50){
                    System.out.println("Введите коректное значение");
                    key = scanner.nextInt();
                }
                inputFile.InputFile(inputFileString);
                String offsetMethod = offset.coderString(inputFile.inputString, key);
                outputFile.OutputFile(offsetMethod);
                scanner.close();
                break;

            } else if (menuChoice.equals("2")) {
                System.out.println("Введите клчевое слово для поиска соответствия:");
                String keyWord = scanner.nextLine();
                inputFile.InputFile(inputFileString);
                brute.FindKey(inputFile.inputString, keyWord);
                scanner.close();
                break;
            }else{
                System.out.println("Некоректное значение");
            }
        }

    }
}
