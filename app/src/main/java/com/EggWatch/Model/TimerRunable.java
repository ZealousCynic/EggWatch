package com.EggWatch.Model;

import java.util.concurrent.TimeUnit;

public class TimerRunable implements Runnable {

    final private TimerBase _timer;

    public TimerRunable(final TimerBase timer) {
        _timer = timer;
    }

    @Override
    public void run() {
        final int initialTime = _timer.getInitialTime();

        try {
            for (int i = initialTime; i >= 0; i--) {
                if (Thread.currentThread().isInterrupted())
                    return;

                _timer.setTime(i);
                _timer.notifyOnTimerChanged(i);

                if (i > 0)
                    TimeUnit.SECONDS.sleep(1);
            }

            _timer.notifyOnTimerFinish();
            _timer.setCurrentState(_timer.getOffState());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //thread object
}
