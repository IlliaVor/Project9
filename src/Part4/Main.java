package Part4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] prices = new int[5];
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of pizza " + (i + 1) + ": ");
            names[i] = in.nextLine();

            while (true) {
                try {
                    System.out.print("Enter the price of pizza " + (i + 1) + ": ");
                    prices[i] = Integer.parseInt(in.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid price.");
                }
            }
        }


        Pizza[] pizzas = new Pizza[5];


        for (int j = 0; j < 5; j++) {
            pizzas[j] = new Pizza(names[j], prices[j]);
        }


        Arrays.sort(pizzas);


        System.out.println("Pizzas sorted by price:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getPizzaInfo());
        }

        in.close();

    }


}




