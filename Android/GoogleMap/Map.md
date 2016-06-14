# Map

1. get API KEY

2. SDK Manager>Google Repository install

3. file>Projcet Structre>app>Dependency>新增play-services

4. manifests/AndroidManifest.xml:

	- <meta-data/> 加上android.gms, API_KEY(value: 填上申請的金鑰)

	- 加上permission

	    - `<uses-permission android:name="android.permission.INTERNET" />`: 網路
    	
    	- `<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />`
    
    	- `<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />`: 外部儲存體

    	- `<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />`: 粗定位
    	
    	- `<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />`: 精細定位

    - <uses-feature>: 給OPENGL2.0以上使用者安裝

    - 使用的頁面需寫入<activity/>中

5. res/layout/map_activity:

	- 須放在fragment中 `class="com.google.android.gms.maps.SupportMapFragment"`

	- 