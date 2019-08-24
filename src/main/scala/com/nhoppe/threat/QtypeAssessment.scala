package com.nhoppe.threat

import scala.collection.immutable.Map
import com.nhoppe.dns.Qtype

object QtypeAssessment {
  def isUnusualClientQuery(qtype:Int): Boolean = {
    Qtype(qtype) == Qtype.AXFR || Qtype(qtype) == Qtype.ANY
  }

  def isTxtQuery(qtype:Int): Boolean = {
    Qtype(qtype) == Qtype.TXT
  }
}
