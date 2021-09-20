package module18.activity.service;

public interface OnlinePaymentService {
    Double paymentFee(double amount);
    Double interest(double amount, int month);
}
