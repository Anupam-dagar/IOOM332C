package com.company.ques;

public class Celebrity extends Sitting {

    public Celebrity()
    {
        super();
    }
    public void insertPerson(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
    {
        int flag = 0;
        for (int i = 0; i < rows; i++)
        {
            if (columns % 2 == 1)
            {
                for (int j = columns/2; j >= 0; j--)
                {
                    if (flagArray[i][j] == 0)
                    {
                        flagArray[i][j] = 1;
                        person[i][j] = personArg;
                        flag = 1;
                        break;
                    }
                    if (flagArray[i][columns - j - 1] == 0)
                    {
                        flagArray[i][columns - j - 1] = 1;
                        person[i][columns - j - 1] = personArg;
                        flag = 1;
                        break;
                    }
                }
            }
            else
            {
                for (int j = (columns/2) - 1; j >= 0 ; j--)
                {
                    if (flagArray[i][j] == 0)
                    {
                        flagArray[i][j] = 1;
                        person[i][j] = personArg;
                        flag = 1;
                        break;
                    }
                    if (flagArray[i][columns - j - 1] == 0)
                    {
                        flagArray[i][columns - j - 1] = 1;
                        person[i][columns - j - 1] = personArg;
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1)
            {
                break;
            }
        }
    }
}
