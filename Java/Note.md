### 大原則

- 簡單註解每段程式碼, 以利共同開發者了解

### 補充筆記

- 後繼遞增 y = x++: y=x_original x=(x_original + 1) ; 前置遞減 y = --x: y=x=(x_original - 1)

- 隨機小寫: (char) (97 + (int)(Math.random() * 26))

- 定義常數, 使程式更容易閱讀 ex: final double KILOGRAMS_PER_POUND = 0.45359237;

- Scanner重複利用, 放前面