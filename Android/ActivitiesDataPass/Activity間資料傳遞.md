# Activity間資料傳遞

1. manifests/AndroidManifest.xml:

	- 有兩個Activity, 必須在manifest檔中宣告

2. res/layout/activity_main:

	- EditText: 供使用者輸入

	- Button: 註冊onClick跳至ResultActivity

3. res/layout/result_main:

	- 呈現的所需元件

	- Button: 註冊onClick跳至MainActivity

4. java/MainActivity:

	- findviews(): 對應至所需layout位置

	- `isValid(EditText editText)`: 判斷成績0~100 (, 1[0]{2} = 100; [0-9]{1,2} = 0~9 每個出現1~2次) , `editText.setError();`: 噴錯誤訊息

	- Integer.parseInt(): 將字串轉成10進位

	- Intent: 指定出要去頁面

	- Bundle: 儲存data, `intent.putExtras(bundle);`放入Intent內

	- `startActivity(intent);`前往指定頁面

5. java/ResultActivity

	- showResult(): 自己做的呈現結果方法

	- `Bundle bundle = getIntent().getExtras();` getIntent()取得Intent, getExtras()取出bundle

	- getInt(): 取出成績

	- backButtom: 叫出finish結束此頁=回前頁