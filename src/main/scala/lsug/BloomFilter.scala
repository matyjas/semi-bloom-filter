package lsug

class BloomFilter { 
  
  import scala.collection.mutable.HashSet

  val bloomFilter = new HashSet[Int]

  def addWord(word:String){ 

    bloomFilter += hashWord(word)
  }

  def checkWord(word:String):Boolean = { 

    val hash = hashWord(word)
    bloomFilter.contains(hash)
  }

  def hashWord(word:String):Int = { 

    word.toLowerCase.hashCode
  }
}
