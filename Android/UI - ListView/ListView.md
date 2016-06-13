# ListView

需做兩個layout檔, 一個放頁面, 另一放item

1. res/layout/activity_main:

	- 頁面排版, 放入TextView與ListView

2. res/layout/member:

	- item排版, 水平(horizontal)放置, 1*圖 2*文字

3. java/Member:

	- VO, 將會員屬性放入類別

		- private int id;

    	- private int image;

    	- private String name

    	- 設置get,set

4. java/MainActivity:

	- 實作listView > lvMember, 設置Adapter與setOnItemClickListener監聽點擊

	- Adapter繼承BaseAdapter, 

		- getCount得Array中item個數, 

		- getView: 利用convertView和LayoutInflater載入Member的layout, 將各個view依setImageResource, setText塞入view後return

		- 做array: memberList = new ArrayList<>();