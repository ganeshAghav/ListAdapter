package ganesh.com.adapterlistadapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity  extends ListActivity
{
    private TextView text;
    private List<String> listValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.mainText);

        listValues=new ArrayList<String>();
        listValues.add("Android");
        listValues.add("Ios");
        listValues.add("Symbian");
        listValues.add("Blackberry");
        listValues.add("Windows phones");

        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(this,R.layout.row_layout,R.id.listText,listValues);
        setListAdapter(myadapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);

        String selectedItem=(String)getListView().getItemAtPosition(position);
        //String selectedItem = (String) getListAdapter().getItem(position);

        text.setText(" You clicked:- "+ selectedItem+ " at a position:- "+position);
    }
}
