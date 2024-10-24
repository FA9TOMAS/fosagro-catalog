package view;

import model.product.ProductCatalog;
import java.util.Scanner;
import model.Fertilizer;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Добавить удобрение");
            System.out.println("2. Удалить удобрение");
            System.out.println("3. Показать каталог");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите название удобрения: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите тип удобрения: ");
                    String type = scanner.nextLine();
                    System.out.print("Введите цену удобрения: ");
                    double price = scanner.nextDouble();
                    catalog.addFertilizer(new Fertilizer(name, type, price));
                    break;

                case 2:
                    System.out.print("Введите название удобрения для удаления: ");
                    String nameToRemove = scanner.nextLine();
                    catalog.removeFertilizer(nameToRemove);
                    break;

                case 3:
                    catalog.displayFertilizers();
                    break;

                case 4:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
