package com.company.ques;

public class Insert {
    public Insert(){}

    public void insertFirst(Receptionist[] receptionists, int[][] flagArray, int[] singleFlagArray, Person[][] person, Person[] singlePerson, int row, int column, int counter)
    {
        int current = 0;
        int count = 0;
        int tempIndex = 0;
        Sitting sitting;
        Backbenchers backbenchers = new Backbenchers();
        Celebrity celebrity = new Celebrity();
        CrowdLoving crowdLoving = new CrowdLoving();
        SparseLoving sparseLoving = new SparseLoving();
        EntranceLoving entranceLoving = new EntranceLoving();
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
                                    sitting = sparseLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("BB"))
                                {
                                    sitting = backbenchers;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("EL"))
                                {
                                    sitting = entranceLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("C"))
                                {
                                    sitting = celebrity;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("CL"))
                                {
                                    sitting = crowdLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                sitting = sparseLoving;
                                sitting.insertPerson(flagArray, person, singlePerson[tempIndex], row, column, receptionists[current].getNameReceptionist());
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("BB"))
                            {
                                sitting = backbenchers;
                                sitting.insertPerson(flagArray, person, singlePerson[tempIndex], row, column, receptionists[current].getNameReceptionist());
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("EL"))
                            {
                                sitting = entranceLoving;
                                sitting.insertPerson(flagArray, person, singlePerson[tempIndex], row, column, receptionists[current].getNameReceptionist());
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("C"))
                            {
                                sitting = celebrity;
                                sitting.insertPerson(flagArray, person, singlePerson[tempIndex], row, column, receptionists[current].getNameReceptionist());
                                count = count + 1;
                            }
                            if (singlePerson[tempIndex].getBehaviour().equals("CL"))
                            {
                                sitting = crowdLoving;
                                sitting.insertPerson(flagArray, person, singlePerson[tempIndex], row, column, receptionists[current].getNameReceptionist());
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
                                            sitting = sparseLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            sitting = backbenchers;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            sitting = entranceLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            sitting = celebrity;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            sitting = crowdLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                            sitting = sparseLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            sitting = backbenchers;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            sitting = entranceLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            sitting = celebrity;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            sitting = crowdLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                            sitting = sparseLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            sitting = backbenchers;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            sitting = entranceLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            sitting = celebrity;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            sitting = crowdLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                            sitting = sparseLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            sitting = backbenchers;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            sitting = entranceLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            sitting = celebrity;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            sitting = crowdLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                            sitting = sparseLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("BB"))
                                        {
                                            sitting = backbenchers;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("EL"))
                                        {
                                            sitting = entranceLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("C"))
                                        {
                                            sitting = celebrity;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                            count = count + 1;
                                            flag = 1;
                                            break;
                                        }
                                        if (singlePerson[i].getBehaviour().equals("CL"))
                                        {
                                            sitting = crowdLoving;
                                            sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                    sitting = sparseLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("BB"))
                                {
                                    sitting = backbenchers;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("EL"))
                                {
                                    sitting = entranceLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("C"))
                                {
                                    sitting = celebrity;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("CL"))
                                {
                                    sitting = crowdLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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
                                    sitting = sparseLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("BB"))
                                {
                                    sitting = backbenchers;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("EL"))
                                {
                                    sitting = entranceLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("C"))
                                {
                                    sitting = celebrity;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
                                    count = count + 1;
                                    break;
                                }
                                if (singlePerson[i].getBehaviour().equals("CL"))
                                {
                                    sitting = crowdLoving;
                                    sitting.insertPerson(flagArray, person, singlePerson[i], row, column, receptionists[current].getNameReceptionist());
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

}
