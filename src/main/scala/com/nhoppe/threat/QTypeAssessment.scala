package com.nhoppe.threat

import scala.collection.immutable.Map
import com.nhoppe.dns.protocol.QType

object QTypeAssessment {
  def isUnusualClientQuery(qtype:Int): Boolean = {
    QType(qtype) == QType.AXFR || QType(qtype) == QType.ANY
  }

  def isTxtQuery(qtype:Int): Boolean = {
    QType(qtype) == QType.TXT
  }
}
