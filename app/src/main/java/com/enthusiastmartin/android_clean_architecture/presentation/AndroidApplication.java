package com.enthusiastmartin.android_clean_architecture.presentation;

import android.app.Application;

import com.enthusiastmartin.android_clean_architecture.BuildConfig;
import com.enthusiastmartin.android_clean_architecture.presentation.internal.component.ApplicationComponent;
import com.enthusiastmartin.android_clean_architecture.presentation.internal.component.DaggerApplicationComponent;
import com.enthusiastmartin.android_clean_architecture.presentation.internal.module.ApplicationModule;

/**
 * Created by martin on 8/6/17.
 */

public class AndroidApplication extends Application {

  private ApplicationComponent applicationComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    this.initInjector();
    this.initLeakDetection();
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }

  private void initInjector() {
    this.applicationComponent = DaggerApplicationComponent.builder()
      .applicationModule(new ApplicationModule(this))
      .build();
  }

  private void initLeakDetection() {
    if (BuildConfig.DEBUG) {
      //LeakCanary.install(this);
    }
  }
}
