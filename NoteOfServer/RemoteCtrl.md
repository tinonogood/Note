## 遠端連線Server

文字or圖形取得Shell，進行系統管理任務  

##### 功能
- 分享 Unix Like 主機的運算能力
- 伺服器類型 (Server) ：有限度的開放連線
- 工作站類型 (Workstation) ：只對內網開放

##### 類型
- 文字介面: telnet(明碼), ssh(密碼)
- 圖形介面: VNC(_Virtual Network Computing_), Xdmcp

	圖形介面傳輸的資料量相當的大， 速度與安全性都有待考量。建議將圖形介面遠端登入伺服器開放於內部網域 (LAN) ！

### SSH

_Secure SHell protocol_, 資料封包加密, 原始資料轉亂碼&亂碼反推原始資料
- 遠端連線(ssh)
- 資料傳輸(sftp-server)

非對稱金鑰系統

- public key: 提供遠端主機進行資料加密，遠端取得本機公鑰將資料加密(原始資料>亂碼)
- private key: (亂碼>原始資料), 保護在本地端，解密用

![](./img/RemoteCtrl_1)

SSH server-client連線步驟

![](./img/RemoteCtrl_2)

