package com.Model.Abstractions;

public interface IObserver {
    void register(IObservable obj);
    void onPropertyChanged();
}
