object Solution { 
def solution(a: Array[Int]): Int  = {

 val maxValue = a.sortWith(_>_).head
 val TabMis = Array[Int]()
 val czu=  for(i<- 1 to maxValue ; if(!(a contains(i) ))) yield i
 
czu.sortWith(_<_).head
  }
}
val czum = Solution
println(czum.solution(Array(1,3,6,4,1,2)))
println(czum.solution(Array(1,3,5,6,4,1,2,9)))
