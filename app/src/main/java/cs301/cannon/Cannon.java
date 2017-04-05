package cs301.cannon;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by Admin on 4/3/2017.
 */

public class Cannon {

    public int x,y;
    public Paint mainPaint= new Paint();
    public Paint outlinePaint = new Paint();
    public float degree;


    public Cannon(int x, int y,int color)
    {   this.x = x;
        this.y = y;


        mainPaint.setColor(color);
        outlinePaint.setColor(0xFF000000);

    }


    public void onDraw(Canvas canvas) {
        canvas.rotate(degree, x, y);
        canvas.drawCircle(x, y, 200 , mainPaint);
        canvas.drawRect(x-100,y-600 , x+100,y, mainPaint);
        canvas.rotate(-degree,x, y);

    }

    public void setDegree(float de)
    {
        this.degree = de;
    }

}