package idmexico.com.mx.loginejercicio1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText usuarioLogin;
    private EditText pwdLogin;
    //private View

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioLogin = (EditText) findViewById(R.id.usuarioLogin);
        pwdLogin = (EditText) findViewById(R.id.pwdLogin);


        findViewById(R.id.btnLogin).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                DoLogin();
                break;
        }
    }

    private void DoLogin() {
        String usuarioL= usuarioLogin.getText().toString();
        String pwdL = pwdLogin.getText().toString();

        if (usuarioL.equals("gsevilla") && pwdL.equals("789")){
            Toast.makeText(getApplicationContext(),"Login Realizado",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_SHORT).show();
        }
    }
}
