package net.hrsoft.irregularbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends Activity implements View.OnClickListener {

    @Bind(R.id.color01) net.hrsoft.irregularbutton.widget.IrregularButton btn01;
    @Bind(R.id.color02) net.hrsoft.irregularbutton.widget.IrregularButton btn02;
    @Bind(R.id.color03) net.hrsoft.irregularbutton.widget.IrregularButton btn03;
    @Bind(R.id.color04) net.hrsoft.irregularbutton.widget.IrregularButton btn04;
    @Bind(R.id.color05) net.hrsoft.irregularbutton.widget.IrregularButton btn05;
    @Bind(R.id.color06) net.hrsoft.irregularbutton.widget.IrregularButton btn06;
    @Bind(R.id.color07) net.hrsoft.irregularbutton.widget.IrregularButton btn07;

    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);
        btn04.setOnClickListener(this);
        btn05.setOnClickListener(this);
        btn06.setOnClickListener(this);
        btn07.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if(toast != null){
            toast.cancel();
        }
        switch (v.getId()){
            case R.id.color01:
                toast = Toast.makeText(this, "按钮01" ,Toast.LENGTH_SHORT);
             break;
            case R.id.color02:
                toast = Toast.makeText(this, "按钮02" ,Toast.LENGTH_LONG);
                break;
            case R.id.color03:
                toast = Toast.makeText(this, "按钮03" ,Toast.LENGTH_LONG);
                break;
            case R.id.color04:
                toast = Toast.makeText(this, "按钮04" ,Toast.LENGTH_LONG);
                break;
            case R.id.color05:
                toast = Toast.makeText(this, "按钮05" ,Toast.LENGTH_LONG);
                break;
            case R.id.color06:
                toast = Toast.makeText(this, "按钮06" ,Toast.LENGTH_LONG);
                break;
            case R.id.color07:
                toast = Toast.makeText(this, "按钮07" ,Toast.LENGTH_LONG);
                break;

        }
        toast.show();


    }
}
