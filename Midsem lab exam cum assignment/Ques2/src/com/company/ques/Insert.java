package com.company.ques;

public class Insert {
    public Insert(){}

    public void insertBreakers(int[][] flagArray, Person[][] person, Breakers breakers, int rows, int columns)
    {
        int flag = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (flagArray[rows - i - 1][columns - j - 1] == 0)
                {
                    flagArray[rows - i - 1][columns - j - 1] = 1;
                    person[rows - i - 1][columns - j - 1] = breakers;
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

    public void insertEntrance(int[][] flagArray, Person[][] person, BrandPromotions brandPromo, int rows, int columns)
    {
        int flag = 0;
        for (int i = 0; i < columns; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                    if (flagArray[j][i] == 0)
                    {
                        flagArray[j][i] = 1;
                        person[j][i] = brandPromo;
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

    public void insertCelebrity(int[][] flagArray, Person[][] person, Vip vip, int rows, int columns)
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
                        person[i][j] = vip;
                        flag = 1;
                        break;
                    }
                    if (flagArray[i][columns - j - 1] == 0)
                    {
                        flagArray[i][columns - j - 1] = 1;
                        person[i][columns - j - 1] = vip;
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
                        person[i][j] = vip;
                        flag = 1;
                        break;
                    }
                    if (flagArray[i][columns - j - 1] == 0)
                    {
                        flagArray[i][columns - j - 1] = 1;
                        person[i][columns - j - 1] = vip;
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

    public void insertCL(int[][] flagArray, Person[][] person, Commoners commoners, int rows, int columns)
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
        person[rowIndex][colIndex] = commoners;
    }

    public void insertSL(int[][] flagArray, Person[][] person, EventPromotions eventpromo, int rows, int columns)
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
        person[rowIndex][colIndex] = eventpromo;
    }
}
