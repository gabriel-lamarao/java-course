package heranca.employee;

public class Program {

    public static void main(String[] args) {
        Employee ep1 = new Employee();
        Employee ep2 = new OutsorcedEmployee();

        ep1.setName("Alex");
        ep1.setHours(100);
        ep1.setValuePerHour(20.0);

        ep2.setName("Maria");
        ep2.setHours(100);
        ep2.setValuePerHour(20.0);
        // upcasting
        ((OutsorcedEmployee) ep2).setAdditionalCharge(200.0);

        ep1.addEmployee();
        ep2.addEmployee();


        System.out.println(ep1);
        System.out.println(ep2);

        ep1.removeEmployee();
        System.out.println(ep1);
        System.out.println(ep2);
    }
}
