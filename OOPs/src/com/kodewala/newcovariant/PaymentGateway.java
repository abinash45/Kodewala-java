package com.kodewala.newcovariant;

class Payment
{
    public PaymentMethod doPayment()
    {
        System.out.println("Payment Successful!!!!");
        return new PaymentMethod();
    }
}

class UPI extends Payment
{
    @Override
    public Paytm doPayment()
    {
        System.out.println("UPI Payment Successful!!!!");
        return new Paytm();
    }
}

class Card extends Payment
{
    @Override
    public SBI doPayment()
    {
        System.out.println("Card Payment Successful!!!!");
        return new SBI();
    }
}

class NetBanking extends Payment
{
    @Override
    public HDFC doPayment()
    {
        System.out.println("NetBanking Payment Successful!!!!");
        return new HDFC();
    }
}

public class PaymentGateway {

    public static void main(String[] args) {

        Payment pay = new Payment();
        pay.doPayment();

        Payment upi = new UPI();
        upi.doPayment();

        Payment card = new Card();
        card.doPayment();

        Payment nb = new NetBanking();
        nb.doPayment();
    }
}
