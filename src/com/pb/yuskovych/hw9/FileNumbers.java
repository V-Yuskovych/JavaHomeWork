package com.pb.yuskovych.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) throws IOException {
        createNumbersFile("D:\\numbers.txt");
        createOddNumbersFile("D:\\numbers.txt", "D:\\odd-numbers.txt");
    }

    static void createNumbersFile(String fileNumbers) throws IOException {
        File fileNumber = new File(fileNumbers);
        fileNumber.createNewFile();

        int counter = 0;
        FileWriter wr = new FileWriter(fileNumber);

        for (int i = 0; i <= 99; i++) {
            Random random = new Random();
            int r = random.nextInt(100);
            counter++;
            if (counter % 10 == 0)
                wr.write(r + System.lineSeparator());
            else
                wr.write(r + " ");
        }
        wr.close();
    }


    static void createOddNumbersFile(String fileNumbers, String fileOddNumbers) {
        Path pathFrom = Paths.get(fileNumbers);
        Path pathTo = Paths.get(fileOddNumbers);
        pathFrom.toAbsolutePath();

        try (BufferedWriter writer = Files.newBufferedWriter(pathTo)) {
            BufferedReader reader = Files.newBufferedReader(pathFrom);
            String line;
            while ((line = reader.readLine()) != null) {
                String numbers[] = line.split(" ");

                for (int i = 0; i < 10; i++) {
                    if (Integer.parseInt(numbers[i]) % 2 == 0) {
                        numbers[i] = "0";
                    }
                    writer.write(numbers[i] + " ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
        pathTo.toAbsolutePath();
    }
}
