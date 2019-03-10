package hebut.song.partybuilding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;


import hebut.song.partybuilding.R;

public class NewsAdapter extends BaseAdapter  {
    private List<Map<String, Object>> data;
    private LayoutInflater layoutInflater;
    private Context context;
    public NewsAdapter(Context context,List<Map<String, Object>> data){
        this.context=context;
        this.data=data;
        this.layoutInflater=LayoutInflater.from(context);
    }
    /**
     * 组件集合，对应list.xml中的控件
     * @author Administrator
     */
    public final class Zujian{
        public ImageView image;
        public TextView title;
        public Button views;
        public TextView info;
    }
    @Override
    public int getCount() {
        return data.size();
    }
    /**
     * 获得某一位置的数据
     */
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }
    /**
     * 获得唯一标识
     */
    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Zujian zujian=null;
        if(convertView==null){
            zujian=new Zujian();
            //获得组件，实例化组件
            convertView=layoutInflater.inflate(R.layout.news_item, null);
            zujian.image=(ImageView)convertView.findViewById(R.id.image);
            zujian.title=(TextView)convertView.findViewById(R.id.title);
            zujian.info=(TextView)convertView.findViewById(R.id.info);
            zujian.views=(Button)convertView.findViewById(R.id.newsview2);
            convertView.setTag(zujian);
//            button=(MyButton) convertView.findViewById(R.id.);
//            button.setIndex(position);
//            button.setOnClickListener(MyOnClickListener.getInstance());


//            @Override
//                    public void onClick(View view){
//                int index=((MyButton ))

//            }
        }else{
            zujian=(Zujian)convertView.getTag();
        }
        //绑定数据
        zujian.image.setBackgroundResource((Integer)data.get(position).get("image"));
        zujian.title.setText((String)data.get(position).get("title"));
        zujian.info.setText((String)data.get(position).get("info"));
//        zujian.views.setText(((String)data.get(position).get("btn")));
        return convertView;
    }

}

