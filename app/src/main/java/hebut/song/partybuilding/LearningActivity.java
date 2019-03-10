package hebut.song.partybuilding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hebut.song.partybuilding.adapter.LearningAdapter;
import hebut.song.partybuilding.adapter.MessageAdapter;
import hebut.song.partybuilding.adapter.NewsAdapter;

public class LearningActivity extends AppCompatActivity {

    private String[] materials = { "学习资料1", "学习资料2", "学习资料3", "学习资料4",
            "学习资料5", "学习资料6", "学习资料7", "学习资料8", "学习资料9", "学习资料10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
//        View view= View.inflate(this,R.layout.activity_test ,null);
//        listView = view.findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(LearningActivity.this, android.R.layout.simple_list_item_1, materials);
        ListView listView = (ListView) findViewById(R.id.listview22);
        listView.setAdapter(adapter);
//        List<Map<String, Object>> list=getData();
//        listView.setAdapter(new LearningAdapter(this, list));
    }


//    private String[] time = { "时间1", "时间2", "时间3", "时间4",
//            "时间5", "时间6", "时间7", "时间8", "时间9", "时间10"};
//    private String[] picture_name={ };
//    public List<Map<String, Object>> getData(){
//        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
//        for (int i = 0; i < 10; i++) {
//            Map<String, Object> map=new HashMap<String, Object>();
//            map.put("image", R.drawable.me_list_my_group);
//            map.put("title", news[i]);
//            map.put("info", time[i]);
//            list.add(map);
//        }
//        return list;
    }


//}
