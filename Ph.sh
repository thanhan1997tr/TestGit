read -p "A = " a
read -p "B = " b
read -p "Nhap mot phep toan (+, -, *, /): " pt
case $pt in
"+")
	let "kq = $a + $b";;
"-")
	let "kq = $a - $b";;
"*")
	let "kq = $a * $b";;
"/")
	let "kq = $a / $b";;
*)
	echo "Nhap sai.";;
esac
echo "KQ = " $kq
