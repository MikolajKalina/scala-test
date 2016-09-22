import scala.collection.mutable.Map
import scala.collection.mutable.Set

object Solution { 
def solution(a: Array[Int]): Int ={

 val counts = Map.empty[Int,Int]
 val sets = Set.empty[Int]

 for(i<- a){
  val numb = i 
  val oldCount = if(counts.contains(numb)) counts(numb) else 0
  counts += (numb -> (oldCount + 1 ))
 }

 for(j<- counts) sets+=j._2

sets.size
}
}


val cz = Solution
println(cz.solution(Array(2,1,1,2,3,1)))
println(cz.solution(Array(2,1,1,2,2,3,1)))
println(cz.solution(Array(2,1,1,2,2,3,1,3)))
println(cz.solution(Array(2,1,1,2,2,3,1,3,3)))
