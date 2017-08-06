package com.enthusiastmartin.android_clean_architecture.presentation.core.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.enthusiastmartin.android_clean_architecture.presentation.AndroidApplication;
import com.enthusiastmartin.android_clean_architecture.presentation.core.presenter.BaseActivityPresenter;
import com.enthusiastmartin.android_clean_architecture.presentation.internal.component.ApplicationComponent;

/**
 * Created by martin on 8/6/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

  protected abstract @Nullable
  BaseActivityPresenter getPresenter();

  protected abstract void initInjector();

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    this.getApplicationComponent().inject(this);

    initInjector();

    if ( getPresenter() != null ) {
      getPresenter().onCreate();
    }
  }

  @Override
  public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
    super.onPostCreate(savedInstanceState, persistentState);
    if ( getPresenter() != null) {
      getPresenter().onPostCreate();
    }
  }

  @Override
  protected void onStart() {
    super.onStart();

    if ( getPresenter() != null ) {
      getPresenter().onStart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();
    if ( getPresenter() != null ) {
      getPresenter().onResume();
    }
  }

  @Override
  protected void onPause() {
    if ( getPresenter() != null ){
      getPresenter().onPause();
    }
    super.onPause();
  }

  @Override
  protected void onStop() {
    if ( getPresenter() != null ){
      getPresenter().onStop();
    }
    super.onStop();
  }

  @Override
  protected void onDestroy() {
    if ( getPresenter() != null ){
      getPresenter().onDestroy();
    }
    super.onDestroy();
  }

  @Override
  protected void onResumeFragments() {
    super.onResumeFragments();
    if ( getPresenter() != null ) {
      getPresenter().onResumeFragments();
    }
  }

  /**
   * Get main application component
   *
   * @return
   */
  protected ApplicationComponent getApplicationComponent() {
    return ((AndroidApplication) getApplication()).getApplicationComponent();
  }


}
