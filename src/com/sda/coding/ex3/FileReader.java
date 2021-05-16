package com.sda.coding.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * 3. Personal information
 * a. Create a file containing any personal data (name, surname, phone number). Data of
 * individual persons should be in the following lines.
 * b. Download data from a file and create objects of people based on them (in any way -
 * Regex, String.split ...).
 * c. Enter the created objects into ArrayList or Map (<line number>: <Person>).
 * d. Present the obtained data.
 */

public class FileReader {
    public static void main(String[] args)  {
        try{
            List<String> fileLines = Files.readAllLines(Paths.get("personal_data.txt"));
            for (String line : fileLines) {
                System.out.println(line);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
