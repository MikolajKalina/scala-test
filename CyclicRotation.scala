object Solution { 
def solution(a: Array[Int], k: Int): Array[Int] = {
var tmpAr = a
tmpAr.foreach(println) 

 for(i<- 1 to k){
  println("Rotacja nr: "+i)  
  val tmp = tmpAr.tail
  val head:Int = tmpAr.head
  tmpAr = tmp ++  Array(head)
  tmpAr.foreach(println)  
 println("---")
 }
tmpAr
}
}
val czum = Solution
czum.solution(Array(3, 8, 9, 7, 6),3)

