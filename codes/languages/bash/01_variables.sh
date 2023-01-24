#!/bin/sh

: '
	Multi line 
	Comment?

	Ahhhhhh damn yes
'

echo "Ohk"

foo="set nahi kiya toh erro dega"
echo "${foo:?chutiya}" ## Gives an error message if not set
echo "${foo:+testing}" # replaces the value only if it is set
str="/path/to/foo.cpp"
echo ${str##*.}

while read -r line; do
	echo "${line::1}"
done < file.txt

list=('apple' 'mango' 'banana')
echo "${list[@]}"
echo "${!list[@]}"
