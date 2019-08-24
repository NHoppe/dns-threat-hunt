import org.scalatest.FunSpec
import com.nhoppe.dns._
import com.nhoppe.threat.FqdnAssessment

class FqdnAssessmentTest extends FunSpec {

  describe("Assessment of FQDN") {
    val record = new RecordDetails(
                          "W.0228452040.I0.aHR0cHM6Ly9zc2wuZ3N0YXRpYy5jb20v.19.x.wpad.software",
                          5,
                          2
    )

    it("should return 7 subdomains") {
      assert(FqdnAssessment.numberOfsubdomains(record.getFQDN) == 7)
    }

    it("should return 67 characters") {
      assert(FqdnAssessment.domainLength(record.getFQDN) == 67)
    }

    it("should return 13 uppercase characters") {
      assert(FqdnAssessment.numberOfUppercaseLetters(record.getFQDN) == 13)
    }

    it("should return 25 lowercase characters") {
      assert(FqdnAssessment.numberOfLowercaseLetters(record.getFQDN) == 25)
    }

    it("should not have non-alphanumeric characters") {
      assert(FqdnAssessment.hasNonAlphanumeric(record.getFQDN) == false)
    }

    it("should not have punycode") {
      assert(FqdnAssessment.hasPunycode(record.getFQDN) == false)
    }

    // "Special" cases
    it("should have non-alphanumeric characters") {
      assert(FqdnAssessment.hasNonAlphanumeric("cmVkdGVhbS5wbA==.suspicio.us") == true)
    }

    it("should have punycode") {
      val punyRecord = new RecordDetails("redteaм.pl", 1, 1)
      assert(FqdnAssessment.hasPunycode(punyRecord.getFQDN) == true)
    }
  }
}