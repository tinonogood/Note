# Install (SLES11_sp3, torque-4.2.10)

需求: libxml2, openssl
  
若無DNS Server, /etc/hosts: 使SERVER, MOM互認

設置無密碼ssh

  zypper install libopenssl-devel libtool libxml2-devel boost-devel gcc gcc-c++ make gmake
  
<http://www.adaptivecomputing.com/support/download-center/torque-download/>
  
  tar -zxvf torque-4.2.10.tar.gz & cd torque-4.2.
  
1. RPM build

Server(Deploy): 

  rpmbuild -ta torque-4.2.10.tar.gz

  rpm - ivh /usr/src/packages/RPMS/x86_64/torque-*
  
  cat /var/spool/torque/server_name # 確認Server: Deploy

  scp {devel, client, } Node:/usr/src/packages/RPMS/x86_64/
  
創 Node file
  
  qmgr -c "create node bay2-3"
  
  qmgr -c "set node bay2-3 np=4"
  
  qmgr -c "list node bay2-3"
  
  qmgr -c "delete node xxx" # 刪除

服務: /etc/init.d/{trqauthd, pbs_server, pbs_sched}
  
Nodes:

  rpm - ivh /usr/src/packages/RPMS/x86_64/torque-*
  
  cat /var/spool/torque/server_name # 確認Server: Deploy
  
  cat /var/spool/torque/mom_priv/config # $pbsserver Deploy
  
服務: /etc/init.d/pbs_mom
  
2. Autotool (尚未成功)
  
  ./configure --prefix=/usr/TORQUE --with-scp --with-server-home=/var/spool/TORQUE
  
  make; make install; make packages
  
  vim /etc/profile.d/torque.sh
  
    export PBS=/usr/TORQUE
    
    export PBS_SERVER_HOME=/var/spool/TORQUE
    
    export TORQUE=$PBS
    
    export PATH=$PBS/bin:$PBS/sbin:$PATH
    
    export MANPATH=$PBS/man:$MANPATH
    
    export LD_LIBRARY_PATH=$PBS/lib:$LD_LIBRARY_PATH
    
  source /etc/profile.d/torque.sh
    
  which pbs_server: 檢查設定是否正確  # /usr/TORQUE/sbin/pbs_server
  
  cat /var/spool/TORQUE/server_name
  
  cp contrib/init.d/suse.trqauthd /etc/init.d/trqauthd
  
  chkconfig --add trqauthd
  
  echo /usr/local/lib > /etc/ld.so.conf.d/torque.conf
  
  ldconfig
  
  service trqauthd start

新增服務與開機自啟動
  
  cp contrib/init.d/suse.pbs_server /etc/init.d
  
  cp contrib/init.d/suse.pbs_sched /etc/init.d
  
  chkconfig --add suse.pbs_server
  
  chkconfig --add suse.pbs_sched
  
  
初始化

  pbs_server -t create
  
  ./torque.setup tino
  
  
  
節點: scp /etc/profile.d/torque.sh, torque-4.2.10

trqauthd

  cp contrib/init.d/suse.trqauthd /etc/init.d/trqauthd
  
  chkconfig --add trqauthd
  
  echo /usr/local/lib > /etc/ld.so.conf.d/torque.conf
  
  ldconfig
  
  service trqauthd start
  
pbs

  vim /etc/profile.d/torque.sh
  
    export PBS=/usr/TORQUE
    
    export PBS_SERVER_HOME=/var/spool/TORQUE
    
    export TORQUE=$PBS
    
    export PATH=$PBS/bin:$PBS/sbin:$PATH
    
    export MANPATH=$PBS/man:$MANPATH
    
    export LD_LIBRARY_PATH=$PBS/lib:$LD_LIBRARY_PATH
    
  source /etc/profile.d/torque.sh
  
  cp contrib/init.d/suse.pbs_mom /etc/init.d
  
  chkconfig --add suse.pbs_mom
