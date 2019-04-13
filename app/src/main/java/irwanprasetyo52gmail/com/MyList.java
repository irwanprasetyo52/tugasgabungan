package irwanprasetyo52gmail.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MyList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listme);//untuk deklarasi isian dari list

        ListView list;
        String[] maintitle ={"makbul","bisri","bagas","antonius","ganesha"};//ini adalah isi dari main title atau pada utamanya dengan mengisikan nama orang teman
        String[] subtitle ={"makbul@gmail.com","bisriha@gmail.com","bagasan@gmail.com","anton@gmail.com","ganesha@gmail.com"};//ini adalah isian untuk subtitel email teman
        Integer[]imgid ={R.drawable.pppp, R.drawable.qqqq, R.drawable.ssss, R.drawable.eeee,R.drawable.aaaa};//memasukan gambar pada drawable dan akan ditampilkan di output


        MyListAdapter adapter=new MyListAdapter(this,maintitle,subtitle,imgid);//adapter baru dengan conteks maintitle,subtitle dan gambar

        list=(ListView)findViewById(R.id.list);//untuk menampilkan dadta berdasarkan id dari list

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(getApplicationContext(),"konco siji",Toast.LENGTH_SHORT).show();
                }else if(position==1){
                    Toast.makeText(getApplicationContext(),"konco loro",Toast.LENGTH_SHORT).show();
                }else if(position==2){
                    Toast.makeText(getApplicationContext(),"konco telu",Toast.LENGTH_SHORT).show();
                }else if(position==3){
                    Toast.makeText(getApplicationContext(),"konco papat",Toast.LENGTH_SHORT).show();
                }else if(position==4){
                    Toast.makeText(getApplicationContext(),"konco limo",Toast.LENGTH_SHORT).show();//ini untuk mengatur posisi dengan if else sesuai dengan urutannya.
                }
           }
        });
    }
}

