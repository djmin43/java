package org.example.class1;

public class ProductOrderMain {

    public static void main(String[] args) {

        int sum = 0;
        ProductOrder order1 = new ProductOrder();
        order1.price = 30;
        order1.productName = "product 1";
        order1.quantity = 10;

        ProductOrder order2 = new ProductOrder();
        order2.price = 60;
        order2.productName = "product 2";
        order2.quantity = 300;

        ProductOrder[] products = {order1, order2};

        for (ProductOrder product : products) {
            System.out.println("name: " + product.productName);
            sum += product.price;
        }

        System.out.println("total :" + sum);


    }
}
