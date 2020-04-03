package com.Model.Abstractions;

public interface IObservable {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyOnPropertyChanged();
}
