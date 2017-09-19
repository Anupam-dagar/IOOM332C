package com.company.assignment1ques2;

public class sort {
    private Assignment temporary = new Assignment();

    //function to sort assignment array according to deadline and assignment ID
    public static void sortarray(Assignment[] assignmentArray)
    {
        Assignment temporary = new Assignment();
        for (int i = 0; i < assignmentArray.length - 1; i++)
        {
            for (int j = 0; j < assignmentArray.length - i - 1; j++)
            {
                if(assignmentArray[i].getDeadline().getYear() > assignmentArray[j].getDeadline().getYear())
                {
                    temporary = assignmentArray[j];
                    assignmentArray[j] = assignmentArray[j+1];
                    assignmentArray[j+1] = temporary;
                }
                else if (assignmentArray[j].getDeadline().getYear() == assignmentArray[j+1].getDeadline().getYear())
                {
                    if (assignmentArray[j].getDeadline().getMonth() > assignmentArray[j+1].getDeadline().getMonth())
                    {
                        temporary = assignmentArray[j];
                        assignmentArray[j] = assignmentArray[j+1];
                        assignmentArray[j+1] = temporary;
                    }
                    else if (assignmentArray[j].getDeadline().getMonth() == assignmentArray[j+1].getDeadline().getMonth())
                    {
                        if (assignmentArray[j].getDeadline().getDay() == assignmentArray[j+1].getDeadline().getDay())
                        {
                            if (assignmentArray[j].getAssignmentId().charAt(0) <= '9' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                            {
                                if(Integer.parseInt(assignmentArray[j].getAssignmentId()) > Integer.parseInt(assignmentArray[j+1].getAssignmentId()))
                                {
                                    temporary = assignmentArray[j];
                                    assignmentArray[j] = assignmentArray[j+1];
                                    assignmentArray[j+1] = temporary;
                                }
                            }
                            else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                            {
                                temporary = assignmentArray[j];
                                assignmentArray[j] = assignmentArray[j+1];
                                assignmentArray[j+1] = temporary;
                            }
                            else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) >= 'A')
                            {
                                if (assignmentArray[j].getAssignmentId().charAt(0) == assignmentArray[j+1].getAssignmentId().charAt(0))
                                {
                                    if (Integer.parseInt(assignmentArray[j].getAssignmentId().substring(1)) > Integer.parseInt(assignmentArray[j+1].getAssignmentId().substring(1)) )
                                    {
                                        temporary = assignmentArray[j];
                                        assignmentArray[j] = assignmentArray[j+1];
                                        assignmentArray[j+1] = temporary;
                                    }
                                }
                                if (assignmentArray[j].getAssignmentId().charAt(0) > assignmentArray[j+1].getAssignmentId().charAt(0))
                                {
                                    temporary = assignmentArray[j];
                                    assignmentArray[j] = assignmentArray[j+1];
                                    assignmentArray[j+1] = temporary;
                                }

                            }

                        }
                        else if (assignmentArray[j].getDeadline().getDay() > assignmentArray[j+1].getDeadline().getDay())
                        {
                            temporary = assignmentArray[j];
                            assignmentArray[j] = assignmentArray[j+1];
                            assignmentArray[j+1] = temporary;
                        }
                    }
                }
            }
        }
    }

    public static void sort1(Assignment[] assignmentArray)
    {
        Assignment temporary = new Assignment();
        for (int i = 0; i < assignmentArray.length - 1; i++)
        {
            for (int j = 0; j < assignmentArray.length - i - 1; j++)
            {
                if (assignmentArray[j].getBaseMarks() < assignmentArray[j+1].getBaseMarks())
                {
                    temporary = assignmentArray[j];
                    assignmentArray[j] = assignmentArray[j+1];
                    assignmentArray[j+1] = temporary;
                }
                else if (assignmentArray[j].getBaseMarks() == assignmentArray[j+1].getBaseMarks())
                {
                    if (assignmentArray[j].getAssignmentId().charAt(0) <= '9' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                    {
                        if(Integer.parseInt(assignmentArray[j].getAssignmentId()) > Integer.parseInt(assignmentArray[j+1].getAssignmentId()))
                        {
                            temporary = assignmentArray[j];
                            assignmentArray[j] = assignmentArray[j+1];
                            assignmentArray[j+1] = temporary;
                        }
                    }
                    else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                    {
                        temporary = assignmentArray[j];
                        assignmentArray[j] = assignmentArray[j+1];
                        assignmentArray[j+1] = temporary;
                    }
                    else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) >= 'A')
                    {
                        if (assignmentArray[j].getAssignmentId().charAt(0) == assignmentArray[j+1].getAssignmentId().charAt(0))
                        {
                            if (Integer.parseInt(assignmentArray[j].getAssignmentId().substring(1)) > Integer.parseInt(assignmentArray[j+1].getAssignmentId().substring(1)) )
                            {
                                temporary = assignmentArray[j];
                                assignmentArray[j] = assignmentArray[j+1];
                                assignmentArray[j+1] = temporary;
                            }
                        }
                        if (assignmentArray[j].getAssignmentId().charAt(0) > assignmentArray[j+1].getAssignmentId().charAt(0))
                        {
                            temporary = assignmentArray[j];
                            assignmentArray[j] = assignmentArray[j+1];
                            assignmentArray[j+1] = temporary;
                        }

                    }
                }
            }
        }
    }

    public static void sort2(Assignment[] assignmentArray)
    {
        Assignment temporary = new Assignment();
        for (int i = 0; i < assignmentArray.length - 1; i++)
        {
            for (int j = 0; j < assignmentArray.length - i -1; j++)
            {
                if (assignmentArray[j].getAssignmentId().charAt(0) <= '9' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                {
                    if(Integer.parseInt(assignmentArray[j].getAssignmentId()) > Integer.parseInt(assignmentArray[j+1].getAssignmentId()))
                    {
                        temporary = assignmentArray[j];
                        assignmentArray[j] = assignmentArray[j+1];
                        assignmentArray[j+1] = temporary;
                    }
                }
                else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) <= '9')
                {
                    temporary = assignmentArray[j];
                    assignmentArray[j] = assignmentArray[j+1];
                    assignmentArray[j+1] = temporary;
                }
                else if (assignmentArray[j].getAssignmentId().charAt(0) >= 'A' && assignmentArray[j+1].getAssignmentId().charAt(0) >= 'A')
                {
                    if (assignmentArray[j].getAssignmentId().charAt(0) == assignmentArray[j+1].getAssignmentId().charAt(0))
                    {
                        if (Integer.parseInt(assignmentArray[j].getAssignmentId().substring(1)) > Integer.parseInt(assignmentArray[j+1].getAssignmentId().substring(1)) )
                        {
                            temporary = assignmentArray[j];
                            assignmentArray[j] = assignmentArray[j+1];
                            assignmentArray[j+1] = temporary;
                        }
                    }
                    if (assignmentArray[j].getAssignmentId().charAt(0) > assignmentArray[j+1].getAssignmentId().charAt(0))
                    {
                        temporary = assignmentArray[j];
                        assignmentArray[j] = assignmentArray[j+1];
                        assignmentArray[j+1] = temporary;
                    }

                }
            }
        }
    }
}
