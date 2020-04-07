import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date

import models.CardDetail
import xmlrpc.protocol.XmlrpcProtocol

import scala.xml.NodeSeq

/**
 * Created by ngupta on 7/4/2020 AD.
 */
object Main extends App {

  import XmlrpcProtocol._


  val ISO8601Format = DateTimeFormatter.ofPattern("yyyyMMdd'T'HH:mm:ss")

  //  case class CardDetail(terminalID: String, customerReference: String, trackingNumber: String, transactionID: String, transactionDate: Date, checksum: String)

  val cardDetail = CardDetail("0022146547", "TEST_CUSTOMER", "992173800000005", "1234567890", new Date(), "E006DFC154E8ABF8B5CA3B61CF3F4F57CF8C3D29")
  val request: NodeSeq = writeXmlRequest[CardDetail]("CardDetail", cardDetail)
  val requestWithHeader: String = """<?xml version="1.0"?>""" + request.toString

  println(requestWithHeader)
}
