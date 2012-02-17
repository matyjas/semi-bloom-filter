package lsug

class Urban { 

  import dispatch._
  import dispatch.jsoup.JSoupHttp._
  import org.apache.http.{ HttpRequest,HttpResponse}
  import org.apache.http.protocol.HttpContext
  import org.apache.http.HttpStatus._


  val urbanDict = :/("urbandictionary.com")/ "random.php" 

  val title = Http(urbanDict </> { doc => doc.title})

  val words = title.split(" ")

  val lastWord = words(words.length-1)

  println(lastWord)
}

