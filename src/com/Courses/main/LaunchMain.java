package com.Courses.main;

import com.Courses.dao.Java;
import com.Courses.dao.SQL;
import com.Courses.dao.SpringBoot;
import com.Courses.service.ProcessCourse;

import java.util.Scanner;

public class LaunchMain
{
    public static void main(String[] args)
    {
        ProcessCourse pc = new ProcessCourse();

        System.out.println("Welcome to Tellu Learning Channel..!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Java Choose 01 : SpringBoot Choose 02 : SQL Choose 03 :");
        int options = scan.nextInt();
        if(options == 1)
        {
            pc.setCourse(new Java());
            pc.processCourse(20000);
        }
        else if (options == 2)
        {
            pc.setCourse(new SpringBoot());
            pc.processCourse(25000);
        }
        else if(options == 3)
        {
            pc.setCourse(new SQL());
            pc.processCourse(15000);
        }
        else
        {
            System.out.println("Choose again among 1 or 2 or 3");
        }




    }
}
