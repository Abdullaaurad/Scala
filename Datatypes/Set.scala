object SetOperations {
  def main(args: Array[String]): Unit = {
    val k: Set[Int] = Set(2,4,6,8,5,2)                  //can't have duplicate values in set
    for (num <- k){
        println(num)
    }
    val l: Set[String] =  Set("Abdulla","Fadhiya","Yunus")
    for (num <- l){
        println(num)
    }
    val set1: Set[Int] = Set(1, 2, 3, 4, 5)
    val set2: Set[Int] = Set(4, 5, 6, 7, 8)

    // Union of sets
    val unionSet: Set[Int] = set1.union(set2)
    println("Union Set: " + unionSet)

    // Intersection of sets
    val intersectionSet: Set[Int] = set1.intersect(set2)
    println("Intersection Set: " + intersectionSet)

    // Difference of sets
    val diffSet: Set[Int] = set1.diff(set2)
    println("Difference Set (set1 - set2): " + diffSet)

    // Subset check
    val subsetCheck1: Boolean = set1.subsetOf(set2)
    println("Is set1 a subset of set2? " + subsetCheck1)

    val subsetCheck2: Boolean = Set(4, 5).subsetOf(set1)
    println("Is {4, 5} a subset of set1? " + subsetCheck2)
  }
}
