echo "====MENU ABC===="
echo "1) Coffee"
echo "2) Milk"
echo "3) Tea"
echo "4) Wine"
read -p "Your Choice (1,2,3,4): " c
case $c in
"1")
	echo "You Like Coffee";;
"2")
	echo "You Like Milk";;
"3")
	echo "You Like Tea";;
"4")
	echo "You Like Wine";;
*)
	echo "Nhap sai.";;
esac
