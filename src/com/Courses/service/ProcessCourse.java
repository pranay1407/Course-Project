package com.Courses.service;

import com.Courses.main.CourseList;

public class ProcessCourse
{
    private CourseList course;
    public void setCourse(CourseList course)
    {
        this.course = course;
    }

    public void processCourse(double amount)
    {
        boolean status = course.courseChoice(amount);
        if (status)
           System.out.println("Successfully selected the course..! All the best");
        else
            System.out.println("error in processing with course enrollment");

    }


}
