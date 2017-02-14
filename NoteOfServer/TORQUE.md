# Install (SLES11_sp3)

需求: libxml2, openssl

通道: 15001~3

  vi /etc/sysconfig/SuSEfirewall2
  
  SERVER: FW_SERVICES_EXT_TCP="15001"; 
  
  MOM: FW_SERVICES_EXT_TCP="15002 15003"
  
若無DNS Server, /etc/hosts: 使SERVER, MOM互認

  zypper install libopenssl-devel libtool libxml2-devel boost-devel gcc gcc-c++ make gmake
  
  zypper in wget
  
  wget http://www.adaptivecomputing.com/download/torque/torque-4.2.10.tar.gz -O torque-4.2.10.tar.gz
  
  tar -zxvf torque-4.2.10.tar.gz & cd torque-4.2.10

--------------

  ./configure
  
  make
  
  make install
  
開機trqauthd自動啟動
  
  cp contrib/init.d/suse.trqauthd /etc/init.d/trqauthd
  
  chkconfig --add trqauthd
  
  echo /usr/local/lib > /etc/ld.so.conf.d/torque.conf
  
  ldconfig
  
  service trqauthd start
  
 --------------------------- 
  
  ./configure --prefix=/usr/TORQUE --with-scp --with-server-home=/var/spool/TORQUE
  
  make
  
  make install
  
  make packages
  
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

新增服務與開機自啟動
  
  cp contrib/init.d/suse.pbs_server /etc/init.d
  
  cp contrib/init.d/suse.pbs_sched /etc/init.d
  
  chkconfig --add suse.pbs_server
  
  chkconfig --add suse.pbs_sched
  
  chkconfig pbs_server on
  
  chkconfig pbs_sched on
  
  
初始化

  pbs_server -t create
  
  
  
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
