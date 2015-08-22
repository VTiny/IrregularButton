package net.hrsoft.irregularbutton.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by TechFlowing on 2015/8/22.
 */
public class IrregularButton extends LinearLayout{

    private int height = -1;
    private int width = -1;
    private Bitmap bitmap;

    public IrregularButton(Context context) {
        super(context);
    }

    public IrregularButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IrregularButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean onTouchEvent(MotionEvent event){
        int action = event.getAction();
        if(action != MotionEvent.ACTION_DOWN){
            return  super.onTouchEvent(event);
        }
        int x = (int)event.getX();
        int y = (int)event.getY();
        if(width == -1 || height == -1){
            Drawable drawable = getBackground().getCurrent();
            bitmap = ((BitmapDrawable)drawable).getBitmap();
            width = getWidth();
            height = getHeight();
        }
        if(null == bitmap ||x < 0 || y < 0 ||x >= width || y >= height){
            return false;
        }
        int pixel = bitmap.getPixel(x,y);
        if(Color.TRANSPARENT == pixel){
            return  false;
        }
        return super.onTouchEvent(event);

    }


}
