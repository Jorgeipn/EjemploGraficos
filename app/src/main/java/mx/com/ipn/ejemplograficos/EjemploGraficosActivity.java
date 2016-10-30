package mx.com.ipn.ejemplograficos;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
        public EjemploView (Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {


            /*
            *
            int color;
            color = Color.BLUE;                  //Azul opaco
            color = Color.argb(127, 0, 255, 0);  //Verde transparente
            color = 0x7F00FF00;                  //Verde transparente
            color = getResources().getColor(R.color.color_Circulo);
            *********** */




            Paint pincel = new Paint();
            pincel.setColor(Color.argb(127,255,0,0));
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);

            canvas.drawCircle(150, 150, 100, pincel);
        }
    }
}