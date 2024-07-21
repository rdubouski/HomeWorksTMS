package lesson14;

import java.io.*;

public class WorkWithFiles {

    public static void showFiles(File myFolder) {
        if (myFolder.exists()) {
            File[] listOfFiles = myFolder.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                File file = listOfFiles[i];
                System.out.println(file.getAbsolutePath());
            }
        } else {
            System.out.println("\nТакой папки не существует!\n");
        }
    }

    public static void showSize(File myFile) {
        if (myFile.exists()) {
            System.out.printf("Размер файла: %d байт\n", myFile.length());
        } else {
            System.out.println("\nТакого файла не существует!\n");
        }
    }

    public static void deleteFile(File myFile) {
        if (myFile.exists()) {
            if (myFile.delete()) {
                System.out.printf("Файл удален: %s \n", myFile.getAbsolutePath());
            }
        } else {
            System.out.println("\nТакого файла не существует!\n");
        }
    }

    public static void copyFile(File myFile) {
        if (myFile.exists()) {
            File out = getOut(myFile);
            try (InputStream inputStream = new FileInputStream(myFile);
                 OutputStream outputStream = new FileOutputStream(out)) {
                int currentByte;
                while ((currentByte = inputStream.read()) != -1) {
                    outputStream.write(currentByte);
                    outputStream.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Копирование завершено!");
            System.out.println(out.getAbsolutePath());
        } else {
            System.out.println("\nТакого файла не существует!\n");
        }
    }

    private static File getOut(File myFile) {
        String fullFileName = myFile.getAbsolutePath();
        int dotIndex = fullFileName.lastIndexOf('.');
        String name;
        String extension;
        File out;
        if (dotIndex > 0) {
            name = fullFileName.substring(0, dotIndex);
            extension = fullFileName.substring(dotIndex + 1);
            out = new File(name + "_copy." + extension);
        } else {
            name = fullFileName;
            extension = "";
            out = new File(name + "_copy" + extension);
        }
        return out;
    }
}
