package com.EggWatch.Model;

import com.EggWatch.Model.Abstractions.IObservable;
import com.EggWatch.Model.Abstractions.ITimerState;
import com.EggWatch.Model.Abstractions.ITimer;

public abstract class TimerBase implements ITimer, IObservable {
    abstract ITimerState getOffState();
    abstract ITimerState getResetState();
    abstract ITimerState getOnState();
    abstract ITimerState getCurrentState();
    abstract void setCurrentState(final ITimerState state);

    abstract int getInitialTime();

    abstract Thread getTimerThread();
    abstract void setTimerThread(final Thread timerThread);
}
