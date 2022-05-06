// Семенов Арсений Владимирович, 3 курс, 62 группа, лабораторная 4

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static Human GetHumanInfo(String line)
    {
        String split[] = line.split(";");
        for (String s : split)
        {
            System.out.println(s);
        }
        return null;
    }

    public static void main(String[] args)
    {
        LinkedList<Human> list = new LinkedList<Human>();

        Scanner in = new Scanner(System.in);
        String fileName = "foreign_names.csv";
        File file = new File(fileName);
        try
        {
            Scanner read = new Scanner(file);
            read.nextLine();
            while (read.hasNext())
            {
                list.add(GetHumanInfo(read.next()));
                //System.out.println(read.nextLine());
                in.nextLine();
            }
            read.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
