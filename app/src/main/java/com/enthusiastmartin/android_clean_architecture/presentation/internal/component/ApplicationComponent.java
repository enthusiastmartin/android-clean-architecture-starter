package com.enthusiastmartin.android_clean_architecture.presentation.internal.component;

import com.enthusiastmartin.android_clean_architecture.presentation.core.activity.BaseActivity;
import com.enthusiastmartin.android_clean_architecture.presentation.internal.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by martin on 8/6/17.
 */
@Singleton
@Component( modules = {ApplicationModule.class})
public interface ApplicationComponent {
  void inject(BaseActivity activity);
}
