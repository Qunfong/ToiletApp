package com.man.toiletapp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

public class SessionAdapter extends BaseAdapter {
    private final Context mContext;
    private final Session[] mSessions;

    public SessionAdapter(Context context, Session[] sessions) {
        this.mContext = context;
        this.mSessions = sessions;
    }

    @Override
    public int getCount() {
        return mSessions.length;
    }

    @Override
    public Object getItem(int position) {
        return mSessions[position];
    }

    @Override
    public long getItemId(int position) {
        return position-1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Session session = mSessions[position];

        if(convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_toilet_session,parent,false);
        }
        Typeface titleFont = Typeface.createFromAsset(mContext.getAssets(),  "fonts/Bearskin.otf");
        Typeface descriptionFont = Typeface.createFromAsset(mContext.getAssets(),  "fonts/AlwaysForever.ttf");

        TextView sessionNameTextView = (TextView) convertView.findViewById(R.id.textview_session_name);
        sessionNameTextView.setTypeface(titleFont);
        TextView participantsTextView = (TextView) convertView.findViewById(R.id.textview_participants);
        participantsTextView.setTypeface(descriptionFont);
        sessionNameTextView.setText(session.getName());
        participantsTextView.setText(session.getParticipantList());
        return convertView;

    }
}
