package com.nhoppe.dns

// RFC1035
// https://www.ietf.org/rfc/rfc1035.txt
object Qtype extends Enumeration {
  type Qtype = Value

  val A = 1
  val NS = 2
  val MD = 3
  val MF = 4
  val CNAME = 5
  val SOA = 6
  val MB = 7
  val MG = 8
  val MR = 9
  val NULL = 10
  val WKS = 11
  val PTR = 12
  val HINFO = 13
  val MINFO = 14
  val MX = 15
  val TXT = 16
  val RP = 17
  val AFSDB = 18
  val X25 = 19
  val ISDN = 20
  val RT = 21
  val NSAP = 22
  val NSAP_PTR = 23
  val SIG = 24
  val KEY = 25
  val PX = 26
  val GPOS = 27
  val AAAA = 28
  val LOC = 29
  val NXT = 30
  val EID = 31
  val NB = 32
  val SRV = 33
  val ATMA = 34
  val NAPTR = 35
  val KX = 36
  val CERT = 37
  val A6 = 38
  val DNAME = 39
  val SINK = 40
  val OPT = 41
  val APL = 42
  val DS = 43
  val SSHFP = 44
  val IPSECKEY = 45
  val RRSIG = 46
  val NSEC = 47
  val DNSKEY = 48
  val DHCID = 49
  val NSEC3 = 50
  val NSEC3PARAM = 51
  val TLSA = 52
  val SMIMEA = 53
  val HIP = 55
  val NINFO = 56
  val RKEY = 57
  val CDS = 59
  val CDNSKEY = 60
  val OPENPGPKEY = 61
  val SPF = 99
  val UINFO = 100
  val UID = 101
  val GID = 102
  val UNSPEC = 103
  val TKEY = 249
  val TSIG = 250
  val IXFR = 251
  val AXFR = 252
  val MAILB = 253
  val MAILA = 254
  val ANY = 255
  val URI = 256
  val TA = 32768
  val DLV = 32769
}
