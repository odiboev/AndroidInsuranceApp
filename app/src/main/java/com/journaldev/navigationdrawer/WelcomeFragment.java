package com.journaldev.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class WelcomeFragment extends Fragment {

    public WelcomeFragment() {
    }

    public Button btnLogin;

    public Button btnRegister;

    public void initLogin(){
        btnLogin = (Button)getActivity().findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent action = new Intent(WelcomeFragment.this.getActivity(), LoginActivity.class);
                startActivity(action);
            }
        });
    }

    public void initReg(){
        btnRegister = (Button)getActivity().findViewById(R.id.btnLogin);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent action = new Intent(WelcomeFragment.this.getActivity(), RegisterActivity.class);
                startActivity(action);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);
        //initLogin();
        //initReg();
        return rootView;

    }

}
