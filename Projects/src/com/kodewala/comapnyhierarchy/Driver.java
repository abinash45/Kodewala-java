package com.kodewala.comapnyhierarchy;

public class Driver {

    public static void main(String[] args) {

        SoftwareEngineer se =
                new SoftwareEngineer(
                        45,"Ritika Sajdeh",60000,"Java",10000 );
        SeniorSoftwareEngineer senior =
                new SeniorSoftwareEngineer(
                     45,"Rohit Sharma",80000, "Java",15000 );

        System.out.println("---- Senior Software Engineer ----");
        senior.showSeniorEngineerDetails();

        System.out.println("---- Software Engineer ----");
        se.showSoftwareEngineerDetails();
        
    }
}
