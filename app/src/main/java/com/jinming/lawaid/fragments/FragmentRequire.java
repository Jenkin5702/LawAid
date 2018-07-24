package com.jinming.lawaid.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinming.lawaid.R;

public class FragmentRequire extends Fragment {
    public static FragmentRequire newInstance(Bundle args){
        FragmentRequire homepage=new FragmentRequire();
        homepage.setArguments(args);
        return homepage;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View convertView=inflater.inflate(R.layout.fragment_require,container,false);
        return convertView;
    }
}
