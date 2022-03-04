package Enum.exercicio_3;

public class OrderItem {
    private Integer quantity;
    private Double price;

    public Double subTotal(){
        return quantity * price;
    }
}
