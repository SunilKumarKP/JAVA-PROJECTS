package com.org.statergy;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
