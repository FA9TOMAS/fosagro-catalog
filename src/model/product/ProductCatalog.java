package model.product;

import java.util.ArrayList;
import java.util.List;
import model.Fertilizer;

public class ProductCatalog {
    private List<Fertilizer> fertilizers;

    public ProductCatalog() {
        fertilizers = new ArrayList<>();
    }

    // добавляет удобрение в каталог.
    public void addFertilizer(Fertilizer fertilizer) {
        fertilizers.add(fertilizer);
    }

    // удаляет удобрение из каталога по его названию. Использует метод removeIf,
    // чтобы найти удобрение, содержащее указанное имя.
    public void removeFertilizer(String name) {
        fertilizers.removeIf(fertilizer -> fertilizer.toString().contains(name));
    }

    // отображает все удобрения в каталоге. Если каталог пуст, выводит сообщение об
    // этом.
    public void displayFertilizers() {
        if (fertilizers.isEmpty()) {
            System.out.println("Каталог пуст.");
        } else {
            for (Fertilizer fertilizer : fertilizers) {
                System.out.println(fertilizer);
            }
        }
    }
}
