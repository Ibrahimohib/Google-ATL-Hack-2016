package edu.xula.atlhack.csgo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bsafford on 11/5/16.
 */

public class SkillAdapter extends BaseAdapter {

    Context context;
    String[] skill;
    private static LayoutInflater inflater = null;

    public SkillAdapter(Context context, String[] skill) {
        this.context = context;
        this.skill = skill;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return skill.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return skill[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
//        if (vi == null)
//            vi = inflater.inflate(R.layout.skill_item, null);

//        TextView text = (TextView) vi.findViewById(R.id.text);
//        text.setText(data[position]);
        return vi;
    }
}




