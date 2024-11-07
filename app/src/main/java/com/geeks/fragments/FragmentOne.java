package com.geeks.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

    private Warrior warrior;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        warrior = new Warrior("Brave Warrior", 100, 20);

        Button btnNavigate = view.findViewById(R.id.btnNavigate);
        btnNavigate.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("warrior", warrior);
            Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentTwo, bundle);
        });

        return view;
    }
}