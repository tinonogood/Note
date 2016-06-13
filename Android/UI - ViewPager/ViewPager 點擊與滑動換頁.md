# ViewPager 點擊與滑動換頁

1. res/layout/activity_main:

	- `<android.support.v4.view.ViewPager/>`: 使用 ViewPager元件

	- 拉出所需元件, 按鈕註冊onCLick

2. res/layout/member_fragment:

	- 每一個page的layout

3. java/Member:

	- 建立Member類別: 實作Serializable, 儲存data, 將物件儲入Bundle

4. java/MemberFragment:

	- newInstance(): 當constructor, 

	- `args.putSerializable("member", member);` 將member物件綁入Bundle args

	- `fragment.setArguments(args);` 將Bundle args傳入fragment, 並return fragment

	- onCreateView(): inflate塞入layout; 實作member並get資訊

5. java/MainActivity:

	- `setContentView(R.layout.activity_main);`放入layout

	- getMemberList(): 建立list

	- 做Adapter(,MemberAdapter)繼承FragmentStatePagerAdapter, 管理Fragment內容