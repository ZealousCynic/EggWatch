package com.EggWatch.Model.Abstractions;

public interface ITimer {
    void start();
    void stop();
    void reset();
    void setTime(int time);
    int getTimeLeft();
}
