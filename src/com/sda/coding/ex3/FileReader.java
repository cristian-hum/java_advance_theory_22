package com.sda.coding.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        String[] listaPersoane = new String[10];
        int position = 0;

        try{
            File file = new File("personal data.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
                listaPersoane[position] = data;
                position++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
