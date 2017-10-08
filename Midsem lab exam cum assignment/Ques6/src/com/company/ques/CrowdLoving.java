package com.company.ques;

public class CrowdLoving extends Sitting {

    public CrowdLoving()
    {
        super();
    }
    @Override
    public void insertPerson(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns, String receptionistName)
    {
        int left = 0;
        int right = 0;
        int maxCount = -1;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (flagArray[i][j] == 0)
                {
                    for (left = j-1; left >= 0; left--)
                    {
                        if (flagArray[i][left] != 1)
                        {
                            break;
                        }
                    }
                    for (right = j+1; right < columns; right++)
                    {
                        if (flagArray[i][right] != 1)
                        {
                            break;
                        }
                    }
                }
                left = left + 1;
                right = right - 1;
                if ((right - left + 1) > maxCount)
                {
                    maxCount = (right - left + 1);
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        flagArray[rowIndex][colIndex] = 1;
        person[rowIndex][colIndex] = personArg;
        person[rowIndex][colIndex].setReceptionistName(receptionistName);
    }
}
