// Generated by view binder compiler. Do not edit!
package com.example.meble_thefurnitureapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.meble_thefurnitureapp.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityChairsBenchesBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  private ActivityChairsBenchesBinding(@NonNull ScrollView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChairsBenchesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChairsBenchesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chairs_benches, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChairsBenchesBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ActivityChairsBenchesBinding((ScrollView) rootView);
  }
}
