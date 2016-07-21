package uni.ek.com.re_think;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView tv_1,tv_2,tv_3,tv_buy,tv_nofound;
    ImageView image1,image2,image3;
    String product,price;
    int priceint=0,price1,price2,price3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent pre=getIntent();

        product=pre.getStringExtra("product");
        price=pre.getStringExtra("price");



        priceint=Integer.valueOf(price);



        ////////////
        image1=(ImageView)findViewById(R.id.imageView);
        image2=(ImageView)findViewById(R.id.imageView2);
        image3=(ImageView)findViewById(R.id.imageView3);

        /////////////////

        tv_1=(TextView)findViewById(R.id.tv_1);
        tv_2=(TextView)findViewById(R.id.tv_2);
        tv_3=(TextView)findViewById(R.id.tv_3);
        tv_buy=(TextView)findViewById(R.id.tv_buy);
        tv_nofound=(TextView)findViewById(R.id.tv_nofound);

        tv_buy.setText("I want to buy "+product+" for $"+price);

        tv_nofound.setVisibility(View.INVISIBLE);

        productsDisplay();
        //////////


    }

    public void productsDisplay()
    {
        /////////////smartPhone search


       if((product.equals("smartphone") || product.equals("Smartphone") || product.equals("SmartPhone")) )
        {if(priceint==0)
        {
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.VISIBLE);
            image3.setVisibility(View.VISIBLE);
            tv_1.setText("N/A");
            tv_2.setText("N/A");
            tv_3.setText("N/A");
        }
        else if(priceint>0 && priceint<=10)
        {
            price1=priceint;
            price2=priceint-5;
            price3=priceint-2;

        }
        else if(priceint>10 && priceint<=20)
        {
            price1=priceint-5;
            price2=priceint-11;
            price3=priceint-13;
        }

        else if(priceint>20 && priceint<=30)
        {
            price1=priceint-13;
            price2=priceint-8;
            price3=priceint-20;
        }
        else if(priceint>30 && priceint<=50)
        {
            price1=priceint-17;
            price2=priceint-26;
            price3=priceint-30;
        }


            else if(priceint>50 && priceint<=100 )
            {
                price1=priceint-10;
                price2=priceint-15;
                price3=priceint-20;
            }
            else if(priceint>100 && priceint<=200)
            {
                price1=priceint-85;
                price2=priceint-45;
                price3=priceint-95;
            }
            else if(priceint>200 && priceint<=500)
            {
                price1=priceint-195;
                price2=priceint-105;
                price3=priceint-90;
            }
            else if(priceint>500 && priceint<=1000)
            {
                price1=priceint-290;
                price2=priceint-112;
                price3=priceint-490;
            }
            else if (priceint>1000)
            {
                price1=priceint-900;
                price2=priceint-520;
                price3=priceint-290;
            }

            if(priceint!=0)
            {
                tv_1.setVisibility(View.VISIBLE);
                tv_2.setVisibility(View.VISIBLE);
                tv_3.setVisibility(View.VISIBLE);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                tv_1.setText("I bought a motorbike for $"+price1);
                tv_2.setText("I bought a car for $"+price2);
                tv_3.setText("I bought a mobile for $"+price3);
            }

        }
        /////////////////////// books search
        else if((product.equals("books") || product.equals("Books") || product.equals("Book") || product.equals("book") ))
        {

            if(priceint==0)
            {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                tv_1.setText("N/A");
                tv_2.setText("N/A");
                tv_3.setText("N/A");
            }
            else if(priceint>0 && priceint<=10)
            {
                price1=priceint;
                price2=priceint-5;
                price3=priceint-2;

            }
            else if(priceint>10 && priceint<=20)
            {
                price1=priceint-5;
                price2=priceint-11;
                price3=priceint-13;
            }

            else if(priceint>20 && priceint<=30)
            {
                price1=priceint-13;
                price2=priceint-8;
                price3=priceint-20;
            }
            else if(priceint>30 && priceint<=50)
            {
                price1=priceint-17;
                price2=priceint-26;
                price3=priceint-30;
            }
           else if(priceint>50 && priceint<=100 )
            {
                price1=priceint-10;
                price2=priceint-15;
                price3=priceint-20;
            }
            else if(priceint>100 && priceint<=200)
            {
                price1=priceint-85;
                price2=priceint-45;
                price3=priceint-95;
            }
            else if(priceint>200 && priceint<=500)
            {
                price1=priceint-195;
                price2=priceint-115;
                price3=priceint-150;
            }
            else if(priceint>500 && priceint<=1000)
            {
                price1=priceint-300;
                price2=priceint-412;
                price3=priceint-290;
            }
            else if (priceint>1000)
            {
                price1=priceint-900;
                price2=priceint-520;
                price3=priceint-290;
            }
            if(priceint!=0)
            {

                tv_1.setVisibility(View.VISIBLE);
                tv_2.setVisibility(View.VISIBLE);
                tv_3.setVisibility(View.VISIBLE);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                tv_1.setText("I bought 7 chairs for $"+price1);
                tv_2.setText("I bought a car for "+price2);
                tv_3.setText("I bought camera for "+price3);
            }


        }
        else if((product.equals("car") || product.equals("Car") || product.equals("CAR") )&& priceint<=1000)
        {
            if(priceint==0)
            {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);

                tv_1.setText("N/A");
                tv_2.setText("N/A");
                tv_3.setText("N/A");
            }
            else if(priceint>0 && priceint<=10)
            {
                price1=priceint;
                price2=priceint-5;
                price3=priceint-2;

            }
            else if(priceint>10 && priceint<=20)
            {
                price1=priceint-5;
                price2=priceint-11;
                price3=priceint-13;
            }

            else if(priceint>20 && priceint<=30)
            {
                price1=priceint-13;
                price2=priceint-8;
                price3=priceint-20;
            }
            else if(priceint>30 && priceint<=50)
            {
                price1=priceint-17;
                price2=priceint-26;
                price3=priceint-30;
            }
           else if(priceint>50 && priceint<=100 )
            {
                price1=priceint-10;
                price2=priceint-15;
                price3=priceint-20;
            }
            else if(priceint>100 && priceint<=200)
            {
                price1=priceint-85;
                price2=priceint-45;
                price3=priceint-55;
            }
            else if(priceint>200 && priceint<=500)
            {
                price1=priceint-195;
                price2=priceint-115;
                price3=priceint-150;
            }
            else if(priceint>500 && priceint<=1000)
            {
                price1=priceint-300;
                price2=priceint-412;
                price3=priceint-290;
            }
            else if (priceint>1000)
            {
                price1=priceint-900;
                price2=priceint-520;
                price3=priceint-290;
            }

            if(priceint!=0)
            {
                tv_1.setVisibility(View.VISIBLE);
                tv_2.setVisibility(View.VISIBLE);
                tv_3.setVisibility(View.VISIBLE);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                tv_1.setText("I bought a laptop for $"+price1);
                tv_2.setText("I bought a refrigerator for $"+price2);
                tv_3.setText("I bought a bicycle for $"+price3);
            }


        }
        else if((product.equals("tv") || product.equals("TV") || product.equals("Tv") )&& priceint<=1000)
        {
            if(priceint==0)
            {

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);

                tv_1.setText("N/A");
                tv_2.setText("N/A");
                tv_3.setText("N/A");
            }
            else if(priceint>0 && priceint<=10)
            {
                price1=priceint;
                price2=priceint-5;
                price3=priceint-2;

            }
            else if(priceint>10 && priceint<=20)
            {
                price1=priceint-5;
                price2=priceint-11;
                price3=priceint-13;
            }

            else if(priceint>20 && priceint<=30)
            {
                price1=priceint-13;
                price2=priceint-8;
                price3=priceint-20;
            }
            else if(priceint>30 && priceint<=50)
            {
                price1=priceint-17;
                price2=priceint-26;
                price3=priceint-30;
            }
           else if(priceint>50 && priceint<=100 )
            {
                price1=priceint-10;
                price2=priceint-15;
                price3=priceint-20;
            }
            else if(priceint>100 && priceint<=200)
            {
                price1=priceint-85;
                price2=priceint-45;
                price3=priceint-95;
            }
            else if(priceint>200 && priceint<=500)
            {
                price1=priceint-195;
                price2=priceint-115;
                price3=priceint-150;
            }
            else if(priceint>500 && priceint<=1000)
            {
                price1=priceint-300;
                price2=priceint-412;
                price3=priceint-290;
            }
            else if (priceint>1000)
            {
                price1=priceint-900;
                price2=priceint-520;
                price3=priceint-290;
            }

            if(priceint!=0)
            {
                tv_1.setVisibility(View.VISIBLE);
                tv_2.setVisibility(View.VISIBLE);
                tv_3.setVisibility(View.VISIBLE);

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
                image3.setVisibility(View.VISIBLE);
                tv_1.setText("I bought a air conditioner for $"+price1);
                tv_2.setText("I bought a smartphone for $"+price2);
                tv_3.setText("I bought a car for $"+price3);
            }

        }

        else
        {
            tv_nofound.setVisibility(View.VISIBLE);
            tv_nofound.setText("No Result Found!!");
            tv_1.setVisibility(View.INVISIBLE);
            tv_2.setVisibility(View.INVISIBLE);
            tv_3.setVisibility(View.INVISIBLE);

            image1.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
        }

        }
    }


