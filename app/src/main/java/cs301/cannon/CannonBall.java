package cs301.cannon;import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;




/**
 * Created by Admin on 4/3/2017.
 */

public class CannonBall {
    public int x,y,r;
    public Paint mainPaint= new Paint();
    public Paint outlinePaint = new Paint();

        public CannonBall(int x, int y, int r, int color)
        {     this.y = y;
              this.x = x;
              this.r = r;
            mainPaint.setColor(color);
            outlinePaint.setColor(0xFF000000);

        }


        protected void onDraw(Canvas canvas) {

            canvas.drawCircle(x, y, r, mainPaint);
        }

}
