package com.Courses.dao;

import com.Courses.main.CourseList;

public class Java implements CourseList
{
    @Override
    public boolean courseChoice(double amount)
    {
        System.out.println("Java Course is purchase with amount:"+amount);
        return true;
    }
}
