package carOps_iis20113;

import java.util.UUID;

enum PaymentType {
    CASH,
    CARD
}
public class Payment {
	private String paymentId;
    private String customerId;
    private double amount;
    private PaymentType paymentType;

    public Payment(String customerId, double amount, PaymentType paymentType) {
        this.paymentId = UUID.randomUUID().toString();
        this.customerId = customerId;
        this.amount = amount;
        this.paymentType = paymentType;
    }
}
