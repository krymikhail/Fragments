package com.geeks.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Warrior warrior = (Warrior) getArguments().getSerializable("warrior");

        TextView txtWarriorInfo = view.findViewById(R.id.txtWarriorInfo);
        if (warrior != null) {
            String info = "Name: " + warrior.getName() +
                    "\nHealth: " + warrior.getHealth() +
                    "\nAttack: " + warrior.getAttack();
            txtWarriorInfo.setText(info);
        }

        return view;
    }
}