package y2024m10

fun main(){val(a,b,c)=readln().split(' ').map{it.toInt()};val d=(a+b)%c;val e=a*b%c;print("$d $d $e $e")}