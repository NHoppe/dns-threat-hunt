import org.scalatest.FunSpec
import com.nhoppe.dns.protocol.Query
import com.nhoppe.threat.QTypeAssessment

class QTypeAssessmentTest extends FunSpec {

  describe("Assessment of QType") {
    it("Query is unusual (AXFR)") {
      val record = new Query("scala-lang.org", 252, 1)
      assert(QTypeAssessment.isUnusualClientQuery(record.getQTypeValue) == true)
    }

    it("Query is unusual (ANY)") {
      val record = new Query("scala-lang.org", 255, 1)
      assert(QTypeAssessment.isUnusualClientQuery(record.getQTypeValue) == true)
    }

    it("Query is TXT") {
      val record = new Query("scala-lang.org", 16, 1)
      assert(QTypeAssessment.isTxtQuery(record.getQTypeValue) == true)
    }
  }
}