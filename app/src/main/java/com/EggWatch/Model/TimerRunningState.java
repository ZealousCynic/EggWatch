package com.EggWatch.Model;

import com.EggWatch.Model.Abstractions.ITimerState;

public class TimerRunningState implements ITimerState {

    private final TimerBase _timer;

    public TimerRunningState(final TimerBase timer)
    {
        _timer = timer;
    }

    @Override
    public void start(int time) {

    }

    @Override
    public void stop() {
        _timer.getTimerThread().interrupt();
        try {
            _timer.getTimerThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _timer.setCurrentState(_timer.getOffState());
    }

    @Override
    public void reset() {

    }
}
