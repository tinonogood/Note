#!/bin/bash
#Program:
#       submit several jobs
#History:
#2015/12/21     tino    1st
#2015/12/21	tino	2nd: until+command need double[]& export PATH for qsub(/usr/bin),vsub(/usr/local/bin)
#2015/12/24	tino	3rd: use folder name as job name
export PATH=/bin:/sbin:/usr/local/bin:/usr/bin:~/bin

until [[ -z "${1}" ]]
#until [[ test -z "$1" ]] ==> test=[ ]
do
	test -e $1 && cd ${1} && vsub_E5_541 "${1%/*}"  && cd ..
#        test -e $1 && read -p "vsub_E5_541 jobname for ${1}?" a && cd ${1} && vsub_E5_541 ${a} 	&& cd ..
        shift
done

#Note:
# test -e 測試是否存在
# [[-z ${}]]== test -z ${}, 測試是否為空字串
# &&==and,前者成立才執行後者; ||==or,前者不成立執行後者; ";"皆執行
# until 直到條件才停止
# do
# done 完成
# shift 變數向前一個$2==>$1, $3==>$2類推