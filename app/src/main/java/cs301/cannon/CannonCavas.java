package cs301.cannon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Admin on 4/3/2017.
 */


public class CannonCavas extends SurfaceView implements View.OnTouchListener {
    public CannonBall ball = new CannonBall (1100, 1200, 50, Color.RED );


    public Cannon gun = new Cannon(400, 1200, Color.BLUE);






    public CannonCavas(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public CannonCavas(Context context, Animator testAnim) {
        super(context);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {


        return false;
    }

    @Override
    protected void onDraw(Canvas c)
    {
        gun.onDraw(c);
        ball.onDraw(c);

    }

    public Cannon getCannon()
    {
        return gun;
    }
}
