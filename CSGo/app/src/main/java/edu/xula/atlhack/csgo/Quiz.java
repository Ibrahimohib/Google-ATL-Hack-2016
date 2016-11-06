package edu.xula.atlhack.csgo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;

/**
 * Created by Brianna on 11/5/2016.
 */

public class Quiz extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.quizres);
        super.onCreate(savedInstanceState);
    }

//    public void QuestionAnswer(String qType, String q, String[] ops, int ans)


    QuestionAnswer java1 = new QuestionAnswer("Java: Level 1",R.string.java_question_1, R.array.java_question_1_options, R.string.java_question_1_answer);
    QuestionAnswer java2 = new QuestionAnswer("Java: Level 2", R.string.java_question_2,R.array.java_question_2_options,R.string.java_question_2_answer);
    QuestionAnswer java3 = new QuestionAnswer("Java: Level 3", R.string.java_question_3,R.array.java_question_3_options,R.string.java_question_3_answer);

    QuestionAnswer python1 = new QuestionAnswer("Python: Level 1",R.string.python_question_1,R.array.python_question_1_options,R.string.python_question_1_answer);
    QuestionAnswer python2 = new QuestionAnswer("Python: Level 2",R.string.python_question_2,R.array.python_question_1_options,R.string.python_question_2_answer;
    QuestionAnswer python3 = new QuestionAnswer("Python: Level 3", R.string.python_question_3,R.array.python_question_1_options,R.string.python_question_3_answer);

    QuestionAnswer c1 = new QuestionAnswer("C++: Level 1",R.string.cplusplus_question_1,R.array.cplusplus_questions_1_options,R.string.cplusplus_question_1_answer);
    QuestionAnswer c2 = new QuestionAnswer("C++: Level 2",R.string.cplusplus_question_2,R.array.cplusplus_questions_2_options,R.string.cplusplus_question_2_answer);
    QuestionAnswer c3 = new QuestionAnswer("C++: Level 3",R.string.cplusplus_question_3,R.array.cplusplus_questions_3_options,R.string.cplusplus_question_3_answer);

    QuestionAnswer js1 = new QuestionAnswer("JavaScript: Level 1",R.string.javascript_question_1,R.array.javascript_question_1_options,R.string.javascript_question_1_answer);
    QuestionAnswer js2 = new QuestionAnswer("JavaScript: Level 2",R.string.javascript_question_2,R.array.javascript_question_2_options,R.string.javascript_question_2_answer);
    QuestionAnswer js3 = new QuestionAnswer("JavaScript: Level 3",R.string.javascript_question_3,R.array.javascript_question_3_options,R.string.javascript_question_3_answer);

    QuestionAnswer html1 = new QuestionAnswer("HTML: Level 1",R.string.html_question_1,R.array.html_question_1_options,R.string.html_question_1_answer);
    QuestionAnswer html2 = new QuestionAnswer("HTML: Level 2",R.string.html_question_2,R.array.html_question_2_options,R.string.html_question_2_answer);
    QuestionAnswer html3 = new QuestionAnswer("HTML: Level 3",R.string.html_question_3,R.array.html_question_3_options,R.string.html_question_3_answer);




    public void checkAnswer(){

    }
}
