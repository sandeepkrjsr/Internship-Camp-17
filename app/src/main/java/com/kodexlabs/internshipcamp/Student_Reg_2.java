package com.kodexlabs.internshipcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Niklaus on 26-Feb-17.
 */

public class Student_Reg_2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.student_reg_2, container, false);

        Button next = (Button)view.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity_Student_Reg)getActivity()).fragmentChange(2);
            }
        });

        return view;
    }

}
