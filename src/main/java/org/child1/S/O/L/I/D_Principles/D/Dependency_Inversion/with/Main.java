package org.child1.S.O.L.I.D_Principles.D.Dependency_Inversion.with;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paytm=new PaytmPayment();
        CheckoutService checkservice=new CheckoutService();
        checkservice.findPaymentmethod(paytm);
        //dynamically inject the payment type from the initialisation at runtime.
    }
}
