package edu.xula.atlhack.csgo;

/**
 * Created by Almighty on 11/5/2016.
 */

public class QuestionAnswer {
    String questionType;
    String question;
    String[] options;
    int rightAns;
    int userAns;

    public void QuestionAnswer(String qType, String q, String[] ops, int ans)
    {
        questionType = qType;
        question = q;
        options = ops;
        rightAns= ans;
    }

    public void getUserAnswer(int i)
    {
        userAns = i;
    }

    public String getAnswer()
    {
        return options[rightAns];
    }

    public String getOption(int i)
    {
        return options[i];
    }

    public boolean isRight(int i)
    {
        if(options[rightAns] == options[userAns])
            return true;
        else
            return false;
    }
}
