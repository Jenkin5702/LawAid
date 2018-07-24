package com.jinming.lawaid.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jinming.lawaid.R;

public class FragmentHomepage extends Fragment {
    public static FragmentHomepage newInstance(Bundle args){
        FragmentHomepage homepage=new FragmentHomepage();
        homepage.setArguments(args);
        return homepage;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View convertView=inflater.inflate(R.layout.fragment_homepage,container,false);
        return convertView;
    }
}
