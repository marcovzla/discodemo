package discodemo

import edu.arizona.sista.processors.fastnlp.FastNLPProcessor

object ScalaMain extends App {
  val text = "John is smiling because he is happy. He is generally an optimistic fellow."
  val proc = new FastNLPProcessor(withDiscourse = true)
  val doc = proc.annotate(text)
  println(doc.discourseTree.get)
}
