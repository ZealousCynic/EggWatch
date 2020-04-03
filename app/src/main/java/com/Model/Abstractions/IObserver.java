package com.Model.Abstractions;

public interface IObserver {
    void onPropertyChanged();
    void register(IObservable obj);
}
