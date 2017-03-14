package akashkumar.animationresourcesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView alphaTextView = (TextView) findViewById(R.id.alpha_tv);
        Animation alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_animation);
        alphaTextView.startAnimation(alphaAnimation);

        TextView scaleTV = (TextView) findViewById(R.id.scale_tv);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        scaleTV.startAnimation(scaleAnimation);

        TextView translateTv = (TextView) findViewById(R.id.translate_tv);
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_animation);
        translateTv.startAnimation(translateAnimation);

        TextView rotateTV = (TextView) findViewById(R.id.rotate_tv);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        rotateTV.startAnimation(rotateAnimation);

    }
}
