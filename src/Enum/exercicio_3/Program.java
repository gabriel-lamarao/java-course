package Enum.exercicio_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Order order = new Order();

        Scanner sc = new Scanner(System.in);
        int numberItems;
        String clientName;
        String email;
        String birthDate;
        String status;
        String productName;
        double productPrice;
        int productQuantity;

        
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        clientName = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        birthDate = sc.nextLine();
        order.setClient(clientName, email, sdf.parse(birthDate));
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        status = sc.next();
        order.setStatus(OrderStatus.valueOf(status));
        System.out.print("How many items to this order? ");
        numberItems = sc.nextInt();
        for (int i = 0; i < numberItems; i++) {
            Item item = new Item();
            System.out.println("Enter #" + i + "item data:");
            System.out.print("Product name: ");
            productName = sc.next();
            item.setName(productName);
            System.out.print("Product price: ");
            productPrice = sc.nextDouble();
            item.setPrice(productPrice);
            System.out.print("Quantity: ");
            productQuantity = sc.nextInt();
            item.setQuantity(productQuantity);
            order.addItem(item);
        }
        sc.close();
        System.out.println(order);
    }
}
