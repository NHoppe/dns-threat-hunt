package com.nhoppe.threat

import scala.collection.immutable.Map
import com.nhoppe.dns.Qtype

object QtypeAssessment {
  def isUnusualClientQuery(qtype:Int): Boolean = {
    qtype == Qtype.AXFR || qtype == Qtype.ANY
  }

  def isTxtQuery(qtype:Int): Boolean = {
    qtype == Qtype.TXT
  }
}
