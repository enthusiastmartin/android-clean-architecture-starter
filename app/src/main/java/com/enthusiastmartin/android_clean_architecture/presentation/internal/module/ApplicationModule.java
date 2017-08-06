package com.enthusiastmartin.android_clean_architecture.presentation.internal.module;

import com.enthusiastmartin.android_clean_architecture.presentation.AndroidApplication;

import dagger.Module;

/**
 * Created by martin on 8/6/17.
 */
@Module
public class ApplicationModule {
  private final AndroidApplication application;

  public ApplicationModule(AndroidApplication app) {
    this.application = app;
  }

}
