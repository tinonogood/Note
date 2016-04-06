#Installation

==================

1. 


#基本工具

==================

1. net-tools

ifconfig, 網路流量監控......

	#pacman -S net-tools

2. pkgfile

searching files from packages

	#pacman -S pkgfile

3. base-devel

gcc, gzip, automake, make, sudo, which...基本工具

	#pacman -S base-devel

4. vim

	#pacman -S vim

5. bash-completion

	#pacman -S bash-completion



#安裝工具pacman

==================

更新
	
	#pacman -Sy



#網路指令設定

==================

1. 配置網路

	#systemctl enable dhcpcd.service

	#systemctl restart dhcpcd.service

2. ifconfig,route在net-tools中，nslookup,dig在dnsutils中，ftp,telnet等在inetutils中,ip命令在iproute2中

	#pacman -S net-tools dnsutils inetutils iproute2

#Yaourt

==================

