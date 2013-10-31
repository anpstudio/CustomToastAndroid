package com.anpstudio.customtoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by antocara on 25/10/13.
 */
public class CustomToast extends Toast {

    Animation animation;

        private Context context;

        public CustomToast(Context cont, int duration ) {
            super(cont);
            context = cont;
            this.setDuration(duration);
        }


        public void show(CharSequence text) {


            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //Inflate custom layout Toast
            View vi = (View) li.inflate(R.layout.custom_layout_toast, null);

            TextView tv = (TextView) vi.findViewById(R.id.text_toast);
            this.setView(vi);
            tv.setText(text);
            super.show();
        }



}
