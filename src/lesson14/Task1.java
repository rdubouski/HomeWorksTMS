package lesson14;

//Программа для копирования файлов

import java.io.File;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String path;
        File myFile;

        while (true) {
            System.out.print("""
                ==============================
                1 - Вывести все файлы в папке.
                2 - Узнать размер файла.
                3 - Скопировать файл.
                4 - Удалить файл.
                5 - Выход.
                ==============================
                \s""");
            System.out.print("\nВаш выбор: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("\nВведите путь к папке: ");
                    path = scanner.nextLine();
                    myFile = new File(path);
                    WorkWithFiles.showFiles(myFile);
                    System.out.println();
                    break;
                case "2":
                    System.out.print("\nВведите имя файла: ");
                    path = scanner.nextLine();
                    myFile = new File(path);
                    WorkWithFiles.showSize(myFile);
                    System.out.println();
                    break;
                case "3":
                    System.out.print("\nВведите имя файла для копирования: ");
                    path = scanner.nextLine();
                    myFile = new File(path);
                    WorkWithFiles.copyFile(myFile);
                    System.out.println();
                    break;
                case "4":
                    System.out.print("\nВведите имя файла для удаления: ");
                    path = scanner.nextLine();
                    myFile = new File(path);
                    WorkWithFiles.deleteFile(myFile);
                    System.out.println();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("\nНекорректный выбор!");
            }
        }
    }
}
