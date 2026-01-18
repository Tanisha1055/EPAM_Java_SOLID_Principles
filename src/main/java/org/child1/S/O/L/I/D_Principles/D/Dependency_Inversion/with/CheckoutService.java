package org.child1.S.O.L.I.D_Principles.D.Dependency_Inversion.with;

public class CheckoutService {
    private PaymentProcessor paymentprocessor;
    void findPaymentmethod(PaymentProcessor paymentprocessor)
    {
        this.paymentprocessor=paymentprocessor;
    }
    void checkout()
    {
        paymentprocessor.payment();
        System.out.println("Paid using:"+paymentprocessor);
    }
    //here dynamically at runtime we are injecting the obj of the payment interface
    //so later if we want to change the payment method, to the one which implements
    //the PaymentProcess interface , which is of that type , we can directly inject
    //the obj of it , without needing to change the high level class.
    //this way the code is more flexible and maintainable .
    //Also it is easy to test , as would to just inject mock in place of interface kinda
    //arg . (You can easily test CheckoutService by passing in a mock PaymentProcessor.)
}
