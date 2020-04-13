package com.EggWatch.Model;

import com.EggWatch.Model.Abstractions.ITimer;
import com.EggWatch.Model.Abstractions.ITimerState;

public class TimerOffState implements ITimerState {

    TimerBase _timer;

    public TimerOffState(final TimerBase timer) {
        _timer = timer;
    }

    @Override
    public void start(int time) {
        //Initiate a runable
        final Thread timerThread = new Thread(new TimerRunable(_timer));
        timerThread.setPriority(Thread.NORM_PRIORITY);

        _timer.setTimerThread((timerThread));
        timerThread.start();
        _timer.setCurrentState(_timer.getOnState());
    }

    @Override
    public void stop() {
        //Stop runable -- save current progress
    }

    @Override
    public void reset() {
        _timer.setTime(0);
    }
}
