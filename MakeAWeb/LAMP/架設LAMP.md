# 架設LAMP on sles11 

- Go YaST Ctrl Center

![](./img/LAMP_1.PNG)

![](./img/LAMP_2.PNG)

- Software Manager Center; 點View > Patteren > 選擇 Web & LAMP server

![](./img/LAMP_3.PNG)

![](./img/LAMP_4.PNG)

(ps 需掛載上光碟, 以虛擬機為例)

![](./img/LAMP_5.PNG)

- 裝PHP, 用search額外安裝

![](./img/LAMP_16.PNG)

- 開啟服務

開啟apache

![](./img/LAMP_8.PNG)

開啟&設置 Mysql 

![](./img/LAMP_6.PNG)

![](./img/LAMP_7.PNG)

![](./img/LAMP_9.PNG)

![](./img/LAMP_10.PNG)

![](./img/LAMP_11.PNG)

做測試檔

![](./img/LAMP_12.PNG)

![](./img/LAMP_13.PNG)

由瀏覽器開啟

![](./img/LAMP_17.PNG)

- firefox 打不開php

- Help > Troubleshooting Information > Profile Directory: Show Folder

Try to delete the mimeTypes.rdf file in the Firefox Profile Folder to reset all file actions.

![](./img/LAMP_14.PNG)

- 包在html中

![](./img/LAMP_15.PNG)





[LAMP教學影片](https://www.youtube.com/watch?v=iUpNHQDyy0Q)
[VBird_伺服器ch20](http://linux.vbird.org/linux_server/0360apache.php#whatis_www_lamp)