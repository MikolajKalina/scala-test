object Solution { 
def solution(n: Int): Int ={
 val x = for(i<- 1 to n;if(n%i==0))  yield i
 x.length
}
}
val czum = Solution
println(czum.solution(24))
