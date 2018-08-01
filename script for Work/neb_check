#!/bin/bash
export PATH=/bin:/usr/bin:/sbin:~bin:$PATH

if [[ ! -d structure-check ]];then
        mkdir structure-check
fi

data=$(ls |grep -P '^\d\d\b')

for i in ${data}; do
        cp ${i}/POSCAR structure-check/${i}.vasp
done
