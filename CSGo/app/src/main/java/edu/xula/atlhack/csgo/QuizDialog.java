package edu.xula.atlhack.csgo;

//import android.app.Activity;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by ajenejohnson on 11/6/16.
 */

public class QuizDialog extends DialogFragment {
    public static final String TAG = QuizDialog.class.getSimpleName();

    /** The system calls this to get the DialogFragment's layout, regardless
     of whether it's being displayed as a dialog or an embedded fragment. */
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout to use as dialog or embedded fragment
//        return inflater.inflate(R.layout.quizres, container, false);
//    }
    private QuestionAnswer questionAnswer;
    public static MainScreen caller;
    /** The system calls this only when creating the layout in a dialog. */
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // The only reason you might override this method when using onCreateView() is
        // to modify any dialog characteristics. For example, the dialog includes a
        // title by default, but your custom layout might not need it. So here you can
        // remove the dialog title, but you must call the superclass to get the Dialog.
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        return dialog;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout to use as dialog or embedded fragment
        View v = inflater.inflate(R.layout.quizres, container, false);
        TextView t = (TextView) v.findViewById(R.id.questionTitle);
        TextView tv = (TextView) v.findViewById(R.id.question);
        t.setText(questionAnswer.questionType);
        tv.setText(questionAnswer.question);

        final RadioButton a = (RadioButton) v.findViewById(R.id.answerA);
        a.setText(questionAnswer.getOption(0));

        final RadioButton b = (RadioButton) v.findViewById(R.id.answerB);
        b.setText(questionAnswer.getOption(1));

        final RadioButton c = (RadioButton) v.findViewById(R.id.answerC);
        c.setText(questionAnswer.getOption(2));

        final RadioButton d = (RadioButton) v.findViewById(R.id.answerD);
        d.setText(questionAnswer.getOption(3));

        Button submit = (Button) v.findViewById(R.id.submit);
        submit.setText("Submit");

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                RadioButton a = (RadioButton) v.findViewById(R.id.answerA);
//                RadioButton b = (RadioButton) v.findViewById(R.id.answerB);
//                RadioButton c = (RadioButton) v.findViewById(R.id.answerC);
//                RadioButton d = (RadioButton) v.findViewById(R.id.answerD);
                CharSequence cs = "You have succesfully answered the question";


                if (getArguments().get("Answer").equals(questionAnswer.getOption(0)) && a.isChecked()) {
                    Log.v(TAG, "right answer :)");
                    caller.helloWorld(true);
                    dismiss();
                }else if (getArguments().get("Answer").equals(questionAnswer.getOption(1)) && b.isChecked()) {
                    Log.v(TAG, "right answer :)");
                    caller.helloWorld(true);
                    dismiss();
                }else if (getArguments().get("Answer").equals(questionAnswer.getOption(2)) && c.isChecked()) {
                    Log.v(TAG, "right answer :)");
                    caller.helloWorld(true);
                    dismiss();
                }else if (getArguments().get("Answer").equals(questionAnswer.getOption(3)) && d.isChecked()) {
                    Log.v(TAG, "right answer :)");
                    caller.helloWorld(true);
                    dismiss();
                }else{
                    Log.v(TAG, "wrong answers :(");
                    caller.helloWorld(false);
                    dismiss();
                }


            }
        });

        return v;
    }

//    QuestionAnswer java2 = new QuestionAnswer("Java: Level 2", getResources().getString(R.string.java_question_2),
//            getResources().getStringArray(R.array.java_question_2_options),getResources().getString(R.string.java_question_2_answer));
//    QuestionAnswer java3 = new QuestionAnswer("Java: Level 3", getResources().getString(R.string.java_question_3),
//            getResources().getStringArray(R.array.java_question_3_options),getResources().getString(R.string.java_question_3_answer));
//
//    QuestionAnswer python1 = new QuestionAnswer("Python: Level 1",getResources().getString(R.string.python_question_1),
//            getResources().getStringArray(R.array.python_question_1_options),getResources().getString(R.string.python_question_1_answer));
//    QuestionAnswer python2 = new QuestionAnswer("Python: Level 2",getResources().getString(R.string.python_question_2),
//            getResources().getStringArray(R.array.python_question_1_options),getResources().getString(R.string.python_question_2_answer));
//    QuestionAnswer python3 = new QuestionAnswer("Python: Level 3", getResources().getString(R.string.python_question_3),
//            getResources().getStringArray(R.array.python_question_1_options),getResources().getString(R.string.python_question_3_answer));
//
//    QuestionAnswer c1 = new QuestionAnswer("C++: Level 1",getResources().getString(R.string.cplusplus_question_1),
//            getResources().getStringArray(R.array.cplusplus_question_1_options),getResources().getString(R.string.cplusplus_question_1_answer));
//    QuestionAnswer c2 = new QuestionAnswer("C++: Level 2",getResources().getString(R.string.cplusplus_question_2),
//            getResources().getStringArray(R.array.cplusplus_question_2_options),getResources().getString(R.string.cplusplus_question_2_answer));
//    QuestionAnswer c3 = new QuestionAnswer("C++: Level 3",getResources().getString(R.string.cplusplus_question_3),
//            getResources().getStringArray(R.array.cplusplus_question_3_options),getResources().getString(R.string.cplusplus_question_3_answer));
//
//    QuestionAnswer js1 = new QuestionAnswer("JavaScript: Level 1",getResources().getString(R.string.javascript_question_1),
//            getResources().getStringArray(R.array.javascript_question_1_options),getResources().getString(R.string.javascript_question_1_answer));
//    QuestionAnswer js2 = new QuestionAnswer("JavaScript: Level 2",getResources().getString(R.string.javascript_question_2),
//            getResources().getStringArray(R.array.javascript_question_2_options),getResources().getString(R.string.javascript_question_2_answer));
//    QuestionAnswer js3 = new QuestionAnswer("JavaScript: Level 3",getResources().getString(R.string.javascript_question_3),
//            getResources().getStringArray(R.array.javascript_question_3_options),getResources().getString(R.string.javascript_question_3_answer));
//
//    QuestionAnswer html1 = new QuestionAnswer("HTML: Level 1",getResources().getString(R.string.html_question_1),
//            getResources().getStringArray(R.array.html_question_1_options),getResources().getString(R.string.html_question_1_answer));
//    QuestionAnswer html2 = new QuestionAnswer("HTML: Level 2",getResources().getString(R.string.html_question_2),
//            getResources().getStringArray(R.array.html_question_2_options),getResources().getString(R.string.html_question_2_answer));
//    QuestionAnswer html3 = new QuestionAnswer("HTML: Level 3",getResources().getString(R.string.html_question_3),
//            getResources().getStringArray(R.array.html_question_3_options),getResources().getString(R.string.html_question_3_answer));

    public static QuizDialog newInstance(QuestionAnswer qa, MainScreen callerin) {
        QuizDialog f = new QuizDialog();

        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putString("QuestionType", qa.questionType);
        args.putString("Question", qa.question);
        args.putStringArray("Options", qa.options);
        args.putString("Answer", qa.rightAns);
        f.setArguments(args);
        caller = callerin;
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        String quesType = getArguments().getString("QuestionType");
//        QuestionAnswer java1 = new QuestionAnswer("Java: Level 1",getResources().getString(R.string.java_question_1),
//                getResources().getStringArray(R.array.java_question_1_options), getResources().getString(R.string.java_question_1_answer));

        questionAnswer = new QuestionAnswer(getArguments().getString("QuestionType"), getArguments().getString("Question"),
                getArguments().getStringArray("Options"), getArguments().getString("Answer"));

    }



    public void checkAnswer(View view){

    }

}
