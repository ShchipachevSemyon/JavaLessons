package com.company.laba12.Example35_03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Example35_03_01 {

    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\tmp\\films.txt");
            if (!f1.exists()) f1.createNewFile();
            File f2 = new File("C:\\tmp\\rusFilms.txt");
            if (!f2.exists()) f2.createNewFile();

            RandomAccessFile aF = new RandomAccessFile(f1, "rw");
            RandomAccessFile rF = new RandomAccessFile(f2, "rw");

            Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

            System.out.println("Введите количество фильмов =>\n");
            int kol = scanner.nextInt();
            scanner.nextLine();

            String filmName, filmCountry, filmGenre;
            int filmYear, rentalCost;

            for (int i = 0; i < kol; i++) {
                System.out.println("Введите название" + (i + 1) + "фильма => ");
                filmName = scanner.next();
                aF.seek(aF.length());
                aF.writeUTF(filmName);
                for (int j = 0; j < 40 - filmName.length(); j++) {
                    aF.writeByte(1);
                }
                System.out.println("Введите страну выпуска фильма => ");
                filmCountry = scanner.next();
                aF.writeUTF(filmCountry);
                for (int j = 0; j < 40 - filmCountry.length(); j++) {
                    aF.writeByte(1);
                }

                System.out.println("Введите жанр фильма => ");
                filmGenre = scanner.next();
                aF.seek(aF.length());
                aF.writeUTF(filmGenre);
                for (int j = 0; j < 40 - filmGenre.length(); j++) {
                    aF.writeByte(1);
                }

                System.out.println("Введите год выпуска фильма => ");
                filmYear = scanner.nextInt();
                aF.writeInt(filmYear);

                System.out.println("Введите стоимость проката => ");
                rentalCost = scanner.nextInt();
                aF.writeInt(rentalCost);

            }
            aF.close();

            aF = new RandomAccessFile(f1, "r");

            aF.seek(0);

            for (int i = 0; i < kol; i++) {
                filmName = aF.readUTF();
                for (int j = 0; j < 40 - filmName.length(); j++) {
                    aF.readByte();
                }
                filmCountry = aF.readUTF();
                for (int j = 0; j < 40 - filmCountry.length(); j++) {
                    aF.readByte();
                }
                filmGenre = aF.readUTF();
                for (int j = 0; j < 30 - filmGenre.length(); j++) {
                    aF.readByte();
                }
                filmYear = aF.readInt();
                rentalCost = aF.readInt();

                if (filmCountry.equals("Россия") || filmCountry.equals("РФ") || filmCountry.equals("россия")) {

                    System.out.println("Следующий фильм записан в файл ");
                    rF.seek(rF.length());
                    System.out.println("Название фильма: " + filmName);
                    rF.writeUTF(filmName);
                    for (int k = 0; k < 40 - filmName.length(); k++) rF.writeByte(1);

                    System.out.println("Наименование страны: " + filmCountry);
                    rF.writeUTF(filmCountry);
                    for (int k = 0; k < 40 - filmCountry.length(); k++) rF.writeByte(1);

                    System.out.println("Жанр фильма: " + filmGenre);
                    rF.writeUTF(filmGenre);
                    for (int k = 0; k < 40 - filmGenre.length(); k++) rF.writeByte(1);

                    System.out.println("Год выпуска: " + filmYear);
                    rF.writeInt(filmYear);

                    System.out.println("Стоимость проката: " + rentalCost);
                    rF.writeInt(rentalCost);
                    System.out.println();
                }

            }
            aF.close();
            rF.close();

        } catch (IOException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }
}
