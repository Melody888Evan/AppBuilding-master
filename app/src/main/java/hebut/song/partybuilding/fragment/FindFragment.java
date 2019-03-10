package hebut.song.partybuilding.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hebut.song.partybuilding.R;
import hebut.song.partybuilding.SingleNewsActivity;
import hebut.song.partybuilding.adapter.NewsAdapter;


public class FindFragment extends Fragment {
    private Button button;
    private ListView listView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_find , container, false);
        listView = (ListView)view.findViewById(R.id.listview);
        List<Map<String, Object>> list=getData();
        listView.setAdapter(new NewsAdapter(getActivity(), list));
        View.OnClickListener listener0=null;
        Button btn_submit=(Button)getActivity().findViewById(R.id.newsview2);
        listener0=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aintent = new Intent(getActivity().getApplicationContext(), SingleNewsActivity.class);
                startActivity(aintent);
            }
        };
//        btn_submit.setOnClickListener(MyOnClickListener.getInstance());
        return view;
//         return inflater.inflate(R.layout.fragment_find,null);
    }

    private String[] news = { "新闻1", "新闻2", "新闻3", "新闻4",
            "新闻5", "新闻6", "新闻7", "新闻8", "新闻9", "新闻10"};
    private String[] time = { "时间1", "时间2", "时间3", "时间4",
            "时间5", "时间6", "时间7", "时间8", "时间9", "时间10"};
    private String[] picture_name={ };
    private String[] buttons = { "查看详情1", "查看详情2", "查看详情3", "查看详情4",
            "时间5", "时间6", "时间7", "查看详情8", "查看详情9", "查看详情10"};
    public List<Map<String, Object>> getData(){
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map=new HashMap<String, Object>();
            map.put("image", R.drawable.me_list_mail);
            map.put("title", news[i]);
            map.put("info", time[i]);
//            map.put("btm",buttons[i]);
            list.add(map);
        }
        return list;
    }
}

