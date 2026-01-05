package com.kodewala.educationallearningsystem;

abstract class Course {

    protected String courseTitle;

    // Constructor
    Course(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    // Abstract method
    abstract int calculateDuration(); // duration in hours

    // Concrete method
    void showCourseDetails() {
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Duration: " + calculateDuration() + " hours");
    }
}