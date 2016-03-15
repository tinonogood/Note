package a.exercise4_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    private SeekBar colorR;
    private SeekBar colorG;
    private SeekBar colorB;
    public int red = 150;
    public int green= 150;
    public int blue = 150;
    private TextView bgcolor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_main);
        findViewById();
        }


    private void findViewById() {
        bgcolor = (TextView) findViewById(R.id.bgcolor);

//        參照 數碼維基 http://codex.wiki/question/1189259-9612, Java: 如何將RGB顏色在Java中
        bgcolor.setBackgroundColor(rgb(red, green, blue));
        colorR = (SeekBar) findViewById(R.id.seekBarR);
        colorR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
           @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
               red = progress* 257 / 100;
           }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekbar){
                Toast.makeText(MainActivity.this, "Red = " + seekbar.getProgress(), Toast.LENGTH_SHORT).show();
                bgcolor.setBackgroundColor(rgb(red, green, blue));
            }
        });

        colorG = (SeekBar) findViewById(R.id.seekBarG);
        colorG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                green = progress* 257 / 100;
//                bgcolor.setBackgroundColor(rgb(red, progress, blue));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekbar){
                Toast.makeText(MainActivity.this, "Green = " + seekbar.getProgress(), Toast.LENGTH_SHORT).show();
                bgcolor.setBackgroundColor(rgb(red, green, blue));
            }
        });

        colorB = (SeekBar) findViewById(R.id.seekBarB);
        colorB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                blue = progress * 257 / 100;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekbar){
                Toast.makeText(MainActivity.this, "Blue = " + seekbar.getProgress(), Toast.LENGTH_SHORT).show();
                bgcolor.setBackgroundColor(rgb(red, green, blue));
            }
        });


    }


}
