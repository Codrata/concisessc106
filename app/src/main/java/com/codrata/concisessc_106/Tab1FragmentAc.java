package com.codrata.concisessc_106;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Tab1FragmentAc extends Fragment {
    private static final String TAG = "com.codrata.concisessc_106.Tab1FragmentAc";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_1_activity_ac, container, false);

        return view;
    }

}
