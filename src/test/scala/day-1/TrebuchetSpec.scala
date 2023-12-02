import org.scalatest._
import flatspec._

class TrebuchetSpec extends AnyFlatSpec {
  "Value returned by Trebuchet class" must "be equal to 142" in {
    val result = Trebuchet.main("src/test/scala/day-1/resources/input")
    assert(result == 142)
  }
}
