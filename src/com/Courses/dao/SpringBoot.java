package com.Courses.dao;

import com.Courses.main.CourseList;

public class SpringBoot implements CourseList
{
    @Override
    public boolean courseChoice(double amount)
    {
        System.out.println("SpringBoot Course is purchase with amount:"+amount);
        return true;
    }
}
