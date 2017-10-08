package com.company.ques;

public class Insert {
    public Insert(){}

    public void insertFirst(Receptionist[] receptionists, int[][] flagArray, int[] singleFlagArray, Person[][] person, Person[] singlePerson, int row, int column, int counter)
    {
        int current = 0;
        int count = 0;
        int tempIndex = 0;
            while (count < counter)
            {
                if (receptionists[current].getTypeReceptionist().equals("first"))
                {
                    for (int i = 0; i < counter; i++)
                    {
                        if (singleFlagArray[i] == 0) {
                                singleFlagArray[i] = 1;
                                if (singlePerson[i].getBehaviour().equals("SL"))
                                {
                                    insertSL(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("BB"))
                                {
                                    insertBack(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("EL"))
                                {
                                    insertEntrance(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("C"))
                                {
                                    insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("CL"))
                                {
                                    insertCL(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                        }
                    }
                }
                if (receptionists[current].getTypeReceptionist().equals("methodological"))
                {
                    String min = "ZZZZZZZZZZZZ";
                    for (int i = 0; i < counter; i++)
                    {
                        if (singlePerson[i].getName().compareTo(min) < 0)
                        {
                            if (singleFlagArray[i] == 0)
                            {
                                min = singlePerson[i].getName();
                                tempIndex = i;
                            }
                        }
                    }
                        if (singleFlagArray[tempIndex] == 0) {
                            singleFlagArray[tempIndex] = 1;
                            if (singlePerson[tempIndex].getBehaviour().equals("SL"))
                            {
                                insertSL(flagArray, person, singlePerson[tempIndex], row, column);
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("BB"))
                            {
                                insertBack(flagArray, person, singlePerson[tempIndex], row, column);
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("EL"))
                            {
                                insertEntrance(flagArray, person, singlePerson[tempIndex], row, column);
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("C"))
                            {
                                insertCelebrity(flagArray, person, singlePerson[tempIndex], row, column);
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("CL"))
                            {
                                insertCL(flagArray, person, singlePerson[tempIndex], row, column);
                                count = count + 1;
                            }
                        }
                }
                if (receptionists[current].getTypeReceptionist().equals("OnePerType")) {
                    int flag = 0;
                    while (flag == 0)
                    {
                        if (receptionists[current].getCounter() == 0) {
                            for (int i = 0; i < counter; i++) {
                                if (singlePerson[i].getType().equals("breaker")) {
                                    if (singleFlagArray[i] == 0) {
                                        singleFlagArray[i] = 1;
                                        if (singlePerson[i].getBehaviour().equals("SL"))
                                        {
                                            insertSL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            insertBack(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            insertEntrance(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            insertCL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (receptionists[current].getCounter() == 1) {
                            for (int i = 0; i < counter; i++) {
                                if (singlePerson[i].getType().equals("VIP")) {
                                    if (singleFlagArray[i] == 0) {
                                        singleFlagArray[i] = 1;
                                        if (singlePerson[i].getBehaviour().equals("SL"))
                                        {
                                            insertSL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            insertBack(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            insertEntrance(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            insertCL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (receptionists[current].getCounter() == 2) {
                            for (int i = 0; i < counter; i++) {
                                if (singlePerson[i].getType().equals("commoner")) {
                                    if (singleFlagArray[i] == 0) {
                                        singleFlagArray[i] = 1;
                                        if (singlePerson[i].getBehaviour().equals("SL"))
                                        {
                                            insertSL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            insertBack(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            insertEntrance(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            insertCL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (receptionists[current].getCounter() == 3) {
                            for (int i = 0; i < counter; i++) {
                                if (singlePerson[i].getType().equals("event")) {
                                    if (singleFlagArray[i] == 0) {
                                        singleFlagArray[i] = 1;
                                        if (singlePerson[i].getBehaviour().equals("SL"))
                                        {
                                            insertSL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            insertBack(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            insertEntrance(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            insertCL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (receptionists[current].getCounter() == 4) {
                            for (int i = 0; i < counter; i++) {
                                if (singlePerson[i].getType().equals("brand")) {
                                    if (singleFlagArray[i] == 0) {
                                        singleFlagArray[i] = 1;
                                        if (singlePerson[i].getBehaviour().equals("SL"))
                                        {
                                            insertSL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            insertBack(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            insertEntrance(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            insertCL(flagArray, person, singlePerson[i], row, column);
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        receptionists[current].incrementCounter(receptionists[current].getCounter());
                        if (receptionists[current].getCounter() == 5) {
                            receptionists[current].setCounter(0);
                        }

                }
                }
                if (receptionists[current].getTypeReceptionist().equals("VIP"))
                {
                    for (int i = 0; i < counter; i++)
                    {
                        if (singlePerson[i].getType().equals("VIP"))
                        {
                            if (singleFlagArray[i] == 0)
                            {
                                singleFlagArray[i] = 1;
                                if (singlePerson[i].getBehaviour().equals("SL"))
                                {
                                    insertSL(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("BB"))
                                {
                                    insertBack(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("EL"))
                                {
                                    insertEntrance(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("C"))
                                {
                                    insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("CL"))
                                {
                                    insertCL(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (receptionists[current].getTypeReceptionist().equals("breaker"))
                {
                    for (int i = 0; i < counter; i++)
                    {
                        if (singlePerson[i].getType().equals("breaker"))
                        {
                            if (singleFlagArray[i] == 0)
                            {
                                singleFlagArray[i] = 1;
                                if (singlePerson[i].getBehaviour().equals("SL"))
                                {
                                    insertSL(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("BB"))
                                {
                                    insertBack(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("EL"))
                                {
                                    insertEntrance(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("C"))
                                {
                                    insertCelebrity(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("CL"))
                                {
                                    insertCL(flagArray, person, singlePerson[i], row, column);
                                    count = count + 1;
                                    break;
                                }
                            }
                        }
                    }
                }
                current = current + 1;
                if (current == receptionists.length)
                {
                    current = 0;
                }
            }
        }

    public void insertBack(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
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

    public void insertEntrance(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
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

    public void insertCelebrity(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
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

    public void insertCL(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
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
    }

    public void insertSL(int[][] flagArray, Person[][] person, Person personArg, int rows, int columns)
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
    }
}
