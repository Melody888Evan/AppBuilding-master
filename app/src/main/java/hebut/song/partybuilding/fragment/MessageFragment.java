package hebut.song.partybuilding.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hebut.song.partybuilding.R;
import hebut.song.partybuilding.adapter.MessageAdapter;


public class MessageFragment extends Fragment{
    private ListView listView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_message , container, false);
        listView = (ListView)view.findViewById(R.id.listview);
        List<Map<String, Object>> list=getData();
        listView.setAdapter(new MessageAdapter(getActivity(), list));
        return view;
    }

    private String[] news = { "通知1", "通知2", "通知3", "通知4",
            "通知5", "通知6", "通知7", "通知8", "通知9", "通知10"};
    private String[] time = { "时间1", "时间2", "时间3", "时间4",
            "时间5", "时间6", "时间7", "时间8", "时间9", "时间10"};
    private String[] picture_name={ };
    public List<Map<String, Object>> getData(){
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map=new HashMap<String, Object>();
            map.put("image", R.drawable.me_list_my_group);
            map.put("title", news[i]);
            map.put("info", time[i]);
            list.add(map);
        }
        return list;
    }
}

