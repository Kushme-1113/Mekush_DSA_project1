package MekushIfElse;

import java.util.Scanner;

public class ProfitLossQue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please tell the cost price: ");
        double costPrice = input.nextDouble();
        System.out.print("what is the selling price: ");
        double sellingPrice = input.nextDouble();
        if (sellingPrice > costPrice) {
            System.out.println("profit made : " + (sellingPrice-costPrice));
        }
        else if (costPrice==sellingPrice) {
            System.out.println("no profit no loss");
        }
        else {
            System.out.println("loss incurred : " + (costPrice-sellingPrice));
        }
    }

}
