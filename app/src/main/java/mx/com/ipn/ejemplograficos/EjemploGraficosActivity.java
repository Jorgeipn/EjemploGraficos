package mx.com.ipn.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EjemploGraficosActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }

    public class EjemploView extends View {
        private Drawable miImagen;

        public EjemploView (Context context)
        {
            super(context);
            Resources res = context.getResources();
            miImagen = res.getDrawable(R.drawable.quiero);
            miImagen.setBounds(30,30,200,200);

        }
        @Override
        protected void onDraw(Canvas canvas) {

            miImagen.draw(canvas);


            /*
            Path trazo = new Path();
            trazo.addCircle(150, 150, 100, Path.Direction.CCW);
            canvas.drawColor(Color.WHITE);
            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawPath(trazo, pincel);
            pincel.setStrokeWidth(1);
            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(20);
            pincel.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Desarrollo de aplicaciones para móviles con Android", trazo, 10, 40, pincel);
            */




        }
    }
}