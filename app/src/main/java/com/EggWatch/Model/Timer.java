package com.EggWatch.Model;

import com.EggWatch.Model.Abstractions.IObserver;
import com.EggWatch.Model.Abstractions.ITimer;
import com.EggWatch.Model.Abstractions.ITimerState;

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

    private Thread _timerThread;

    //Timer
    private int _time;
    private int _initialTime;

    public Timer() {

        if(_timer == null)
        {
            _timer = this;
            timerOff = new TimerOffState(this);
            timerRunning = new TimerRunningState(this);
            timerReset = new TimerResetState(this);

            _currentState = timerOff;
        }
    }

    @Override
    ITimerState getOffState() {
        return timerOff;
    }

    @Override
    ITimerState getResetState() {
        return timerReset;
    }

    @Override
    ITimerState getOnState() {
        return timerRunning;
    }

    @Override
    ITimerState getCurrentState() {
        return _currentState;
    }

    @Override
    void setCurrentState(final ITimerState state) {
        _currentState = state;
    }

    @Override
    int getInitialTime() {
        return _initialTime;
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
    public void notifyOnTimerChanged(int timeLeft) {
        for (IObserver obs : observers) {
            obs.onTimerTick(timeLeft);
        }
    }

    @Override
    public void notifyOnTimerFinish() {
        for(IObserver obs : observers) {
            obs.onTimerFinish();
        }
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
        _currentState.reset();
    }

    @Override
    public void setTime(int time) {
        _time = time;
    }

    @Override
    public int getTimeLeft() {
        return _time;
    }

    Thread getTimerThread() {
        return _timerThread;
    }

    void setTimerThread(final Thread timerThread) {
        _timerThread = timerThread;
    }
}
