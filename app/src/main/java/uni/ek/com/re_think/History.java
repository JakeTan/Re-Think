package uni.ek.com.re_think;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class History extends AppCompatActivity {

    TextView tv_h1,tv_h2,tv_h3, tv_time,tv_history;
    ImageView im_1,im_2,im_3;
    String hv_1=null,hv_11 = null;
    String hv_2,hv_22,hv_3,hv_33;

    String pro,prices;
    int counter, apprun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

////////////////////////////
        Intent i=getIntent();
        counter=i.getIntExtra("counter",0);


        im_1=(ImageView)findViewById(R.id.im_1);
        im_2=(ImageView)findViewById(R.id.im_2);
        im_3=(ImageView)findViewById(R.id.im_3);

        ////////////////////////
        SharedPreferences preferences_time=getSharedPreferences("App",MODE_PRIVATE);
       apprun= preferences_time.getInt("apprun",0);

        ////////////////////////////////
        tv_h1=(TextView)findViewById(R.id.tv_history1);
        tv_h2=(TextView)findViewById(R.id.tv_history2);
        tv_h3=(TextView)findViewById(R.id.tv_history3);
        tv_time=(TextView)findViewById(R.id.tv_times);
        tv_history=(TextView)findViewById(R.id.tv_nohistory);

        if(apprun>0)
        {
            tv_time.setText(apprun+" time");
        }

        assert tv_history != null;
        tv_history.setVisibility(View.INVISIBLE);
        tv_h1.setVisibility(View.INVISIBLE);
        tv_h2.setVisibility(View.INVISIBLE);
        tv_h3.setVisibility(View.INVISIBLE);

        /////////////////

        SharedPreferences preferences=getSharedPreferences("Dani",MODE_PRIVATE);

        if(preferences!=null) {
            hv_1= preferences.getString("pro1", "");
            hv_11= preferences.getString("price1", "");

            hv_2=preferences.getString("pro2","");
            hv_22=preferences.getString("price2","");

            hv_3=preferences.getString("pro3","");
            hv_33=preferences.getString("price3","");
        }

        if(apprun==1)
        {
            if(hv_1.equals("") && hv_11.equals(""))
            {
                tv_h1.setVisibility(View.INVISIBLE);
                tv_h2.setVisibility(View.INVISIBLE);
                tv_h3.setVisibility(View.INVISIBLE);

                im_1.setVisibility(View.INVISIBLE);
                im_2.setVisibility(View.INVISIBLE);
                im_3.setVisibility(View.INVISIBLE);
            }

            if(counter==0)
            {

                tv_history.setText("no History");
                tv_history.setVisibility(View.VISIBLE);
            }
        }

        if(apprun<1)
        {

         if(counter==1)
        {

                tv_h1.setText("I want to buy "+hv_1+" for $"+hv_11);
                tv_h1.setVisibility(View.VISIBLE);
                im_1.setVisibility(View.VISIBLE);

        }





        else if(counter==2)
        {

                tv_h2.setText("I want to buy "+hv_2+" for $"+hv_22);
                tv_h1.setText("I want to buy "+hv_1+" for $"+hv_11);

                tv_h1.setVisibility(View.VISIBLE);
                tv_h2.setVisibility(View.VISIBLE);

                im_1.setVisibility(View.VISIBLE);
                im_2.setVisibility(View.VISIBLE);

        }

        else if(counter==3)
        {
           // if(hv_3!=null && hv_33!=null)
            //{
                tv_h3.setText("I want to buy "+hv_3+" for $"+hv_33);
                tv_h2.setText("I want to buy "+hv_2+" for $"+hv_22);
                tv_h1.setText("I want to buy "+hv_1+" for $"+hv_11);
                tv_h1.setVisibility(View.VISIBLE);
                tv_h2.setVisibility(View.VISIBLE);
                tv_h3.setVisibility(View.VISIBLE);

                im_1.setVisibility(View.VISIBLE);
                im_2.setVisibility(View.VISIBLE);
                im_3.setVisibility(View.VISIBLE);

        }


        }
        else
        {
            if(hv_1.equals("") && hv_2.equals("") && hv_3.equals(""))
            {

                tv_h1.setVisibility(View.INVISIBLE);
                tv_h2.setVisibility(View.INVISIBLE);
                tv_h3.setVisibility(View.INVISIBLE);

                im_1.setVisibility(View.INVISIBLE);
                im_2.setVisibility(View.INVISIBLE);
                im_3.setVisibility(View.INVISIBLE);

                tv_history.setText("no History");
                tv_history.setVisibility(View.VISIBLE);
            }
            else
            {
                if(hv_1.equals(""))
                {
                    tv_h1.setVisibility(View.INVISIBLE);
                    tv_h2.setVisibility(View.INVISIBLE);
                    tv_h3.setVisibility(View.INVISIBLE);

                    im_1.setVisibility(View.INVISIBLE);
                    im_2.setVisibility(View.INVISIBLE);
                    im_3.setVisibility(View.INVISIBLE);


                }
                else
                {
                    tv_h1.setText("I want to buy "+hv_1+" for $"+hv_11);
                    tv_h1.setVisibility(View.VISIBLE);

                    im_1.setVisibility(View.VISIBLE);
                }

                if(hv_2.equals(""))
                {

                    tv_h2.setVisibility(View.INVISIBLE);
                    tv_h3.setVisibility(View.INVISIBLE);

                    im_2.setVisibility(View.INVISIBLE);
                    im_3.setVisibility(View.INVISIBLE);

                }
                else {
                    tv_h2.setText("I want to buy "+hv_2+" for $"+hv_22);
                    tv_h2.setVisibility(View.VISIBLE);

                    im_2.setVisibility(View.VISIBLE);
                }
                if(hv_3.equals(""))
                {
                    tv_h3.setVisibility(View.INVISIBLE);
                    im_3.setVisibility(View.INVISIBLE);
                }
                else {
                    tv_h3.setText("I want to buy " + hv_3 + " for $" + hv_33);
                    tv_h3.setVisibility(View.VISIBLE);

                    im_3.setVisibility(View.VISIBLE);
                }

            }

        }




    }


}
