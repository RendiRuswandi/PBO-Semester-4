import java.util.Scanner;

public class Object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Electronic");
            System.out.println("2. Clothing");
            System.out.println("3. Food");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih opsi anda : ");
            int menu = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (menu == 1) {
                // Electronic
                System.out.print("Masukan Nama Brand : ");
                String name = sc.nextLine();
                System.out.print("Masukan Harga : ");
                double price = sc.nextDouble();
                System.out.print("Masukan Garansi (in years): ");
                int warranty = sc.nextInt();
                Electronic el = new Electronic(name, price, warranty);
                el.infoProduct();
            } else if (menu == 2) {
                // Clothing
                System.out.print("Enter Brand Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter Size: ");
                int size = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Enter Material: ");
                String material = sc.nextLine();
                Clothing cl = new Clothing(name, price, size, material);
                cl.infoProduct();
            } else if (menu == 3) {
                // Food
                System.out.print("Enter Brand Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                sc.nextLine(); // Consume newline
                System.out.print("Enter Expiration Date: ");
                String expired = sc.nextLine();
                Food food = new Food(name, price, expired);
                food.infoProduct();
            } else if (menu == 4) {
                // Exit
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}

//