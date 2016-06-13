package teamfour.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Member> memberList;
    private ViewPager vpMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Member> memberList = getMemberList();
        MemberAdapter memberAdapter = new MemberAdapter(getSupportFragmentManager(), memberList);
        vpMember = (ViewPager) findViewById(R.id.vpMember);
        vpMember.setAdapter(memberAdapter);
    }

    private List<Member> getMemberList() {
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
        return memberList;
    }

    private class MemberAdapter extends FragmentStatePagerAdapter {
        List<Member> memberList;

        private MemberAdapter(FragmentManager fm, List<Member> memberList) {
            super(fm);
            this.memberList = memberList;
        }

        @Override
        public int getCount() {
            return memberList.size();
        }

        @Override
        public Fragment getItem(int position) {
            return MemberFragment.newInstance(memberList.get(position));
//          MemberFragment開頭造newInstance了
        }
    }

    public void onFirstClick(View view) {
        vpMember.setCurrentItem(0);
    }
// 設定目前頁面為0

    public void onLastClick(View view) {
        vpMember.setCurrentItem(memberList.size() - 1);
    }
}
