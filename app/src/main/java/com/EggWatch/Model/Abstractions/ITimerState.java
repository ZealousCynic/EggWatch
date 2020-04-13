package com.EggWatch.Model.Abstractions;

public interface ITimerState {

    void start(int time);
    void stop();
    void reset();
}
