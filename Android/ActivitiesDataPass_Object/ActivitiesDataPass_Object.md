# ActivitiesDataPass_Object

1. 排版同ActivitiesDataPass, 兩個Activity, 皆在manifest檔中宣告

2. java/Score:  作物件"Score"

	- 實作Score物件

	- 等待MainActivity傳入三科成績

	- 做平均 & 總分

3. java/MainActivity:

	- 轉換使用者輸入的成績字串(Integer.parseInt())後, 實作Score並放入成績

	- `bundle.putSerializable("score", score);` score物件放入bundle

4. java/ResultActivity:

	- 作方法showResults(), `Object score = bundle.getSerializable("score");`取得物件

	- score.toString(): 直接用的方法, 用setText show在TextView tvResult;上