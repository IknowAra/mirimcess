package com.example.mirim_cess_master.third;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mirim_cess_master.R;

public class Frag_Third_Story7 extends Fragment {
    private View view;

    public static Frag_Third_Story7 newInstance() {
        Frag_Third_Story7 frag_third_story7 = new Frag_Third_Story7();

        return frag_third_story7;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_third7, container, false);

        Button happy = (Button) view.findViewById(R.id.happy);
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Frag_Third_Story8_1.class);
                startActivity(intent);
            }
        });

        Button sad = (Button) view.findViewById(R.id.sad);
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Frag_Third_Story8_2.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
