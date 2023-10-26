package ucu.apps.lab8.flowers.flower;

public interface Payment {
    String creditCard(String info);
    String PayPal(String email);
}
