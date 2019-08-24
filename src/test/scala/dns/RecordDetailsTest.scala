import org.scalatest.FunSpec
import com.nhoppe.dns._

class RecordDetailsTest extends FunSpec {

  describe("RecordDetails") {
    val record = new RecordDetails("redтeam.pl", 5, 2)

    it("should return punycode") {
      assert(record.getFQDN == "xn--redeam-rrf.pl")
    }

    it("should return QTYPE value 5") {
      assert(record.getQTypeValue == 5)
    }

    it("should return QTYPE name CNAME") {
      assert(record.getQTypeName == "CNAME")
    }

    it("should return QCLASS value 2") {
      assert(record.getQClassValue == 2)
    }

    it("should return QCLASS name CS") {
      assert(record.getQClassName == "CS")
    }

    it("should return ttl -1") {
      assert(record.getTTL == -1)
    }

    it("should sanitize input FQDN") {
      val sanitize = new RecordDetails("https://some.domain.out", 1, 1)
      assert(sanitize.getFQDN == "some.domain.out")
    }

    it("should throw IllegalArgumentException with invalid FQDN") {
      assertThrows[IllegalArgumentException] {
        new RecordDetails(".abc", 1, 1)
      }
    }
  }
}
