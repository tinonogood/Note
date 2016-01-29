#!/bin/bash
#Program:
#	CONCAR > POSCAR
#History:
#2015/12/20	tino	1st
#2015/12/21	tino	2nd:add vsub
#2015/12/21	tino	3rd:fix until[]
#2015/12/21	tino	4th:use folder name as job name
export PATH=/bin:/sbin:/usr/local/bin:~/bin
export PATH=$PATH:/usr/bin

#until [ test -z "${1}" ]
#do
#	test -e $1 && read -p "vsub_E5_541 jobname for ${1}?" a && vsub_E5_541 ${a} 
#	shift
#done
until [[ -z "${1}" ]]
do
	test -e ${1}/POSCAR9 && mv ${1}/POSCAR9 ${1}/POSCAR10
	test -e ${1}/POSCAR8 && mv ${1}/POSCAR8 ${1}/POSCAR9
	test -e ${1}/POSCAR7 && mv ${1}/POSCAR7 ${1}/POSCAR8
	test -e ${1}/POSCAR6 && mv ${1}/POSCAR6 ${1}/POSCAR7 && cp ${1}/OUTCAR6 ${1}/OUTCAR7
	test -e ${1}/POSCAR5 && mv ${1}/POSCAR5 ${1}/POSCAR6 && cp ${1}/OUTCAR5 ${1}/OUTCAR6
	test -e ${1}/POSCAR4 && mv ${1}/POSCAR4 ${1}/POSCAR5 && cp ${1}/OUTCAR4 ${1}/OUTCAR5
	test -e ${1}/POSCAR3 && mv ${1}/POSCAR3 ${1}/POSCAR4 && cp ${1}/OUTCAR3 ${1}/OUTCAR4
	test -e ${1}/POSCAR2 && mv ${1}/POSCAR2 ${1}/POSCAR3 && cp ${1}/OUTCAR2 ${1}/OUTCAR3
	test -e ${1}/POSCAR && mv ${1}/POSCAR ${1}/POSCAR2
	cp ${1}/CONTCAR ${1}/POSCAR && cp ${1}/OUTCAR ${1}/OUTCAR2
        test -e $1 && cd ${1} && vsub_E5_541 ${1%/*}  && cd ..
#        test -e $1 && read -p "vsub_E5_541 jobname for ${1}? " a && cd ${1} && vsub_E5_541 ${a}  && cd ..
        shift
done

