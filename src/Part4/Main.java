package Part4;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] prices = new int[5];
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of pizza " + (i + 1) + ": ");
            names[i] = in.nextLine();
            System.out.print("Enter the price of pizza " + (i + 1) + ": ");
            prices[i] = in.nextInt();
        }


        Pizza[] pizzas = new Pizza[5];


        for (int i = 0; i < 5; i++) {
            pizzas[i] = new Pizza(names[i], prices[i]);
        }


        Arrays.sort(pizzas);



        System.out.println("Pizzas sorted by price):");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getPizzaInfo());
        }

        in.close();
    }

}

