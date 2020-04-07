import models.CardDetail
import xmlrpc.protocol.XmlrpcProtocol

import scala.xml.NodeSeq

/**
 * Created by ngupta on 7/4/2020 AD.
 */
object Main extends App {

  import XmlrpcProtocol._

  //  case class CardDetail(terminalID: String, customerReference: String, trackingNumber: String, transactionID: String, checksum: String)

  val cardDetail = CardDetail("0022146547", "TEST_CUSTOMER", "992173800000005", "1234567890", "")
  val request: NodeSeq = writeXmlRequest[CardDetail]("cardDetail", cardDetail)
  val requestWithHeader: String = """<?xml version="1.0"?>""" + request.toString

  print(requestWithHeader)
}
