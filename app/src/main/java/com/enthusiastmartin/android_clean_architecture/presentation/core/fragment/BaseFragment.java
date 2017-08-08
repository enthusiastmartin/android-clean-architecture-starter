package com.enthusiastmartin.android_clean_architecture.presentation.core.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.enthusiastmartin.android_clean_architecture.presentation.core.presenter.BaseFragmentPresenter;

/**
 * Created by martin on 8/6/17.
 */
/**
 * Base Fragment (@{@link Fragment}
 *
 * Initialise dependency injection via initInjector in onCreate method.
 * Binds to fragment lifecycle with provided presenter
 *
 */
public abstract class BaseFragment extends Fragment{

  /**
   *
   * @return @{@link BaseFragmentPresenter}
   */
  protected abstract @Nullable BaseFragmentPresenter getPresenter();

  /**
   *  Dependency injection initializer
   */
  protected abstract void initInjector();

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    initInjector();
    if ( getPresenter() != null ) {
      getPresenter().onAttach();
    }
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ( getPresenter() != null ) {
      getPresenter().onCreate();
    }
  }

  @Nullable
  @Override
  @CallSuper
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    if ( getPresenter() != null ) {
      getPresenter().onCreateView();
    }
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override
  @CallSuper
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if ( getPresenter() != null ) {
      getPresenter().onViewCreated();
    }
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if ( getPresenter() != null ) {
      getPresenter().onActivityCreated();
    }
  }

  @Override
  public void onStart() {
    super.onStart();
    if ( getPresenter() != null ) {
      getPresenter().onStart();
    }
  }

  @Override
  public void onResume() {
    super.onResume();
    if ( getPresenter() != null ) {
      getPresenter().onResume();
    }
  }

  @Override
  public void onPause() {
    if ( getPresenter() != null ){
      getPresenter().onPause();
    }
    super.onPause();
  }

  @Override
  public void onStop() {
    if ( getPresenter() != null){
      getPresenter().onStop();
    }
    super.onStop();
  }

  @Override
  public void onDestroyView() {
    if ( getPresenter() != null ){
      getPresenter().onDestroyView();
    }
    super.onDestroyView();
  }

  @Override
  public void onDestroy() {
    if ( getPresenter() != null ) {
      getPresenter().onDestroy();
    }
    super.onDestroy();
  }

  @Override
  public void onDetach() {
    if ( getPresenter() != null ){
      getPresenter().onDetach();
    }
    super.onDetach();
  }
}
