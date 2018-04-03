read -p "A = " a
read -p "B = " b

if [ $a -gt $b ]
	then
	echo "Max = " $a
else
	echo "Max = " $b
fi
