# Layout & Visibility設置

1. res/layout/activity_main:

	- 最大layout為vertical垂直(`android:orientation="vertical"`)的linearLayout線性排版, 裡面包小FrameLayout(可堆疊) & 水平linearLayout(`android:orientation="horizontal"`)

	- 個別包了兩張圖, 放進ImageView, ImageView設置點擊事件(`android:onClick="onImageClick"`), 提供給消失方法

	- 做Button, 設onClick, (`android:layout_gravity="center_horizontal"`)置中

2. java/MainActivity:

	- 完成點擊事件onImageClick:  

	`public void onImageG1Click(View view) {}`

	- `view.setVisibility(View.INVISIBLE);` : 隱藏仍占空間

	- `view.setVisibility(View.GONE);` : 隱藏不占空間