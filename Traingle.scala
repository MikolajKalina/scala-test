object Solution {
 def solution(a: Array[Int]): Int = {
  def helper(a:Int, b:Int, c:Int):Boolean = if((a+b) > c ) true else false 

  val czum = for(i<-0 to a.length-1; 
                j<- i+1 to a.length-1;  
                k<- j+1 to a.length-1; 
                if(
                (helper(a(i),a(j),a(k) ))
                &&
                (helper(a(j),a(k),a(i) ))
                &&
                (helper(a(k),a(i),a(j) ))
                ) 
                ) yield (i,j,k) 

 czum.foreach(println)

  
 if(czum.size >0) 1 else 0
}
 
}

val czu = Solution
println(czu.solution(Array(10,2,5,1,8,20)))
println(czu.solution(Array(10,50,5,1)))
