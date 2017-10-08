package com.company.ques;

public class Backbenchers extends Sitting {

    public Backbenchers()
    {
        super();
    }
    public void insertPerson(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
    {
        int flag = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (flagArray[rows - i - 1][columns - j - 1] == 0)
                {
                    flagArray[rows - i - 1][columns - j - 1] = 1;
                    person[rows - i - 1][columns - j - 1] = personArg;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
            {
                break;
            }
        }
    }
}
