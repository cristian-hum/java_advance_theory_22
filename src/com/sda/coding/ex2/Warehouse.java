package com.sda.coding.ex2;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class Warehouse {

    private Map<Item, Integer> inventory = new HashMap<>();

    public void addItem(Item item, Integer qty) {
        this.inventory.put(item, qty);
    }


    public void displayAllItems() {
        System.out.println("-----\ndisplayAllItems");
        this.inventory.forEach((k, v) -> System.out.println(k + " " + v + " pcs"));
    }

    public void displayOneItem(Item item) {
        System.out.println("-----\ndisplayOneItem");
        System.out.println("The chosen item is " + item.getName() + ", its quantity is: " + this.inventory.get(item));
    }

    public void updateItemQuantity(Item item, Integer qty) throws NullPointerException, IllegalArgumentException {
        System.out.println("-----\nupdateItemQuantity");
        Integer oldValue = this.inventory.replace(item, qty);
        System.out.printf("The old quantity for %s was %s, the new quantity is %s\n", item.getName(), oldValue, qty);
    }

    public void deleteItemFromInventory(Item item) {
        System.out.printf("-----\ndeleteItemFromInventory (%s)\n", item.getName());

        if (inventory.containsKey(item)) {
            this.inventory.remove(item);
            System.out.printf("Item %s has been removed from the inventory.\n", item);
        } else {
            System.out.println("The chosen item doesn't appear in inventory, removal impossible");
        }
    }

    public void summary() {
        System.out.println("-----\nsummary");

        //cate items sunt in inventar
        System.out.println("The warehouse contains " + this.inventory.size() + " items.");

        //care este cantitatea totala de bucati pe toate itemsurile
        final int[] qty = {0};
        this.inventory.forEach((k, v) -> qty[0] += v);
        System.out.println("The total quantity of all items in inventory is " + qty[0] + " pcs.");

        //care este valoarea totala a bunurilor din depozit
        final double[] totalValue = {0};
        this.inventory.forEach((k, v) -> totalValue[0] += k.getValue() * v);
        System.out.println("The total value of goods in inventory is " + totalValue[0]);
    }

    public void stringBasedUpdate(String input) {
        //0. if (string.contains("-")) {Split it.
        //  else show invalid input

        //1. breakdown string based on  : character using RegEx. takes inputString, gives keyString, valueString

        //2. compare keyString with item.getNameString. if equal return item.  else return null

        //3. interpret string2. if type is integer && integer!<=0 -> update quantity
        //                      else if + || - and then integer add or subtract quantity
        //                      else invalid input
    }

    private String[] splitter(String input) {
        String[] parts = new String[2];
        if (input.contains(":")) {
            parts = input.split(":", 2);
        } else {
            System.out.println("Invalid input.");
        }
        return parts;
    }

    private Item inputNameValidation(String string1) {
        for (Item item : this.inventory.keySet()) {
            if (string1.equalsIgnoreCase(item.getName())) {
                return item;
            }
        }
        return null;
    }

    private boolean checkStringFormat(String input) {
        return input.matches("[-+]?[1-9]\\d*|0");
    }
    //verifica daca stringul respecta formatul doar cifre sau +/-cifre

    private int inventoryQuantityModifierDirection(String input) {
        int sens = 2;
        if (input.matches("[1-9]\\d*|0")) {
            sens = 0;
        } else if ('-' == input.charAt(0)) {
            sens = -1;
        } else if ('+' == input.charAt(0)) {
            sens = 1;
        }
        return sens;
    }
    //recupereaza sensul operatiei intr-un int +1, 0 sau -1
    // sens 2 este eroare

    private int quantityModificationFromString(String input) {
        int value = Integer.parseInt(input.replaceAll("[^0-9]", ""));
        return value;
    }

    public void modifyInventoryQuantity(String input) {
        int sens;
        int cantitate;
        String[] splitString = splitter(input);

        Item chosenItem = inputNameValidation(splitString[0]);
        if (isNull(chosenItem)) {
            System.out.println("the selected item is not found in the inventory");
            return;
        }

        if (!checkStringFormat(splitString[1])) {
            System.out.println("the chosen quantity is not valid");
            return;
        }

        sens = inventoryQuantityModifierDirection(splitString[1]);
        cantitate = quantityModificationFromString(splitString[1]);

        Integer qty = null;

        switch (sens) {
            case 0:
                qty = cantitate;
                updateItemQuantity(chosenItem, qty);
                break;
            case -1, 1:
                qty = sens * cantitate;
                updateItemQuantity(chosenItem, this.inventory.get(chosenItem) + qty);
                break;
            default:
                System.out.println("Something went wrong111");
        }

    }

    //recupereaza numarul de dupa operatie

    //daca primul caracter este + up

    private int interpretQuantityUpdateInstruction(String input) {
        int buffer = 0;
        int sensOperatie = 2;

        //verific daca incepe cu + sau -
        if ('+' == input.charAt(0)) {
            buffer = 1;
            sensOperatie = 1;
        } else if ('-' == input.charAt(0)) {
            buffer = 1;
            sensOperatie = -1;
        } else { // daca nu incepe cu +/- verific daca e numar
            buffer = 0;
        }

        for (int i = buffer; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                System.out.println("The string does not respect the format \"+/-number\" ");
                break;
            } else {
                sensOperatie = 0;
            }
        } //verific daca ce ramane e numar sau nu

//        switch (sensOperatie){
//            case 0:
//        }
        return sensOperatie;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "inventory=" + inventory +
                "}\n";
    }
}
