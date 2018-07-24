package com.jinming.lawaid.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinming.lawaid.R;

public class FragmentMe extends Fragment {
    public static FragmentMe newInstance(Bundle args){
        FragmentMe me=new FragmentMe();
        me.setArguments(args);
        return me;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View convertView=inflater.inflate(R.layout.fragment_me,container,false);
        return convertView;
    }
}
