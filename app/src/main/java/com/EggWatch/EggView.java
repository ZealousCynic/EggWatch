package com.EggWatch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class EggView extends Fragment {

    EggType et = EggType.NONE;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.eggwatch_view, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_soft).setOnClickListener(new View.OnClickListener()
                                                               {
                                                                   @Override
                                                                   public void onClick(View view) {
                                                                       et = EggType.SOFT;                                                                   }
                                                               }
        );
    }
}
