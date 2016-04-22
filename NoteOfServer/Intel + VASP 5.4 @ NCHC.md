#Intel + VASP 5.4 @ NCHC

##Load Module

	 #module avail : show module availiable

	 #module load compiler/intel/2016

	 #module load mpi/intel/impi/5.1.2.150

	 (all at /pkg/local/Modules/modulefiles)

	 #module list : show mnodule loaded

##FFTW

使用intel自帶的傅立葉轉換,較有效率

	 #cp -r /pkg/intel/2016/mkl/interfaces/fftw3xf .

	 #cd fftw3xf/

	 #make libintel64 compiler=intel MKLROOT=/pkg/intel/2016/mkl

得資料庫 libfftw3xf_intel.a

##vasp.5.lib

	 #tar -zxvf vasp.5.lib.tar.gz

	 #cd vasp.5.lib/

	 #cp makefile.linux_ifc_P4 Makefile
	
	 #vim Makefile: FC=>mpiifort
	 (#vim Makefile: FC改為ifort, 存檔離開)

	 #make

##vasp.5.4.1

	 #tar -zxvf vasp.5.4.1.tar.gz

	 #cd vasp.5.4.1

	 補齊patch,修復bug

	 #wget http://cms.mpi.univie.ac.at/patches/patch.5.4.1.08072015.gz

	 #wget http://cms.mpi.univie.ac.at/patches/patch.5.4.1.27082015.gz

	 #wget http://cms.mpi.univie.ac.at/patches/patch.5.4.1.06112015.gz
	 
	 #gzip -d patch.*.gz 解壓縮全部patch

	 #patch -p1 < patch.5.4.1.08072015
	 
	 	patching file arch/makefile.include.linux_intel
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/mlwf.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y       
		patching file src/scala.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/subrot.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/us.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/vdwforcefield.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		Hunk #1 succeeded at 9935 (offset 1 line).
	 
	 #patch -p1 < patch.5.4.1.27082015
	 
	 	patching file src/lattlib.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/main.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		Hunk #1 succeeded at 843 (offset 24 lines).
		patching file src/symlib.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/symmetry.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y
		patching file src/vdwforcefield.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y

	 #patch -p1 < patch.5.4.1.06112015
	 
	 	patching file src/fock.F
		Reversed (or previously applied) patch detected!  Assume -R? [n] y

	 <GPU support, no need in alps>

	 #wget http://cms.mpi.univie.ac.at/patches/patch.5.4.1.14032016.gz

	 #patch -p0 < patch.5.4.1.14032016

	 參考arch中的makefile

	 #cp arch/makefile.include.linux_intel  ./makefile.include

	 改makefile.include

	 	FC         = mpiifort
		FCL        = mpiifort -mkl
		BLACS      = -lmkl_blacs_intelmpi_lp64
		
	 #make
	 
	 在root/bin中可得vasp_std, vasp_ncl, vasp_gam 
		
		
參考：
[Stone's blog](https://ycstone.wordpress.com/2012/09/18/%E5%9C%A8nchc-alps%E4%B8%8A%E4%BD%BF%E7%94%A8intel-compiler-intel-mpi-intel-mkl%E4%BE%86%E7%B7%A8%E8%AD%AF-vasp/)
