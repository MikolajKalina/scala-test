object Solution { 
def solution(a: Array[Int]): Int = {

 val czu = for(i <- 0 to a.length-1;j<- 0+i to a.length-1; if(a(i)==a.head); if(a(j)!=a(i)))
   yield (i,j) 
 println("Pary samochodów " + czu) 
czu.size
}
}

val czum = Solution
println("Ilość pominiętych : "+czum.solution(Array(0,1,0,1,1)))
