import org.scalatest.FunSpec
import com.nhoppe.dns.protocol.Query
import com.nhoppe.threat.FqdnAssessment

class FqdnAssessmentTest extends FunSpec {

  describe("Assessment of FQDN") {
    val query = new Query(
                          "W.0228452040.I0.aHR0cHM6Ly9zc2wuZ3N0YXRpYy5jb20v.19.x.wpad.software",
                          5,
                          2
    )

    it("should return 7 subdomains") {
      assert(FqdnAssessment.numberOfsubdomains(query.getFQDN) == 7)
    }

    it("should return 67 characters") {
      assert(FqdnAssessment.domainLength(query.getFQDN) == 67)
    }

    it("should return 4.895605841389559 entropy") {
      assert(FqdnAssessment.entropy(query.getFQDN) == 4.895605841389559)
    }

    it("should return 13 uppercase characters") {
      assert(FqdnAssessment.numberOfUppercaseLetters(query.getFQDN) == 13)
    }

    it("should return 25 lowercase characters") {
      assert(FqdnAssessment.numberOfLowercaseLetters(query.getFQDN) == 25)
    }

    it("should not have non-alphanumeric characters") {
      assert(FqdnAssessment.hasNonAlphanumeric(query.getFQDN) == false)
    }

    it("should not have punycode") {
      assert(FqdnAssessment.hasPunycode(query.getFQDN) == false)
    }

    // "Special" cases
    it("should have non-alphanumeric characters") {
      assert(FqdnAssessment.hasNonAlphanumeric("cmVkdGVhbS5wbA==.suspicio.us") == true)
    }

    it("should have punycode") {
      val punyQuery = new Query("redteaм.pl", 1, 1)
      assert(FqdnAssessment.hasPunycode(punyQuery.getFQDN) == true)
    }
  }
}