import scala.collection.mutable.Set

object Solution {
def solution(a: Array[Int]): Int = {
var Sequ = Set.empty[Int]
  
 for(i<- 0 to a.length-1) Sequ+=a(i)

 if(Sequ.size < (a.sortWith(_ > _).head)
  ) 0 else 1
 
}
}

val czum = Solution
//zgodnie z zalozeniami N e <1..N> != 0 tu nie ma perm, czyli zwraca 0
println(czum.solution(Array(1,2,3,4,7,11)))
//a tu powinna być, zwraca 1
println(czum.solution(Array(1,2,3,4)))
//tu również, mimo braku zachowania kolejnosci, zwraca 1
println(czum.solution(Array(5,6,4,3,1,2)))
