# SQLite

主要User控制程式碼: 

	- MainActivity: 顯示儲存的資料內容

	- InserActivity: 新增新資料

	- UpdateActivity: 更改資料

MySQLiteOpenHelper: 控制SQL新增, 刪除, 更改資料庫`db.insert`,`db.update`,`db.delete`的類別; Spot: 要儲存物件(屬性)

1. manifests/AndroidManifest.xml:

	- 需顯示出的Activity頁面需註冊`<activity/>`, 並拉出各頁面layout

	- 應用程式會讀取外部儲存體與拍照需請求permission

		- `<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" /> `

		- `<uses-permission android:name="android.permission.CALL_PHONE" />`

2. java/Spot:

	- 製作物件來儲存data, 利用get, set

3. java/MySQLiteOpenHelper:

	- 設定常數

	- line25:` COL_id + " INTEGER PRIMARY KEY AUTOINCREMENT, " + ...` : 將id設定自動編號

	- `public void onCreate(SQLiteDatabase db) {db.execSQL(TABLE_CREATE);}` : 創DB, 執行SQL語法呼叫創DB的String常數

	- `getAllSpots()`取的所有DB資料, 利用`getReadableDatabase()`, 創游標Cursor用query查到各筆資料`Cursor cursor = db.query(TABLE_NAME, columns, null, null, null, null, null);`, 圖檔類型為Blob, 完成後關閉cursor, return得list

	- `Spot findById(int id)`: 利用景點ID取景點資料

	- 做`public long insert(Spot spot)`, `public int update(Spot spot)` 供Activity新增以及更新

	- `public int deleteById(int id)`: 利用景點ID刪除景點資料

4. java/MainActivity:

	- 創各個view變數, List 和 實作MySQLiteOpenHelper

	- `onStart()`

		- 取得使用者許可`askPermissions()`, 方法見下

		- `spotList = helper.getAllSpots();`: 利用實作MySQLiteOpenHelper的helper取得所有景點

		- 顯示第一個景點`showSpots(0);`, 方法見下

	- `if (helper == null) {helper = new MySQLiteOpenHelper(this);}`: 取得SQLiteHelper物件

	- tvWeb, tvPhone設置點擊監聽器, 前往網頁與打電話

	- showSpot()

		- BitmapFactory.decodeByteArray(): 將byte陣列轉Bitmap

		- 確認是否有資料, 沒有則設文字`tvRowCount.setText(" 0/0 " + getString(R.string.msg_NoDataFound));`顯示在TextView上

	- `onNextClick(View view)`, `onBackClick(View view)`: 完成android:onClick方法, 利用index, 向前(,向後)一個景點資訊呈現

	- `onDeleteClick(View view)`: 利用實作MySQLiteOpenHelper的helper `deleteById(id)`刪除該景點並會到第一個

	- `onUpdateClick(View view)`: intent指往新Activity, bundle包id

	- line166~208: 請求取可`askPermissions()`: 起始皆為否`REQ_PERMISSIONS = 0;`, 端看需要何種許可改動`String[] permissions = {};`即可

5. java/InsertActivity:

	- `onTakePictureClick(View view)`: 

		- intent指往MediaStore.ACTION_IMAGE_CAPTURE

		- startActivityForResult()發出請求後, 呼叫onActivityResult(), 並將請求代碼, 操作結果代碼傳至和操作資料傳至後者

		- `file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);` file為公開的外部檔案路徑

		- 根據intent, 開啟有指定功能的Activity

	- isIntentAvailable(): 確認是否有拍照程式, 有一個以上回傳true

	- `onLoadPictureClick(View view)`: intent指往ACTION_PICK

	- `onActivityResult()`: 抓取Take/Load PictureClick的intent做成case來執行

	- onFinishInsertClick(): 沒name或image會錯誤訊息給user, 用實作MySQLiteOpenHelper的helper.insert放入

6. java/UpdateActivity:

	- 基本同InsertActivity

	- 做initialViews(), 擷取前頁的id, 將取得data放入UI

	- 用實作MySQLiteOpenHelper的helper.update放入
