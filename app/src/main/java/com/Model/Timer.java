package com.Model;

import com.Model.Abstractions.IObserver;
import com.Model.Abstractions.ITimer;
import com.Model.Abstractions.ITimerState;

import java.util.List;

public class Timer extends TimerBase {

    //Event management
    private List<IObserver> observers = null;

    //Time state
    private ITimer _timer;

    private ITimerState _currentState = null;
    private ITimerState timerOff = null;
    private ITimerState timerRunning = null;
    private ITimerState timerReset = null;

    //Timer
    private int _time;

    public Timer() {

        if(_timer == null)
        {
            _timer = this;
            timerOff = new TimerOffState();
            timerRunning = new TimerRunningState();
            timerReset = new TimerResetState();

            _currentState = timerOff;
        }
    }

    @Override
    ITimerState getCurrentState() {
        return _currentState;
    }

    @Override
    void setCurrentState(ITimerState state) {
        _currentState = state;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOnPropertyChanged() {
    }

    @Override
    public void start() {
        _currentState.start(_time);
    }

    @Override
    public void stop() {
        _currentState.stop();
    }

    @Override
    public void reset() {

    }

    @Override
    public void setTime(int time) {
        _time = time;
    }

    @Override
    public int getTimeLeft() {
        return 0;
    }
}
