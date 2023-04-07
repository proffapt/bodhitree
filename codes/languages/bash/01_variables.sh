#!/bin/sh

: '
	Multi line 
	Comment?

	Ahhhhhh damn yes
'
echo "${foo:-default_value}"
# echo "${foo:?chutiya}" ## Gives an error message if not set
foo="set nahi kiya toh error dega"
echo "${foo:?error_message}" ## Gives an error message if not set
echo "${foo:+over_writing_value}" # replaces the value only if it is set
str="/path/to/foo.cpp"
echo ${str##*.}

while read -r line; do
	echo "${line::1}"
done < ./00_file.txt

list=('apple' 'mango' 'banana')
echo "${list[@]}"
echo "${!list[@]}"
