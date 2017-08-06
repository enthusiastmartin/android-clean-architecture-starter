package com.enthusiastmartin.android_clean_architecture.presentation.module.main.activity;

import android.support.annotation.Nullable;

import com.enthusiastmartin.android_clean_architecture.presentation.core.activity.BaseActivity;
import com.enthusiastmartin.android_clean_architecture.presentation.core.presenter.BaseActivityPresenter;

/**
 * Created by martin on 8/6/17.
 */

public class MainActivity extends BaseActivity {

  @Nullable
  @Override
  protected BaseActivityPresenter getPresenter() {
    return null;
  }

  @Override
  protected void initInjector() {

  }
}
