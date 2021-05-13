package com.sda.inputOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        readDataFromFile();
//        writeDataToFile();
//        writeObjectToFile();
//        readObjectFromFIle();
        sample();


    }

    public static void sample() {

        try {
            //Count words
            List<String> contentList = Files.readAllLines(Paths.get("my data.txt"));

            int wordCounter = 0;
            int signCounter = 0;


            for (String line : contentList) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                    } else {
                        signCounter++;
                    }
                }

                if (!line.equals("")) {
                    int wordNumber = line.split(" ").length;
                    System.out.println(wordNumber + " - " + line);
                    wordCounter += wordNumber;
                }
            }
            System.out.println("Numarul total de cuvinte este: " + wordCounter);
            System.out.println("Numarul total de caractere speciale si spatii este: " + signCounter);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readWriteFileSampleVersion() {
        try {
            //scriere in fisier
            List<String> dataContent = Arrays.asList("First line", "second line");
            Files.write(Paths.get("my data.txt"), dataContent);

            //citire din fisier prescurtata cu readAllLines
            List<String> fileLines = Files.readAllLines(Paths.get("my data.txt"));

            for (String line : fileLines) {
                System.out.println(line);
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeDataToFile() {
        List<String> dataList = new ArrayList<>();
        dataList.add("Principiile OOP");
        dataList.add("Incapsulare");
        dataList.add("Mostenire");
        dataList.add("Abstractizare");
        dataList.add("Polimorfism");


        //output-data.txt - numele fisierului in care vom salva date, il creaza programu
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output-data.txt"))) {
            //parcurgem lista de stringuri
            for (String data : dataList) {
                //scriem fiecare linie in fisier
                bufferedWriter.write(data + "\n");
            }

        } catch (Exception e) {

        }
    }

    public static void writeObjectToFile() {
        Person person = new Person("Catalin", "catalin@gmail.com");

        try {
            //se genereaza fisierul in care vom salva obiectul
            FileOutputStream fileOutputStream = new FileOutputStream("person-file.txt");

            //ObjectOutputStream -> este clasa care va transforma obiectul person in text
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //writeObject -> va scrie obiectul de mai sus in fisier
            objectOutputStream.writeObject(person);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Am salvat obiectul person in fisierul " + "person-file.txt\n");
        }
    }

    public static void readObjectFromFIle() {
        try {
            System.out.println("Citire Person din fisier");

            //Clasa care ne ajuta sa citim fisierul de pe hard;
            FileInputStream fileInputStream = new FileInputStream("person-file.txt");

            //ObjectInputStram -> citeste obiectul din stream-ul obtinul mai sus
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //Facem cast la obiectul person si preluam obiectul din fisier
            Person personFromFile = (Person) objectInputStream.readObject();

            System.out.println(personFromFile.getName());
            System.out.println(personFromFile.getEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readDataFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("my data.txt"))) {
            String fileLine;

            while ((fileLine = bufferedReader.readLine()) != null) { //todo de inteles de ce trece la o linie noua dupa atribuirea asta
                System.out.println(fileLine);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
