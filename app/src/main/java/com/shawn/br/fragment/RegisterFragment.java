package com.shawn.br.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shawn.br.R;

/**
 * Created by Three on 2016/7/19.
 */
public class RegisterFragment extends Fragment {
    public RegisterFragment() {
        super();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register,container,false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolBar);
        toolbar.setTitle(R.string.register);
        toolbar.setNavigationIcon(R.drawable.back_arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .show(getFragmentManager().findFragmentByTag(WelcomeFragment.class.getName()))
                        .commit();
                getFragmentManager().popBackStack();
            }
        });
        view.findViewById(R.id.confirm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .show(getFragmentManager().findFragmentByTag(WelcomeFragment.class.getName()))
                        .remove(getFragmentManager().findFragmentByTag(RegisterFragment.class.getName()))
                        .commit();
                //add password confirm or sth
            }
        });
        return view;
    }
}
