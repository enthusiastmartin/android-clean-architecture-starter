package com.enthusiastmartin.android_clean_architecture.domain.interactor.core;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by martin on 8/6/17.
 */

public abstract class BaseInteractor {

  private final CompositeDisposable disposables;

  BaseInteractor() {
    this.disposables = new CompositeDisposable();
  }

  public CompositeDisposable getDisposables() {
    return disposables;
  }

  public void dispose() {
    if (!disposables.isDisposed()) {
      disposables.dispose();
    }
  }
}
