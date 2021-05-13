package com.sda.input.output;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        readDataFromFile();
//        writeDataToFile();
//        readObjectFromFile();
//        writeDataToFile();

        sample();

    }

    /**
     * Create a file with a „lorem ipsum” paragraph within – it can be done by copy-pasting
     * existing paragraph or generating it dynamically using Java library. Read that file.
     * a) Count words.
     * b) *Count special signs (like comma, dot, spaces).
     * c) *Select one word and print it’s number of occurences.
     */
    public static void sample() {
        try {
            // Count words.
            List<String> contentList = Files.readAllLines(Paths.get("my-data.txt"));

            int counter = 0;
            int signCounter = 0;
            int counterRepeatWord = 0;

            for (String line: contentList) {
                // luam fiecare caracter din line
                for(int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);

                    if(Character.isAlphabetic(c) || Character.isDigit(c)) {
                        // pass
                    } else {
                        signCounter++;
                    }
                }

                if(!line.equals("")) {

                    // lista cu toate cuvintele din rand
                    String[] words = line.split(" ");

                    for(String word: words) {
                        if(word.equalsIgnoreCase("ipsum")) {
                            counterRepeatWord++;
                        }
                    }

                    counter += words.length;
                }
            }


            System.out.println("Total Words: " + counter);
            System.out.println("Sign counter: " + signCounter);
            System.out.println("Ipsum Repeat: " + counterRepeatWord + " times");
            // ana + are + mere + rosii + delicioase
            // ana are + mere + rosii + delicioase
            // ana are mere + rosii + delicioase
            // are are mere rosii + delicioase
            // ana are mere rosii delicoare

//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append("ana").append("are").append("mere").append("rosii").append("delicioase");
//
//            System.out.println(stringBuilder.toString());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void readWriteFileSampleVersion() {
        try {
            // citirea din fisier pre-scurtata!
            List<String> fileLines = Files.readAllLines(Paths.get("my-data.txt"));

            for(String line : fileLines) {
                System.out.println(line);
            }

            List<String> dataContent = Arrays.asList("first line", "second line");

            // scriere in fisier, trebuie sa ii specificam locatia fisierului impreuna cu nume + EXTENSIE!
            Files.write(Paths.get("my-data.txt"), dataContent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeObjectToFile() {
        Person person = new Person("Catalin", "catalin.halic@gmail.com");

        try {
            // se genereaza fisierul in care vom salva obiectul
            FileOutputStream fileOutputStream = new FileOutputStream("person-file.txt");

            // ObjectOutputStream -> este clasa care va transforma obiectul person in text
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // writeObject -> va scrie obiectul de mai sus in fisier
            objectOutputStream.writeObject(person);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Person -> salvat in fisier!");
        }
    }

    public static void readObjectFromFile() {
        try {
            System.out.println("Citire Person din fisier!");

//            Clasa care ne ajuta sa citim fisierul de pe hard;
            FileInputStream fileInputStream = new FileInputStream("person-file.txt");

//            ObjectInputStream -> citeste obiectul din stream-ul obtinut mai sus
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//            Facem cast la obiectul Person, si preluam obiectul din fisier
            Person personFromFile = (Person) objectInputStream.readObject();

//            afisare data
            System.out.println("Date din fisier:");
            System.out.println(personFromFile.getName());
            System.out.println(personFromFile.getEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeDataToFile() {
        List<String> dataList = new ArrayList<>();
        dataList.add("Principile OOP");
        dataList.add("Incapsulare");
        dataList.add("Mostenire");
        dataList.add("Abstractizare");
        dataList.add("Polimorfism");


        // output-data.txt - este numele fisierului in care vom salva data
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output-data.txt"))) {
            // parcurgem lista de stringuri
            for (String data : dataList) {
                // scriem fiecare linie in fisier
                // \n - este caracterul pentru o linie noua
                bufferedWriter.write("\n" + data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readDataFromFile() {
        // BufferedReader - ne ajuta sa interpertam date obtinute de la FileReader
        // FileReader - ne ajuta sa citim fisierul
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("my-data.txt"))) {
            // contine fiecare linie din fisier
            String line;

//         line = bufferedReader.readLine() -> citeste fiecare linie din buffer (din fisier)
//         line este egal cu null inseamna ca a ajuns la finalul fisierului
//            int contor = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
//                contor++;
            }

//            System.out.println("Linii fisier: " + contor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
