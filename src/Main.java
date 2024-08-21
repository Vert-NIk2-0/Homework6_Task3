public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Молоко", 2.0, 5.0);
        Product product2 = new Product("Кефир", 1.9, 4.9);
        Product product3 = new Product("Булочка 'сметанник'", 1.1, 4.3);
        Product product4 = new Product("Булочка с маком>", 1.1, 4.5);
        Product product5 = new Product("Булочка с повидлом", 1.3, 4.9);

        Category category1 = new Category("Молочная продукция", product1, product2);
        Category category2 = new Category("Хлебобулочные изделия}", product3, product4, product5);

        User user1 = new User("Никита", "1234", new Basket(product1, product2, product5));
        User user2 = new User("Максим", "1111", new Basket(product2, product4, product5));

        System.out.println("\ncategory1:\n" + category1);
        System.out.println("\ncategory2:\n" + category2);

        System.out.println("\nuser1:\n" + user1);
        System.out.println("\nuser2:\n" + user2);
    }
}