object Solution { 
def solution(a: Int, b: Int, k: Int): Int ={

 val czu = for(i<-a to b ;if(a<b); if(i % k ==0 )) yield i
 
  println(czu)
  czu.size 
  } 
}

val czu = Solution
println(czu.solution(6,11,2))
