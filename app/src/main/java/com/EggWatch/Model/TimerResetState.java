package com.EggWatch.Model;

import com.EggWatch.Model.Abstractions.ITimerState;

public class TimerResetState implements ITimerState {

    private final TimerBase _timer;

    public TimerResetState(final TimerBase timer) {
        _timer = timer;
    }

    @Override
    public void start(int time) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void reset() {

    }
}
