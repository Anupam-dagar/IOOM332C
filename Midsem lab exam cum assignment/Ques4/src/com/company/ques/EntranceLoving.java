package com.company.ques;

public class EntranceLoving extends Sitting {

    public EntranceLoving()
    {
        super();
    }
    public void insertPerson(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
    {
        int flag = 0;
        for (int i = 0; i < columns; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (flagArray[j][i] == 0)
                {
                    flagArray[j][i] = 1;
                    person[j][i] = personArg;
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
