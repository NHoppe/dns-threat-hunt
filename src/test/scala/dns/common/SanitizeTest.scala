import org.scalatest.FunSpec
import com.nhoppe.common.Sanitize

class SanitizeTest extends FunSpec {

  describe("Sanitize") {
    it("should sanitize input FQDN") {
      val sanitizedFqdn = Sanitize.fqdn("https://some.domain.out")
      assert(sanitizedFqdn == "some.domain.out")
    }

    it("should throw IllegalArgumentException with invalid FQDN") {
      assertThrows[IllegalArgumentException] {
        Sanitize.fqdn(".abc")
      }
    }
  }
}