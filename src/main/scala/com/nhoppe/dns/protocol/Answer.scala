package com.nhoppe.dns.protocol

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt

class Answer(ttl:Int, content:String) {
  
  def getTTL(): Int = {
    ttl
  }

  def getContent(): String = {
    content
  }
}
