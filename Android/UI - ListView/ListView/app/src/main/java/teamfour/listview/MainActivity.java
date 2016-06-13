package teamfour.listview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvMember = (ListView) findViewById(R.id.lvMember);
        lvMember.setAdapter(new MemberAdapter(this));
        lvMember.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Member member = (Member) parent.getItemAtPosition(position);
                String text = "ID = " + member.getId() +
                        ", name = " + member.getName();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class MemberAdapter extends BaseAdapter {
        private LayoutInflater layoutInflater;
        private List<Member> memberList;

        public MemberAdapter(Context context) {
            layoutInflater = LayoutInflater.from(context);

            memberList = new ArrayList<>();
            memberList.add(new Member(23, R.drawable.p01, "John"));
            memberList.add(new Member(75, R.drawable.p02, "Jack"));
            memberList.add(new Member(65, R.drawable.p03, "Mark"));
            memberList.add(new Member(12, R.drawable.p04, "Ben"));
            memberList.add(new Member(92, R.drawable.p05, "James"));
            memberList.add(new Member(103, R.drawable.p06, "David"));
            memberList.add(new Member(45, R.drawable.p07, "Ken"));
            memberList.add(new Member(78, R.drawable.p08, "Ron"));
            memberList.add(new Member(234, R.drawable.p09, "Jerry"));
            memberList.add(new Member(35, R.drawable.p10, "Maggie"));
            memberList.add(new Member(57, R.drawable.p11, "Sue"));
            memberList.add(new Member(61, R.drawable.p12, "Cathy"));
        }

        @Override
        public int getCount() {
            return memberList.size();
        }

        @Override
        public Object getItem(int position) {
            return memberList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return memberList.get(position).getId();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.member, parent, false);
            }

            Member member = memberList.get(position);
            ImageView ivImage = (ImageView) convertView
                    .findViewById(R.id.ivImage);
            ivImage.setImageResource(member.getImage());

            TextView tvId = (TextView) convertView
                    .findViewById(R.id.tvId);
            tvId.setText(String.valueOf(member.getId()));

            TextView tvName = (TextView) convertView
                    .findViewById(R.id.tvName);
            tvName.setText(member.getName());
            return convertView;
        }
    }

}
