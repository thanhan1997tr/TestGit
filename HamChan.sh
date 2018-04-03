function HamChan
{
	let "num = 0"
	while [ $num -lt $1 ]
	do
		echo $num
		let "num = $num + 2"
	done
}

#Goi ham
HamChan 40

#testSSS
