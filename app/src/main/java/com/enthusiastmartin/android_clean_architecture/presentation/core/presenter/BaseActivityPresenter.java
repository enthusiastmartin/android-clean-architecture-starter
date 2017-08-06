package com.enthusiastmartin.android_clean_architecture.presentation.core.presenter;

/**
 * Created by martin on 8/6/17.
 */
public abstract class BaseActivityPresenter {
  public void onCreate() {

  }

  public void onPostCreate() {

  }

  public void onStart() {

  }

  public void onResume() {

  }

  public void onResumeFragments(){

  }

  public void onPause() {

  }

  public void onStop() {

  }

  public void onDestroy() {

  }

  /**
   * Called when a permission has changed. You must override this method and call it in the Activity's
   * @param permissionDenied
   */
  public void onPermissionUpdate(boolean permissionDenied) {
    throw new RuntimeException(getClass().getSimpleName() + " doesn't have this method: are your sure you override this method?");
  }
}
