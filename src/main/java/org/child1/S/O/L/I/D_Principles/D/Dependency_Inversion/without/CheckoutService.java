package org.child1.S.O.L.I.D_Principles.D.Dependency_Inversion.without;

public class CheckoutService {
    private StripePayment paymentprocessor=new StripePayment();
    void checkout()
    {
        paymentprocessor.payment();
        System.out.println("Paid using:"+paymentprocessor);
    }

    //so here if you want to change from StripePayment kinds obj to Paytm Payment kinda
    //obj, you would have change the high level class as well.
}
