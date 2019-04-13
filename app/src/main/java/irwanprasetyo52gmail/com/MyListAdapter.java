package irwanprasetyo52gmail.com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;//membuat private final untuk context,maintitle,subtitle dan gambar

    public MyListAdapter(Activity context, String[]maintitle, String[]subtitle, Integer[]imgid){
        super(context,R.layout.listku,maintitle);
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;//dan kita menggunakan this untuk menyatakan objek tersebut.
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listku, null, true);//akan berdasrkan apda layout listku, dengan root null dan attach true
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);//akan menampilkan sesuai dengan id yang sudah dibuat
        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        return rowView;
    }
}

