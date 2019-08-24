package com.nhoppe.dns

import com.nhoppe.dns.protocol._

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt

class Record(query:Query, answers:List[Answer] = List[Answer]()) {

  def getQuery(): Query = {
    query
  }

  def getAnswers: List[Answer] = {
    answers
  }
}
