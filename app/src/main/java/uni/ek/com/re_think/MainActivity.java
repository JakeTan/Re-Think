package uni.ek.com.re_think;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText name,pass;
    Button login;
    LoginButton fb_login;
    String name1,pass1;
    int count,counter;
    CallbackManager callbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();

        setContentView(R.layout.activity_main);



        SharedPreferences preferences1=getSharedPreferences("App",MODE_PRIVATE);
        counter=preferences1.getInt("apprun",0);
        count=counter;
        count++;


        ///////////////////////
        SharedPreferences preferences=getSharedPreferences("App",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putInt("apprun",count);
        editor.apply();


        ///////////////////
        name=(EditText)findViewById(R.id.et_name);
        pass=(EditText)findViewById(R.id.et_pass);




        login=(Button)findViewById(R.id.btn_login);
        fb_login= (LoginButton)findViewById(R.id.btnl_fblogin);
        //////////////////
        fb_login.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                Intent i=new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

                Toast.makeText(getApplicationContext(),""+error,Toast.LENGTH_LONG).show();
            }
        });

        ////////////


        assert login != null;
        login.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        name1=name.getText().toString();
        pass1=pass.getText().toString();

        if(name1.equals("abcd") && pass1.equals("1234"))
        {
            Intent i=new Intent(MainActivity.this,Activity2.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(this,"Wrong name and password",Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);


    }
}
