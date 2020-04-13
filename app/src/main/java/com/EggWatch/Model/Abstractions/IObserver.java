package com.EggWatch.Model.Abstractions;

public interface IObserver {
    //void register(IObservable obj);
    void onTimerTick(int timeLeft);
    void onTimerFinish();
}
