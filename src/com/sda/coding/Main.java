//package com.sda.coding;
//
//import com.sda.coding.ex1.JavaDeveloper;
//import com.sda.coding.ex2.Item;
//import com.sda.coding.ex2.Warehouse;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Ex 1");
//        JavaDeveloper jd = new JavaDeveloper("Grigoras", "fancy developer", 69);
//        System.out.println(jd);
//
////        jd.isHuman();
//
//        jd.eats("Pizza");
//        System.out.println("\n--------------------------------\n");
//        System.out.println("Ex 2");
//
////        //initializare Items
////        Item cola = new Item("Cola", 2.5);
////        Item pepsi = new Item("Pepsi", 2);
////        Item ciuc = new Item("Ciuc",3.5);
////
////        //initializare warehouse
////        Warehouse drinks = new Warehouse();
////
////        drinks.addItem(cola,(Integer) 5);
////        drinks.addItem(pepsi,(Integer) 10);
////        drinks.addItem(ciuc,(Integer) 21);
////
////        drinks.displayAllItems();
////
////        drinks.updateItemQuantity(cola,69);
////
////        drinks.displayOneItem(cola);
////
////        drinks.deleteItemFromInventory(cola);
////        drinks.deleteItemFromInventory(cola);
////
////        drinks.summary();
////
////        System.out.println("----------------");
////        drinks.modifyInventoryQuantity("Ciuc:5");
////        drinks.modifyInventoryQuantity("Ciuc:-5");
////        drinks.modifyInventoryQuantity("Ciuc:+6");
////        drinks.modifyInventoryQuantity("Ciuc:50.");
////        drinks.modifyInventoryQuantity("Ciuc:5a");
////        drinks.modifyInventoryQuantity("Ciuc:-a5");
////        drinks.modifyInventoryQuantity("Ciuc:5.5");
////
////        drinks.displayOneItem(ciuc);
//
//        System.out.println("\n--------------------------------\n");
//        System.out.println("Ex 3");
//
//        String[] listaPersoane = new String[10];
//        int position = 0;
//
//        try {
//            File file = new File("personal data.txt");
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                String data = scanner.nextLine();
//                System.out.println(data);
//                listaPersoane[position] = data;
//                position++;
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//            e.printStackTrace();
//        }
//
//
//        String[] person1Attributes = listaPersoane[0].split(" ");
//        String[] person2Attributes = listaPersoane[1].split(" ");
//        String[] person3Attributes = listaPersoane[2].split(" ");
//
//    }
//
//
//}
