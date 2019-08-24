import org.scalatest.FunSpec
import com.nhoppe.dns.protocol.Answer

class AnswerTest extends FunSpec {

  describe("Answer") {
    val answer = new Answer(60, "smtp6.google.com")
    it("should return ttl 60") {
      assert(answer.getTTL == 60)
    }

    it("should return content") {
      assert(answer.getContent == "smtp6.google.com")
    }
  }
}
