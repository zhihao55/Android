package cn.zhihao1.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ListView mListView;
    private String[] names={ "Redmi 8A", "小米CC9", "Redmi 8A ","小米CC9","Redmi 8A","小米CC9",
                             "Redmi 8A", "小米CC9", "Redmi 8A ","小米CC9","Redmi 8A","小米CC9"};
    private int[]  icons= { R.drawable.xiaomi1,R.drawable.xiaomi2,R.drawable.xiaomi1,R.drawable.xiaomi2, R.drawable.xiaomi1,
                            R.drawable.xiaomi2,R.drawable.xiaomi1,R.drawable.xiaomi2,R.drawable.xiaomi1, R.drawable.xiaomi2, R.drawable.xiaomi1, R.drawable.xiaomi2};
    private String[] introduces = {
            "5000mAh超长续航，599元，立即购买",
            "8GB+256GB，100%美图相机 1999  立即购买",
            "5000mAh超长续航，599元，立即购买",
            "8GB+256GB，100%美图相机 1999  立即购买",
            "5000mAh超长续航，599元，立即购买",
            "8GB+256GB，100%美图相机 1999  立即购买",
            "5000mAh超长续航，599元，立即购买",
            "8GB+256GB，100%美图相机 1999  立即购买",
            "5000mAh超长续航，599元，立即购买",
            "8GB+256GB，100%美图相机 1999  立即购买",
            "5000mAh超长续航，599元，立即购买",
            "8GB+256GB，100%美图相机 1999  立即购买",
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo);
        mListView = (ListView) findViewById(R.id.lv);
        MyBaseAdapter mAdapter = new MyBaseAdapter();
        mListView.setAdapter(mAdapter);
    }
    class MyBaseAdapter extends BaseAdapter{
        @Override
        public int getCount(){
            return  names.length;
        }
        @Override
        public Object getItem(int position){
            return names[position];
        }
        @Override
        public long getItemId (int position){
            return position;
        }
        @Override
        public View getView(int position, View converView, ViewGroup parent){
            ViewHolder holder = null;
            if(converView == null){
                converView = View.inflate(MainActivity.this,R.layout.list_item,null);
                holder = new ViewHolder();
                holder.name = (TextView)converView.findViewById(R.id.name);
                holder.introduce = (TextView)converView.findViewById(R.id.introduce);
                holder.iv = (ImageView) converView.findViewById(R.id.iv);
                converView.setTag(holder);
            }else{
                holder = (ViewHolder) converView.getTag();
            }
            holder.name.setText(names[position]);
            holder.introduce.setText(introduces[position]);
            holder.iv.setBackgroundResource(icons[position]);
            return converView;
        }
    }

}
