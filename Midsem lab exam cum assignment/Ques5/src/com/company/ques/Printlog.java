package com.company.ques;

public class Printlog {

    public Printlog(){}
    public void print(Receptionist[] receptionists, Person[][] person, int rows, int columns)
    {
        int position;
        for (int i = 0; i < receptionists.length; i++)
        {
            System.out.println(receptionists[i].getNameReceptionist());
            for (int j = 0; j < rows; j++)
            {
                for (int k = 0; k < columns; k++)
                {
                    if (receptionists[i].getTypeReceptionist().equals("first"))
                    {
                        if (receptionists[i].getNameReceptionist().equals(person[j][k].getReceptionistName())) {
                            position = (j * columns) + k + 1;
                            System.out.println(position + " " + person[j][k].getName());
                        }
                    }
                    if (receptionists[i].getTypeReceptionist().equals("methodological"))
                    {
                        if (receptionists[i].getNameReceptionist().equals(person[j][k].getReceptionistName())) {
                            System.out.println(person[j][k].getName());
                        }
                    }
                    if (receptionists[i].getTypeReceptionist().equals("OnePerType"))
                    {
                        if (receptionists[i].getNameReceptionist().equals(person[j][k].getReceptionistName())) {
                            System.out.println(person[j][k].getType() + " " + person[j][k].getName());
                        }
                    }
                    if (receptionists[i].getTypeReceptionist().equals("VIP"))
                    {
                        if (receptionists[i].getNameReceptionist().equals(person[j][k].getReceptionistName())) {
                            System.out.println(person[j][k].getName());
                        }
                    }
                }
            }
        }
    }
}
