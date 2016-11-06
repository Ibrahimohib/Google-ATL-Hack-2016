package edu.xula.atlhack.csgo;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by bsafford on 11/5/16.
 */

public class SkillPage extends Activity {

    private LinearLayout mSkillsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.user_skill_list);

        mSkillsList = (LinearLayout) findViewById(R.id.skills_ll);
        mSkillsList.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate_up));

        super.onCreate(savedInstanceState);
    }


}
