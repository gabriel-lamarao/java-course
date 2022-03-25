package enums.exercicio_3;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<Item> items = new ArrayList<>();

    public Order() {
        this.moment = new Date();
    }

    public Order(OrderStatus status, String clientName, String clientEmail, Date birthDate){
        this.moment = new Date();
        this.status = status;
        this.client = new Client(clientName, clientEmail, birthDate);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public Double total(){
        Double total = 0.0;
        for (Item i : items) {
            total += i.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: " + status);
        sb.append("\nClient: " + client.getName());
        sb.append(" (" + sdf.format(client.getBirthDate()) + ")");
        sb.append(" - " + client.getEmail());
        sb.append("\nOrder items:\n");
        for (Item oi:
             items) {
            sb.append(oi.getName() + ", " + "$" + oi.getPrice() +
                    " Quantity: " + oi.getQuantity() +
                    " Subtotal: " + oi.subTotal() + "\n");
        }
        sb.append("\nTotal price: " + "$" + total());

        return sb.toString();
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(String clientName, String clientEmail, Date birthDate) {
        this.client = new Client(clientName, clientEmail, birthDate);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
