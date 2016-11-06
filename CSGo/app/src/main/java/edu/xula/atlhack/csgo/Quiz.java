package edu.xula.atlhack.csgo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brianna on 11/5/2016.
 */

public class Quiz extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.quizres);
        super.onCreate(savedInstanceState);
    }

    public Map<Integer, QuestionAnswer> qaMap = new HashMap<>();
//    public void QuestionAnswer(String qType, String q, String[] ops, int ans)

    public void Quiz(){
        QuestionAnswer java1 = new QuestionAnswer("Java: Level 1",getResources().getString(R.string.java_question_1),
                getResources().getStringArray(R.array.java_question_1_options), getResources().getString(R.string.java_question_1_answer));
        QuestionAnswer java2 = new QuestionAnswer("Java: Level 2", getResources().getString(R.string.java_question_2),
                getResources().getStringArray(R.array.java_question_2_options),getResources().getString(R.string.java_question_2_answer));
        QuestionAnswer java3 = new QuestionAnswer("Java: Level 3", getResources().getString(R.string.java_question_3),
                getResources().getStringArray(R.array.java_question_3_options),getResources().getString(R.string.java_question_3_answer));

        QuestionAnswer python1 = new QuestionAnswer("Python: Level 1",getResources().getString(R.string.python_question_1),
                getResources().getStringArray(R.array.python_question_1_options),getResources().getString(R.string.python_question_1_answer));
        QuestionAnswer python2 = new QuestionAnswer("Python: Level 2",getResources().getString(R.string.python_question_2),
                getResources().getStringArray(R.array.python_question_1_options),getResources().getString(R.string.python_question_2_answer));
        QuestionAnswer python3 = new QuestionAnswer("Python: Level 3", getResources().getString(R.string.python_question_3),
                getResources().getStringArray(R.array.python_question_1_options),getResources().getString(R.string.python_question_3_answer));

        QuestionAnswer c1 = new QuestionAnswer("C++: Level 1",getResources().getString(R.string.cplusplus_question_1),
                getResources().getStringArray(R.array.cplusplus_question_1_options),getResources().getString(R.string.cplusplus_question_1_answer));
        QuestionAnswer c2 = new QuestionAnswer("C++: Level 2",getResources().getString(R.string.cplusplus_question_2),
                getResources().getStringArray(R.array.cplusplus_question_2_options),getResources().getString(R.string.cplusplus_question_2_answer));
        QuestionAnswer c3 = new QuestionAnswer("C++: Level 3",getResources().getString(R.string.cplusplus_question_3),
                getResources().getStringArray(R.array.cplusplus_question_3_options),getResources().getString(R.string.cplusplus_question_3_answer));

        QuestionAnswer js1 = new QuestionAnswer("JavaScript: Level 1",getResources().getString(R.string.javascript_question_1),
                getResources().getStringArray(R.array.javascript_question_1_options),getResources().getString(R.string.javascript_question_1_answer));
        QuestionAnswer js2 = new QuestionAnswer("JavaScript: Level 2",getResources().getString(R.string.javascript_question_2),
                getResources().getStringArray(R.array.javascript_question_2_options),getResources().getString(R.string.javascript_question_2_answer));
        QuestionAnswer js3 = new QuestionAnswer("JavaScript: Level 3",getResources().getString(R.string.javascript_question_3),
                getResources().getStringArray(R.array.javascript_question_3_options),getResources().getString(R.string.javascript_question_3_answer));

        QuestionAnswer html1 = new QuestionAnswer("HTML: Level 1",getResources().getString(R.string.html_question_1),
                getResources().getStringArray(R.array.html_question_1_options),getResources().getString(R.string.html_question_1_answer));
        QuestionAnswer html2 = new QuestionAnswer("HTML: Level 2",getResources().getString(R.string.html_question_2),
                getResources().getStringArray(R.array.html_question_2_options),getResources().getString(R.string.html_question_2_answer));
        QuestionAnswer html3 = new QuestionAnswer("HTML: Level 3",getResources().getString(R.string.html_question_3),
                getResources().getStringArray(R.array.html_question_3_options),getResources().getString(R.string.html_question_3_answer));

        qaMap.put(0, java1);
        qaMap.put(1, java2);
        qaMap.put(3, java3);
        qaMap.put(4, html1);
        qaMap.put(5, html2);
        qaMap.put(6, html3);
        qaMap.put(7, python1);
        qaMap.put(8, python2);
        qaMap.put(9, python3);
        qaMap.put(10, js1);
        qaMap.put(11, js2);
        qaMap.put(12, js3);
        qaMap.put(13, c1);
        qaMap.put(14, c2);
        qaMap.put(15, c3);

    }

    public Map<Integer, QuestionAnswer> getMap(){
        return qaMap;
    }





    public void checkAnswer(View view){

    }
}
