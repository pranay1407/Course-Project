package com.Courses.dao;

import com.Courses.main.CourseList;

public class SQL implements CourseList
{
    @Override
    public boolean courseChoice(double amount)
    {
        System.out.println("SQL Course is purchase with amount:"+amount);
        return true;
    }
}
