package com.kodewala.interfaces.paymentservices;

public interface OnlinePayment extends Payment , Refund{
 
 void generateReceipt ();
 
}
