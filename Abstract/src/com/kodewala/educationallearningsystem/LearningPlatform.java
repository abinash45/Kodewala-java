package com.kodewala.educationallearningsystem;

public class LearningPlatform {

    public static void main(String[] args) {

        // Using abstract class reference (polymorphism)
        Course course1 = new ProgrammingCourse("Java Programming", 10, 3);
        course1.showCourseDetails();

        System.out.println();

        Course course2 = new DesignCourse("UI/UX Design", 8);
        course2.showCourseDetails();

        // Course course = new Course("General Course"); // Compile-time error
    }
}