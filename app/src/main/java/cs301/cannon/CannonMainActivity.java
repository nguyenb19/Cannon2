package cs301.cannon;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.SurfaceView;
import android.widget.LinearLayout;
import android.widget.SeekBar;

/**
 * CannonMainActivity
 *
 * This is the activity for the cannon animation. It creates a AnimationCanvas
 * containing a particular Animator object
 *
 * @author Andrew Nuxoll
 * @version September 2012
 *
 */
public class CannonMainActivity extends Activity implements SeekBar.OnSeekBarChangeListener {
    public  SeekBar GunBarrel;
    public Cannon gun;

    CannonCavas myCanvas;
    /**
     * creates an AnimationCanvas containing a TestAnimator.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cannon_main);

        // Create an animation canvas and place it in the main layout
        Animator testAnim = new TestAnimator();

        myCanvas = (CannonCavas)findViewById(R.id.Canvas);
        LinearLayout mainLayout = (LinearLayout) this.findViewById(R.id.topLevelLayout);

        /*
        myCanvas = new CannonCavas(this, testAnim);

        mainLayout.addView(myCanvas);
        */





        GunBarrel = (SeekBar)findViewById(R.id.seekBar2);

        //get the gun
        gun = myCanvas.getCannon();


        //registering listeners
        GunBarrel.setOnSeekBarChangeListener(this);

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        gun.setDegree(seekBar.getProgress());
        myCanvas.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

