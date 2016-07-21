package uni.ek.com.re_think;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    EditText product,price;
    String product1, price2;
    Button search,history;

    SharedPreferences preferences;
    int count,counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        product=(EditText)findViewById(R.id.et_product);
        price=(EditText)findViewById(R.id.et_price);
        /////////////////////


        //////////
        preferences= getSharedPreferences("Dani",MODE_PRIVATE);

        counter=preferences.getInt("count",count);
      //  Toast.makeText(this,""+counter,Toast.LENGTH_SHORT).show();
        count=counter;
     //   Toast.makeText(this,""+count,Toast.LENGTH_SHORT).show();

        /////////////

        search=(Button)findViewById(R.id.btn_search);
        history=(Button)findViewById(R.id.btn_history);


        search.setOnClickListener(this);
        history.setOnClickListener(this);

        /////////////////////////




    }

    @Override
    public void onClick(View v) {

        ///////////////////////


        if(v.getId()==R.id.btn_search)
        {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("count",count);
            product1=product.getText().toString();
            price2=price.getText().toString();
            if(product1.equals("") && price2.equals(""))
            {

                Toast.makeText(this,"Fields are empty",Toast.LENGTH_SHORT).show();

            }
            else if(product1.equals("") && price2!="")
            {
                Toast.makeText(this,"Product field is empty",Toast.LENGTH_SHORT).show();
            }
            else if(product1!="" && price2.equals(""))
            {
                Toast.makeText(this,"Price field is empty",Toast.LENGTH_SHORT).show();
            }

            else {

                count++;
                //Toast.makeText(this,""+count,Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Activity2.this,Activity3.class);
                i.putExtra("product",product1);
                i.putExtra("price",price2);
                startActivity(i);
            }


            if(count==1 || count==4)
            {
                editor.putString("pro1",product1);
                editor.putString("price1",price2);
                if(count==4)
                {
                    count=1;
                }
            }
            else if(count==2)
            {
                editor.putString("pro2",product1);
                editor.putString("price2",price2);

            }
            else if(count==3){
                editor.putString("pro3",product1);
                editor.putString("price3",price2);


            }

            editor.apply();

        }

        else if(v.getId()==R.id.btn_history)
        {
            Intent i=new Intent(Activity2.this,History.class);
            i.putExtra("counter",count);
            startActivity(i);
        }
    }
}
