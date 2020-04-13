package com.EggWatch.Model.Abstractions;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyOnTimerChanged(int timeLeft);
    void notifyOnTimerFinish();
}
