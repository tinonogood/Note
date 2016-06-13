# RecycleView + CardView

1. file > Project Structure > app > Dependency > + > lib. dependency

	- 加入RecycleView, CardView

	- 可在build.gradle看見

		`dependencies {`
	    `compile fileTree(include: ['*.jar'], dir: 'libs')`
	    `testCompile 'junit:junit:4.12'`
	    `compile 'com.android.support:appcompat-v7:23.3.0'`
	    `compile 'com.android.support:cardview-v7:23.3.0'`
	    `compile 'com.android.support:recyclerview-v7:23.3.0'`
		`}`

做兩個layout檔

2. res/layout/activity_main:

	- 拉所需元件以及RecyclerView以後續放入cardview, `<android.support.v7.widget.RecyclerView>`需打出全名

3. res/layout/recycleview_cardview_items:

	- 同樣需要打出全名`<android.support.v7.widget.CardView>`

	- 拉所需元件, 1*圖 2*文字

4. java/Member:

	- VO, 將會員屬性放入類別, 同listview

5. java/MainActivity:

	- setLayoutManager: RecycleView可以動態設定layout

	- StaggeredGridLayoutManager: `new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL));` 水平(3rd參數)2列(1st參數)

	- `private class MemberAdapter extends RecyclerView.Adapter`: MemberAdapter繼承RecyclerView內部類別Adapter

	- onCreateViewHolder & Inflater載入recycleview_cardview_items的layout 然後return

	- ViewHolder(line55): 繼承RecyclerView內部類別ViewHolder, 管理1*圖 2*文字

	- onBindViewHolder: 需要顯示的資料套用於ViewHolder