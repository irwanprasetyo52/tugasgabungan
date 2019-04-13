package irwanprasetyo52gmail.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    EditText text2;
    EditText text3;//disini kita akan mendeklarasikan objek yang ada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.btn2);
        button2=(Button)findViewById(R.id.btn5);
        text2=(EditText)findViewById(R.id.editText2);
        text3=(EditText)findViewById(R.id.editText3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);//onclick untuk login dan registrasi
    }
    @Override
    public void onClick(View v) {
        // v akan menentukan tombol yang di klik
        switch (v.getId()){
            case (R.id.btn2):
                if ((text2.getText().toString().trim().toLowerCase()).equals("Irwan".toLowerCase()) && (text3.getText().toString().toLowerCase()).equals("165410040".toLowerCase())){
                    Intent log = new Intent(MainActivity.this, MyList.class);
                   startActivity(log);//memulai aktivity login

                }else {
                    Toast.makeText(getApplicationContext(),"nama dan password salah",Toast.LENGTH_LONG).show();//menggunakan switch jika pada text2 memasukan nama irwan dan text 3 menampilkan nim saya maka bisa login, selain itu salah
                }
                break;
            case (R.id.btn5):
                Intent reg = new Intent(MainActivity.this, Registrasi.class);//pada btn 5 akan langsung menuju ke bagian form registrasi
                startActivity(reg);
                break;
        }
    }
}

