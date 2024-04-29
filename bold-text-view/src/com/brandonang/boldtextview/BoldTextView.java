package com.brandonang.boldtextview;

import android.content.Context;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.graphics.Typeface;

public class BoldTextView extends AndroidNonvisibleComponent {
  private Context context;

  public BoldTextView(ComponentContainer container) {
    super(container.$form());
    this.context = container.$context();
  }

  @SimpleFunction
  public void CreateBoldTextView(AndroidViewComponent layout, String text){
    Typeface tf = Typeface.DEFAULT;
    View view = layout.getView();
    FrameLayout frameLayout = (FrameLayout) view;
    TextView textView = new TextView(this.context);
    textView.setTypeface(tf, Typeface.BOLD);
    textView.setText(text);
    frameLayout.addView(textView);
  }

  @SimpleFunction
  public void CreateHeading5TextView(AndroidViewComponent layout, String text){
    Typeface tf = Typeface.DEFAULT;
    View view = layout.getView();
    FrameLayout frameLayout = (FrameLayout) view;
    TextView heading5 = new TextView(this.context);
    heading5.setTypeface(tf, Typeface.BOLD);
    heading5.setText(text);
    frameLayout.addView(heading5);
  }
}
