package com.kodewala.educationallearningsystem;

class ProgrammingCourse extends Course {

    private int numberOfModules;
    private int hoursPerModule;

    ProgrammingCourse(String title, int modules, int hoursPerModule) {
        super(title); // constructor chaining
        this.numberOfModules = modules;
        this.hoursPerModule = hoursPerModule;
    }

    @Override
    int calculateDuration() {
        return numberOfModules * hoursPerModule;
    }
}
