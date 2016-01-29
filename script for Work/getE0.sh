#!/bin/bash
#Program:
#	get {filename} {final E0 value}
#History:
#2016/1/11	tino	1st
export PATH=/bin:/sbin:~/bin:$PATH

until [[ -z "${1}" ]]
do
	test -e $1 && echo -n "$1 " >> E0s && echo `grep E0 $1/$1.log | tail -1 | awk '{print $4 " " $5}'` >> E0s
	shift
done

# Note
# echo -n " " >> == append no change line
# tail -# == 最後#行
# awk '{print $#}' == 呼叫出第#個字, 依空格分開