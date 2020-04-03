package com.Model.Abstractions;

import com.Model.Timer;

public interface ITimerState {

    Timer t = null;

    void start(int time);
    void stop();
    void reset();
}
