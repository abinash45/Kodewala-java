package com.kodewala.educationallearningsystem;

class DesignCourse extends Course {

    private int numberOfLessons;

    DesignCourse(String title, int lessons) {
        super(title); // constructor chaining
        this.numberOfLessons = lessons;
    }

    @Override
    int calculateDuration() {
        return numberOfLessons * 2; // each lesson = 2 hours
    }
}