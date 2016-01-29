# X WINDOW SYSTEM

## X window system

### X server/X Client/Window Manager/Display Manager

	大部分distribution由Xorg基金會提供的X11軟體
	MIT授權,GPL開放原始碼
![](./img/X_1.PNG)

##### X Server

	硬體管理: 鍵盤,滑鼠,顯示器,顯卡......
	將輸入裝置的動作告知Client 

##### X Client

	負責X server要求事件之處理

##### X Window Manager

	管理所有X clients
	- 提供控制元素，如工作列、背景桌面的設定等等；
	- 管理虛擬桌面 (virtual desktop)；
	- 提供視窗控制參數，這包括視窗的大小、視窗的重疊顯示、視窗的移動、視窗的最小化等等。
	ex: GNOME, KDE, twm, XFCE
![](./img/X_2.PNG)


##### Display Manager

	提供登入需求,載入user's語系等資料
	
### X window 啟動流程



#### 鳥哥的linux私房菜
(http://linux.vbird.org/linux_basic/0590xwindow.php)
