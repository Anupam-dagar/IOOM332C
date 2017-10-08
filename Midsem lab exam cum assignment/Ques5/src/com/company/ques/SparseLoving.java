package com.company.ques;

public class SparseLoving extends Sitting {

    public SparseLoving()
    {
        super();
    }
    @Override
    public void insertPerson(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns, String receptionistName)
    {
        int temp = 0;
        int maxCount = -1;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (flagArray[i][j] == 0)
                {
                    for (temp = j; temp < columns; temp++)
                    {
                        if (flagArray[i][temp] != 0)
                        {
                            temp = temp - 1;
                            break;
                        }
                    }
                    if (temp == columns)
                    {
                        temp = temp - 1;
                    }
                    if ((temp - j + 1) > maxCount)
                    {
                        maxCount = (temp - j + 1);
                        rowIndex = i;
                        colIndex = (temp + j)/2;
                    }
                }
            }
        }

        flagArray[rowIndex][colIndex] = 1;
        person[rowIndex][colIndex] = personArg;
        person[rowIndex][colIndex].setReceptionistName(receptionistName);
    }
}
