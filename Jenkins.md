# Jenkins

- Setup(SLES11SP3)

Check Apache, Jenkins Server or Install it.

`chkconfig | grep apache2(, jenkins)`

`zypper in apache2`, `/etc/init.d/apache2 start`

`zypper addrepo http://pkg.jenkins-ci.org/opensuse/ jenkins`

`zypper in jenkins`

![](./img/Jenkins_1.PNG)

![](./img/Jenkins_2.PNG)

啟動失敗, 安裝Java7或以上

![](./img/Jenkins_3.PNG)

`zypper in java-1_7_0-ibm`, `/etc/init.d/jenkins restart`

瀏覽器開啟: ip_addr:8080 (default port:8080)

根據網頁指示設置