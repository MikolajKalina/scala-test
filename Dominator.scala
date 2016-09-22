import scala.collection.mutable.Map
object Solution { 
def solution(a: Array[Int]): Int ={

 val counts = Map.empty[Int,Int]

 for(i<- a){
  val numb = i 
  val oldCount = if(counts.contains(numb)) counts(numb) else 0
  counts += (numb -> (oldCount + 1 ))
 }

 val domi = counts.toSeq.sortWith(_._2 > _._2)
 println("Dominatorem jest: "+domi.head._1)
 domi.head._2
}
}

val czum = Solution
println("Ilość :"+czum.solution(Array(3,4,3,2,3,-1,3,3)))


