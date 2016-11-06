package edu.xula.atlhack.csgo;

/**
 * Created by Almighty on 11/5/2016.
 */

public class QuestionAnswer {
    String questionType;
    String question;
    String[] options;
    String rightAns;
    String userAns;

    public QuestionAnswer(String qType, String q, String[] ops, String ans)
    {
        questionType = qType;
        question = q;
        options = ops;
        rightAns= ans;
    }

//    public void getUserAnswer(int i)
//    {
//        userAns = i;
//    }
//
//    public String getAnswer()
//    {
//        return rightAns;
//    }
//
    public String getOption(int i)
    {
        return options[i];
    }
//
//    public boolean isRight(int i)
//    {
//        if(rightAns.equals(userAns))
//            return true;
//        else
//            return false;
//    }
}
