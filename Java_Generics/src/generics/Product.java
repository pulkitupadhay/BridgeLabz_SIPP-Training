package generics;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() { return "Books"; }
}

class ClothingCategory implements Category {
    public String getCategoryName() { return "Clothing"; }
}

class GadgetCategory implements Category {
    public String getCategoryName() { return "Gadgets"; }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category.getCategoryName());
    }
}

class DiscountService {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
}
