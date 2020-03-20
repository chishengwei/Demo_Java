package com.chisw.demo;

public class Class_Demo01
{
    private int Int_Cnt=0;

    public Class_Demo01()
    {
        int i=0;

        while (i<100)
        {
            System.out.println("Class Create");
            i++;
        }


    }




    public static void main(String[] args)
    {
        System.out.println("Hello Deom_Class01");
        new Class_Demo02().Fn_Hello();
        new Class_Demo01().Write();
        

    }

    public void Write()
    {
        Int_Cnt++;
        System.out.println("Class_Demo01 Write");
        if (Int_Cnt==10)
        {
            return;
        }
        this.Write();

    }

    public void GetInfo()
    {
        System.out.println("Class_Demo01 GetInfo");
    }




}
