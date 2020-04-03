package com.Model;

import com.Model.Abstractions.IObservable;
import com.Model.Abstractions.ITimerState;
import com.Model.Abstractions.ITimer;

public abstract class TimerBase implements ITimer, IObservable {
    abstract ITimerState getCurrentState();
    abstract void setCurrentState(ITimerState state);
}
