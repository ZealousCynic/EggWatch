package com.EggWatch.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;

import com.EggWatch.EggType;
import com.EggWatch.Presenter.EggViewPresenter;
import com.EggWatch.R;

public class EggView extends Fragment implements EggViewPresenter.View {

    EggType et = EggType.NONE;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        EggViewPresenter presenter = new EggViewPresenter(this);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.eggwatch_view, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_soft).setOnClickListener(new View.OnClickListener()
                                                               {
                                                                   @Override
                                                                   public void onClick(View view) {
                                                                       et = EggType.SOFT;
                                                                       Log.d("ET", et.toString());
                                                                   }
                                                               }
        );
    }
}
