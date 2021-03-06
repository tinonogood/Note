## Require 

VASP, Intel C++ and Fortran Compilers, Intel MKL(Math Kernel Library), Intel MPI

## STEPs

#### 解壓縮 VASP 檔案 (檔與資料庫)

<em>#tar –xvzf vasp.tgz vasp.lib.tgz'</em>

#### 將Intel軟體工具的環境變數寫入

ex: 檔案路徑 & 使用平台

<em>#source /opt/intel/parallel_studio_xe_2015/bin/psxevars.sh intel64</em>

#### 建立VASP

至 vasp.x.x 資料夾

將makefile.linux_ifc_P4 呼叫  Intel® MKL libraries 更換成 Fotran compiler

<em>FC= mpiifort</em>

<em>CPP    = $(CPP_) -DMPI  -DHOST=\"LinuxIFC\" -DIFC \
     -DCACHE_SIZE=32000 -DPGF90 -Davoidalloc -DNGZhalf \
     -DMPI_BLOCK=64000 -Duse_collective -DscaLAPACK  –DMKL_ILP64
</em>

更換FORTRAN flags區塊

-xCORE-AVX2開啟Haswell微架構的座標化, 請參照Intel Compiler reference manual找出微架構的flag

-xhost開啟最高可用SIMD(Single Instruction Multiple Data, 單指令流多資料流)

<em>FFLAGS = -FR -names lowercase -assume byterecl -I$(MKLROOT)/include/fftw
	........
	...
	OFLAG=-O3 -xCORE-AVX2
	.......
</em>

指向MKL資料庫,  -mkl=cluster是Intel compiler flag, 包含VASP會用到的Intel MKL BLAS, LAPACK, FFT, ScaLAPACK函數

<em>MKLROOT=/opt/intel/composer_xe_2015/mkl
	MKL_PATH=$(MKLROOT)/lib/intel64
	....
	.....
	BLAS= -mkl=cluster
	LAPACK=
	......
	.....
</em>

標註FFT3D, 並確認以下flag

<em>#FFT3D = fftdfurth.o fftdlib.o
</em>

<em>FFT3D= fftmpiw.o fftmpi_map.o fftw3d.o fft3dlib.o
	INCS = -I$(MKLROOT)/include/fftw
</em>

-mkl=cluster已經包含MKL ScaLAPACK libraries, SCA留空

<em>SCA= </em>

建立可執行VASP, 在當前目錄

<em>#make –f makefile.linux_ifc_P4
</em>

[Building VASP* with Intel® MKL, Intel® Compilers and Intel® MPI](https://software.intel.com/en-us/articles/building-vasp-with-intel-mkl-and-intel-compilers)