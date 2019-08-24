import org.scalatest.FunSpec
import com.nhoppe.dns.protocol.Query

class QueryTest extends FunSpec {

  describe("Query") {
    val query = new Query("redтeam.pl", 5, 2)

    it("should return punycode") {
      assert(query.getFQDN == "xn--redeam-rrf.pl")
    }

    it("should return QTYPE value 5") {
      assert(query.getQTypeValue == 5)
    }

    it("should return QTYPE name CNAME") {
      assert(query.getQTypeName == "CNAME")
    }

    it("should return QCLASS value 2") {
      assert(query.getQClassValue == 2)
    }

    it("should return QCLASS name CS") {
      assert(query.getQClassName == "CS")
    }

    it("should sanitize input FQDN") {
      val sanitized = new Query("https://some.domain.out", 1, 1)
      assert(sanitized.getFQDN == "some.domain.out")
    }

    it("should throw IllegalArgumentException with invalid FQDN") {
      assertThrows[IllegalArgumentException] {
        new Query(".abc", 1, 1)
      }
    }
  }
}
