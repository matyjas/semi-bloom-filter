package lsug

class Dict(val name:String) { 

  import scala.io.Source

  val bf = new BloomFilter

  val lines = 
    Source.fromFile("/usr/share/dict/words").getLines

  lines foreach { word => bf.addWord(word)}
}
