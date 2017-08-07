package com.enthusiastmartin.android_clean_architecture.domain.interactor.core;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by martin on 8/7/17.
 */

public abstract class UseCase<T, Params> {

  private final CompositeDisposable disposables;

  UseCase(){
    this.disposables = new CompositeDisposable();
  }

  abstract Observable<T> buildObservable(Params params);

  public void execute(DisposableObserver<T> observer, Params params){
    Observable<T> observable = buildObservable(params)
      .subscribeOn(Schedulers.newThread()) // TODO: make configurable ?
      //.subscribeOn(Schedulers.from( ??? parameter ))
      .observeOn(AndroidSchedulers.mainThread());
    disposables.add(observable.subscribeWith(observer));
  }
}
