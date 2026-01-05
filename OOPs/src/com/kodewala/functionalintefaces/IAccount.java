package com.kodewala.functionalintefaces;

@FunctionalInterface
public interface IAccount {
   void manageAccount ();
   //void details(); Invalid '@FunctionalInterface' annotation; IAccount is not a functional interface
   // SAM - Single Abstract Method 
   // if abstract got one interfce it is functional 
   // functional saying what u are doiing not how in java 8 
   // why it is used ? - To achieve lambda functionality
}
