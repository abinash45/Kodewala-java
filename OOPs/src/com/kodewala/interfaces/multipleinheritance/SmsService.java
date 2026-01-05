package com.kodewala.interfaces.multipleinheritance;

public interface SmsService {
       void sendingSms();
}


// void add () = default
//public default void stopTrnx (){
//}//backward compatibilty - adding a new feature dont brk the existing code (java 8 )
//100 % implementation before java 8 , but after 8 we can addd the default method which is option which ever cls is interest can overide that 

//interfcae interfacename extends interfacename implements 