##1. 系統

======================================================

此VASP(5.4.1)建構系統具以下結構

vasp.X.X.X (root directory)

-arch

-bin

-build

-src - lib

####root/
	
高階makefile, 和子資料夾

####root/src
	
來源檔, 低階makefile

####root/src/lib
	
VASP資料庫(vasp.X.lib), 低階makefile

####root/arch
	
makefile.include.arch檔(arch: 版本)
	
####root/build
	
VASP的不同版本(標準, gramma only, 非共線板本...)

####root/bin
	
二進位 code

##2. 如何編譯VASP

==============================================================

從 root/arch複製所需(最接近作業系統)的makefile.include.arch檔案到 root/makefile.include

	ex: '#cp arch/makefile.include.linux_intel  ./makefile.include'

設置makefile.include以配合自身系統(見section 3)

編譯VASP

	'#make all'

若要編譯其他版本(standard, gamma-only, and non-collinear)

	'#make std'

	'#make gam'

	'#make ncl'

##3. 調整makefile.include

==============================================================

Precompiler variables:
------------------------------------------------------------------------

CPP_OPTIONS:
	Specify the precompiler flags: [-Dflag1 [-Dflag2] ... ]
	Take a lead from the makefile.include.arch files in /arch
	and consult the VASP manual.

	N.B.I: -DNGZhalf, -DwNGZhalf, -DNGXhalf, -DwNGXhalf are
	       deprecated options.  Building the standard, gamma-only,
	       or non-collinear version of the code is specified through
	       an additional argument to the make command
	       (see "make" section below).

	N.B.II:	CPP_OPTIONS is only used in this file,
	        where it should be added to CPP (see below).


CPP:
	The command to invoke the precompiler you want to use,
	for instance:

	Using Intel's Fortran precompiler:
		CPP=fpp -f_com=no -free -w0 $*$(FUFFIX) $*$(SUFFIX) $(CPP_OPTIONS)

        Using cpp:
		CPP=/usr/bin/cpp -P -C -traditional $*$(FUFFIX) >$*$(SUFFIX) $(CPP_OPTIONS)

	N.B.: This variable has to include $(CPP_OPTIONS)!
	      If not, CPP_OPTIONS will be ignored.



Compiler variables:
------------------------------------------------------------------------

The Fortran compiler will be invoked as:

	$(FC) $(FREE) $(FFLAGS) $(OFLAG) $(INCS)


FREE:
	Specify the options that your Fortran compiler needs for it to
	accept free-form source layout, without line-length limitation.
	For instance:

	Using Intel's Fortran compiler:
		FREE=-free -names lowercase

	Using gfortran:
		FREE=-ffree-form -ffree-line-length-none


FC:
	The command to invoke your Fortran compiler
	(e.g. gfortran, ifort, mpif90, mpiifort, ... ).


FCL:
	The command that invokes the linker: in most cases identical to:

		FCL=$(FC) [+ some options]

	Using the Intel composer suite (Fortan compiler + MKL libraries),
	typically:

		FCL=$(FC) -mkl


OFLAG:	
	The general level of optimization (default: OFLAG=-O2).


FFLAGS:
	Additional compiler flags.


OFLAG_IN:
	(default: -O2) In the vast majority of makefiles this
	variable is set:

		OFLAG_IN=$(OFLAG)


DEBUG:
	The optimization level with which the main program (main.F)
	will be compiled, usually:

		DEBUG=-O0


INCS:
	Use this variable to specify objects to be included in the
	sense of:

		INCS=-Idirectory-with-files-to-be-included



Libraries:
------------------------------------------------------------------------

The linker will be invoked as:

	$(FCL) -o vasp  ..all-objects.. $(LLIBS) $(LINK)


LLIBS:
	Specify libraries and/or objects to be linked against,
	in the usual ways:

		LLIBS=[-Ldirectory -llibrary] [path/library.a] [path/object.o]

	Usually one has to specify several numerical libraries
	(BLAS, LAPACK or scaLAPACK, etc).

	For instance using the Intel composer suite (and compiling with
        CPP_OPTIONS= .. -DscaLAPACK ..):

		MKL_PATH   = $(MKLROOT)/lib/intel64
		BLACS      = -lmkl_blacs_openmpi_lp64
		SCALAPACK  = $(MKL_PATH)/libmkl_scalapack_lp64.a $(BLACS)
		LLIBS      = $(SCALAPACK) $(LAPACK)

	For other configurations please take a lead from the
	makefile.include.arch files under /arch.



The list of objects:
------------------------------------------------------------------------

The standard list of objects needed to compile VASP is given by the
variable SOURCE in the root/src/.objects file that is part of the 
distribution.

Objects to be added to this list can be specified in makefile.include
by means of:

	OBJECTS= .. your list of objects ..


N.B.: Several objects will *have* to be added in this manner (see the
following section on "Fast-Fourier-Transforms).



Fast-Fourier-Transforms:
------------------------------------------------------------------------

OBJECTS:
	Add the objects to be compiled (or linked againts) that provide
	the FFTs (may include static libraries of objects .a).


INCS:
	In case one compiles using the fftw-library, i.e.,

		 OBJECTS= .. fftw3d.o fftmpiw.o ..

	then INCS can be set to the directory that holds "fftw3.f":

		INCS=-Idirectory-that-holds-fftw3f

	(needed because fftw3d.F and fftmpiw.F include "fftw3.f").

	N.B.: If in the aformentioned case INCS is not set,
	      then fftw3.f has to be present in /src.


Common choices are:

	To use Intel's MKL wrapper of fftw (and compiling with
	CPP_OPTIONS= .. -DMPI ..):

		OBJECTS= fftmpiw.o fftmpi_map.o fftw3d.o fft3dlib.o \
		       $(MKLROOT)/interfaces/fftw3xf/libfftw3xf_intel.a

		INCS=-I$(MKLROOT)/include/fftw


	Or to use Juergen Furtmueller's FFT implementation (and -DMPI):

		OBJECTS= fftmpi.o fftmpi_map.o fft3dfurth.o fft3dlib.o

		INCS=


	For other configurations please take lead from the
	makefile.include.arch files under /arch.



Special rules for the optimization level of FFT related objects:
------------------------------------------------------------------------

The makefiles of our old build systems contained a set of special rules
for the optimization level allowed in the compilation of the FFT related
objects. In the current build system these special rules can be
duplicated by adding the following:

	OBJECTS_O1 += fft3dfurth.o fftw3d.o fftmpi.o fftmpiw.o

	OBJECTS_O2 += fft3dlib.o



Special rules in general:
------------------------------------------------------------------------

The current src/makefile contains a set of recipes to allow for the
compilation of objects at different levels of optimization (other than
the general level specified by OFLAG). These recipes replace the
special rules section of the makefiles in our old build system.

In these recipes the compiler will be invoked as:

	$(FC) $(FREE) $(FFLAGS_x) $(OFLAG_x) $(INCS_x) 

where x stands for: 1, 2, 3, or IN.


FFLAG_x:
	Default: FFLAG_x=$(FFLAG), for x=1, 2, 3, and IN.


OFLAG_x:
	Default: OFLAG_x=-Ox (for x=1, 2, 3), and OFLAG_IN=-O2


INCS_x:
	Default: INCS_x=$(INCS), for x=1, 2, 3, and IN.


The objects to be compiled in accordance with these recipes are
specified by means of the variables:

	OBJECTS_O1, OBJECTS_O2, OBJECTS_O3, and OBJECTS_IN


Several objects are compiled at -O1 and -O2 by default. These lists
of objects are specified in the .objects file through the variables:

	SOURCE_O1, SOURCE_O2, and SOURCE_IN

and reflect the special rules as they were present in most of the
makefiles of the old build system.

To completely overrule a default setting (for instance for the -O1
special rules) use the following construct:

	SOURCE_O1=
	OBJECTS_O1= .. your list of objects ..



For the library "lib" (what used to be vasp.5.lib):
------------------------------------------------------------------------

CPP_LIB:
	The command to invoke the precompiler.
	In most cases it will suffise to set:

		CPP_LIB=$(CPP)


FC_LIB:	
	The command to invoke your Fortran compiler.
	In most cases:

		FC_LIB=$(FC)

	N.B.: the library can be compiled without MPI support,
	      i.e., when FC=mpif90, FC_LIB may specify a Fortran
	      compiler without MPI supprt, e.g. FC_LIB=ifort.


FFLAGS_LIB:
	Fortran compiler flags, including a specification of the
	level of optimization. In most cases:

		FFLAGS_LIB=-O1


FREE_LIB:
	Specify the options that your Fortran compiler needs for it to
	accept free-form source layout, without line-length limitation.
	In most cases it will suffise to set:

		FREE_LIB=$(FREE)


CC_LIB:	
	The command to invoke your C compiler (e.g. gcc, icc, ..).
	N.B.: the library can be compiled without MPI support.


CFLAGS_LIB:
	C compiler flags, including a specification of the
	level of optimization. In most cases:

		CFLAGS_LIB=-O	

OBJECTS_LIB:
	List of "non-standard" objects to be added to the library.
	In most cases:

		OBJECTS_LIB= linpack_double.o

	When compiling VASP with -Duse_shmem, one has to add getshmem.o
	as well, i.e.,

		OBJECTS_LIB= .. getshmem.o ..

##4.範例

=====================================================================

	# Precompiler options
	CPP_OPTIONS= -DMPI -DHOST=\"IFC91_ompi\" -DIFC \
	             -DCACHE_SIZE=4000 -DPGF90 -Davoidalloc \
	             -DMPI_BLOCK=8000 -DscaLAPACK -Duse_collective \
	             -DnoAugXCmeta -Duse_bse_te \
	             -Duse_shmem -Dtbdyn
	
	CPP        = fpp -f_com=no -free -w0  $*$(FUFFIX) $*$(SUFFIX) $(CPP_	OPTIONS)
	
	FC         = mpiifort
	FCL        = mpiofort -mkl
	
	FREE       = -free -names lowercase
	
	FFLAGS     = -assume byterecl
	OFLAG      = -O3
	OFLAG_IN   = $(OFLAG)
	DEBUG      = -O0
	
	MKL_PATH   = $(MKLROOT)/lib/intel64
	BLAS       = 
	LAPACK     =
	BLACS      = -lmkl_blacs_openmpi_lp64
	SCALAPACK  = $(MKL_PATH)/libmkl_scalapack_lp64.a $(BLACS)
	
	OBJECTS    = fftmpiw.o fftmpi_map.o fftw3d.o fft3dlib.o \
	             $(MKLROOT)/interfaces/fftw3xf/libfftw3xf_intel.a
	INCS       =-I$(MKLROOT)/include/fftw
	
	LLIBS      = $(SCALAPACK) $(LAPACK) $(BLAS)
	
	OBJECTS_O1 += fft3dfurth.o fftw3d.o fftmpi.o fftmpiw.o
	OBJECTS_O2 += fft3dlib.o
	
	# For what used to be vasp.5.lib
	CPP_LIB    = $(CPP)
	FC_LIB     = $(FC)
	CC_LIB     = icc
	CFLAGS_LIB = -O
	FFLAGS_LIB = -O1
	FREE_LIB   = $(FREE)
	
	OBJECTS_LIB= linpack_double.o getshmem.o
	
	# Normally no need to change this
	SRCDIR     = ../../src
	BINDIR     = ../../bin
