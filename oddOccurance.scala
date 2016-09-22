import scala.collection.mutable.Map

def Odd(tab:Array[Int]) : List[Int] = {

 val counts = Map.empty[Int,Int]

 for(i<- tab){
  val numb = i 
  val oldCount = if(counts.contains(numb)) counts(numb) else 0
  counts += (numb -> (oldCount + 1 ))
 }
counts.filter(x => x._2%2==1 ).map( x=> x._1).toList
}

println(Odd(Array(9,3,9,3,9,7,9,9)))
