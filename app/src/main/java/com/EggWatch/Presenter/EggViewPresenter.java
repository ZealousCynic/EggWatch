package com.EggWatch.Presenter;

import com.EggWatch.Model.Abstractions.ITimer;
import com.EggWatch.Model.Timer;

public class EggViewPresenter {

    View _v;
    final ITimer timer;

    public EggViewPresenter(View v) {
        _v = v;
        timer = new Timer();
    }

    public interface View {

    }

}
