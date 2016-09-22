object Solution { 
def solution(a: Array[Int]): Int ={for(i<-0 to a.length-1; j<- i+1 to a.length-1; k<-j+1 to a.length-1) yield (a(i)*a(j)*a(k))}.sortWith(_>_).head
}

val czu = Solution
println(czu.solution(Array(-3,1,2,-2,5,6)))
