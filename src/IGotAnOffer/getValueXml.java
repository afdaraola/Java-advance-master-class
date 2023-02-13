package IGotAnOffer;

public class getValueXml {

    public static void main(String[] args) {

        String  xml  =  " <?xml version='1.0' encoding='UTF-8'?>\n" +
                "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "    <S:Body>\n" +
                "        <CREATECUSTOMER_FSF\n" +
                "S_RES xmlns=\"http://fcubs.ofss.com/service/FCUBSCustomerService\">\n" +
                "            <FCUBS_HEADER>\n" +
                "                <SOURCE>FLEXCUBE</SOURCE>\n" +
                "                <UBSCOMP>FCUBS</UBSCOMP>\n" +
                "                <MSGID>BNsRJ21nO3Wp98</MSGID>\n" +
                "                <CORRELID>BNsRJ21nO3W\n" +
                "p98</CORRELID>\n" +
                "                <USERID>ECOMOBILE</USERID>\n" +
                "                <ENTITY>null</ENTITY>\n" +
                "                <BRANCH>ENG</BRANCH>\n" +
                "                <MODULEID>ST</MODULEID>\n" +
                "                <SERVICE>FCUBSCustomerService</SERVICE>\n" +
                "                <OPERATION>CreateCustomer\n" +
                "                </OPERATIO\n" +
                "N>\n" +
                "                <SOURCE_OPERATION>CreateCustomer</SOURCE_OPERATION>\n" +
                "                <DESTINATION>ECOMOBILE</DESTINATION>\n" +
                "                <FUNCTIONID>STDCIF</FUNCTIONID>\n" +
                "                <ACTION>NEW</ACTION>\n" +
                "                <MSGSTAT>SUCCESS</MSGSTAT>\n" +
                "            </FCUBS_HEAD\n" +
                "ER>\n" +
                "            <FCUBS_BODY>\n" +
                "                <Customer-Full>\n" +
                "                    <CUSTNO>014805244</CUSTNO>\n" +
                "                    <CTYPE>I</CTYPE>\n" +
                "                    <NAME>ADEWALE IKENYE MARIO</NAME>\n" +
                "                    <ADDRLN1>6</ADDRLN1>\n" +
                "                    <ADDRLN3>nigeria</ADDRLN3>\n" +
                "                    <ADDRLN2> lagos LAGOS \n" +
                "                    </ADD\n" +
                "RLN2>\n" +
                "                    <ADDRLN4>NG</ADDRLN4>\n" +
                "                    <COUNTRY>NG</COUNTRY>\n" +
                "                    <SNAME>ADEWALE8332</SNAME>\n" +
                "                    <NLTY>NG</NLTY>\n" +
                "                    <LBRN>ENG</LBRN>\n" +
                "                    <CCATEG>INDIVIDUAL</CCATEG>\n" +
                "                    <FULLNAME>ADEWALE IKENYE MARIO</FULLNAME>\n" +
                "                    <CIFCR\n" +
                "EATIONDT>2022-09-27\n" +
                "                    </CIFCREATIONDT>\n" +
                "                    <ISELCMCUST>Y</ISELCMCUST>\n" +
                "                    <AR_AP_TRACKING>N</AR_AP_TRACKING>\n" +
                "                    <EXPCNTRY>NG</EXPCNTRY>\n" +
                "                    <UIDNAME>REGISTRATION_NUMBER</UIDNAME>\n" +
                "                    <UIDVAL>K2433sfk4</UIDVAL>\n" +
                "                    <FROZEN>N</FROZEN>\n" +
                "                    <DEAD>N</DEAD>\n" +
                "                    <WHRUNKN>N</WHRUNKN>\n" +
                "                    <MEDIA>MAIL</MEDIA>\n" +
                "                    <LOC>NG</LOC>\n" +
                "                    <MAILRSREQD>N</MAILRSREQD>\n" +
                "                    <CLSPARTICIPANT>N</CLSPARTICIPANT>\n" +
                "                    <FXNETTCUST>014805244</FXNETTCUST>\n" +
                "                    <CRMCUST>N</CRMCUST>\n" +
                "                    <ISSUCUST>N</ISSUCUST>\n" +
                "                    <TRSRYCUST>N</TRSRYCUST>\n" +
                "                    <RELPRICING>N</RELPRICING>\n" +
                "                    <MT920>N</MT920>\n" +
                "                    <FLGJOINT>N</FLGJOINT>\n" +
                "                    <CREATEACC>N</CREATEACC>\n" +
                "                    <TRACK_LIMITS>Y</TRACK_LIMITS>\n" +
                "                    <LIABID>014805244</LIABID>\n" +
                "                    <LMCCY>NGN</LMCCY>\n" +
                "                    <FLGUTLTYPRVDR>N</FLGUTLTYPRVDR>\n" +
                "                    <AMLREQD>N</AMLREQD>\n" +
                "                    <CHKDIGITVALREQD>N</CHKDIGITVALREQD>\n" +
                "                    <FTACCASOF>M</FTACCASOF>\n" +
                "                    <CUSTUNADV>N</CUSTUNADV>\n" +
                "                    <CONSTAXCERTRQD>N</CONSTAXCERTRQD>\n" +
                "                    <INDTAXCERTRQD>N</INDTAXCERTRQD>\n" +
                "                    <CLSCCYALLWD>D</CLSCCYALLWD>\n" +
                "                    <UDFLBL1>OLD_CUST_NO</UDFLBL1>\n" +
                "                    <UDFLBL2>BVN_</UDFLBL2>\n" +
                "                    <UDFLBL3>DOB_</UDFLBL3>\n" +
                "                    <UDFLBL4>MOTHERS_MAIDEN_NAME</UDFLBL4>\n" +
                "                    <UDFLBL5>PHONE</UDFLBL5>\n" +
                "                    <UDF2>23478013661</UDF2>\n" +
                "                    <UDF3>1989-08-16</UDF3>\n" +
                "                    <INVESTCUST>N</INVESTCUST>\n" +
                "                    <ALLOWVRTLACCNTS>N</ALLOWVRTLACCNTS>\n" +
                "                    <SSTAFF>N</SSTAFF>\n" +
                "                    <SPECIAL_CUST>N</SPECIAL_CUST>\n" +
                "                    <MAKER>ECOMOBILE</MAKER>\n" +
                "                    <MAKERSTAMP>2022-09-27 17:16:14</MAKERSTAMP>\n" +
                "                    <CHECKER>ECOMOBILE</CHECKER>\n" +
                "                    <CHECKERSTAMP>2022-09-27 17:16:18</CHECKERSTAMP>\n" +
                "                    <MODNO>1</MODNO>\n" +
                "                    <TXNSTAT>O</TXNSTAT>\n" +
                "                    <AUTHSTAT>A</AUTHSTAT>\n" +
                "                    <Custpersonal>\n" +
                "                        <FSTNAME>IKENYE</FSTNAME>\n" +
                "                        <MIDNAME>MARIO</MIDNAME>\n" +
                "                        <LSTNAME>ADEWALE</LSTNAME>\n" +
                "                        <DOB>1989-08-16</DOB>\n" +
                "                        <GENDR>M</GENDR>\n" +
                "                        <TELEPHNO>08332929681</TELEPHNO>\n" +
                "                        <EMAILID>demo8924@gmail.com</EMAILID>\n" +
                "                        <RESSTATUS>R</RESSTATUS>\n" +
                "                        <MOBNUM>08332929681</MOBNUM>\n" +
                "                        <LANG>ENG</LANG>\n" +
                "                        <SBMTAGEPROOF>N</SBMTAGEPROOF>\n" +
                "                        <KYCSTAT>N</KYCSTAT>\n" +
                "                        <Custdomestic>\n" +
                "                            <CUSTNO>014805244</CUSTNO>\n" +
                "                        </Custdomestic>\n" +
                "                        <Custprof>\n" +
                "                            <CUSTNO>014805244</CUSTNO>\n" +
                "                        </Custprof>\n" +
                "                    </Custpersonal>\n" +
                "                    <Custcorp/>\n" +
                "                    <Cust-Liab>\n" +
                "                        <LIABILITY_NUMBER>014805244</LIABILITY_NUMBER>\n" +
                "                        <LIABILTY_NAME>ADEWALE IKENYE MARIO</LIABILTY_NAME>\n" +
                "                        <LIAB_BRANCH>ENG</LIAB_BRANCH>\n" +
                "                        <LIAB_CCY>NGN</LIAB_CCY>\n" +
                "                        <OVERLIMIT>0</OVERLIMIT>\n" +
                "                        <UNADV>N</UNADV>\n" +
                "                        <NETTING_REQUIRED>N</NETTING_REQUIRED>\n" +
                "                        <OVERALL_SCORE>0</OVERALL_SCORE>\n" +
                "                        <UTIL_AMOUNT>0</UTIL_AMOUNT>\n" +
                "                    </Cust-Liab>\n" +
                "                    <Custmis>\n" +
                "                        <CUST>014805244</CUST>\n" +
                "                        <CUSTNO>014805244</CUSTNO>\n" +
                "                        <BRNCD>ENG</BRNCD>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>CR_OFCER</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>CUST_CATE</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>IND_SEGMT</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>ETIBISEG2</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>SUBSICCOD</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>SECT_ACTV</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>AFFILIATE</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Customermis>\n" +
                "                            <MISCLS>MONT_ZONE</MISCLS>\n" +
                "                        </Customermis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>ACC_OFCR</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>ACCT_INIT</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>IND_SEG</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>ETIBISEG</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>SUBSICOD2</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>AFFILIAT</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>REGION</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>AREA</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>VAL_CHAIN</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                        <Compositemis>\n" +
                "                            <MISCLS>ELLEVATE</MISCLS>\n" +
                "                        </Compositemis>\n" +
                "                    </Custmis>\n" +
                "                    <Jointcustomer>\n" +
                "                        <CUSTNO>014805244</CUSTNO>\n" +
                "                    </Jointcustomer>\n" +
                "                    <Cust-Acc-Det>\n" +
                "                        <CUSTNO>014805244</CUSTNO>\n" +
                "                    </Cust-Acc-Det>\n" +
                "                    <Custaccdet>\n" +
                "                        <CUSTNO>014805244</CUSTNO>\n" +
                "                        <Relationship-Linkage>\n" +
                "                            <CUSTOMER>014805244</CUSTOMER>\n" +
                "                            <RELATIONSHIP>PRIMARY</RELATIONSHIP>\n" +
                "                            <INHERIT>N</INHERIT>\n" +
                "                            <DESCP>ADEWALE IKENYE MARIO</DESCP>\n" +
                "                        </Relationship-Linkage>\n" +
                "                        <Reverse-Relationship>\n" +
                "                            <INHERIT>N</INHERIT>\n" +
                "                            <REF_NO>014805244</REF_NO>\n" +
                "                            <RELATIONSHIP>PRIMARY</RELATIONSHIP>\n" +
                "                            <BRANCH>ENG</BRANCH>\n" +
                "                            <CUSTOMER>014805244</CUSTOMER>\n" +
                "                            <CATEGORY>C</CATEGORY>\n" +
                "                        </Reverse-Relationship>\n" +
                "                    </Custaccdet>\n" +
                "                    <Custacdetail>\n" +
                "                        <CUSTNO>014805244</CUSTNO>\n" +
                "                    </Custacdetail>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>CARD_TYPE</FLDNAM>\n" +
                "                        <FLDVAL>01</FLDVAL>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>DIASPORA_NON_RESIDENT</FLDNAM>\n" +
                "                        <FLDVAL>2</FLDVAL>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>DIASPORA_RESIDENT</FLDNAM>\n" +
                "                        <FLDVAL>2</FLDVAL>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>TAX_ID_NUMBER</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>PEP_</FLDNAM>\n" +
                "                        <FLDVAL>NAP</FLDVAL>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>CUSTOMER_MOBILE_PHONE_NUMBER</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>AML_CFT_RISK_RANKING</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>NATURE_OF_RELATIONSHIP</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>RELATED_CUSTOMER</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>NOT_APPLICABLE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>NIN_</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>OMNI_REF_NO</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>TAX_ID_NUMBER_II</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>COUNTRY_TAX_ORIGIN_II</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>TAX_ID_NUMBER_III</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>COUNTRY_TAX_ORIGIN_III</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>VISA_RESIDENT_PERMIT_NUMBER</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>VISA_RESIDENT_PERMIT_ISSUE_DATE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>VISA_RESIDENT_PERMIT_EXPIRY_DATE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>QUOTA_OWNER</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>PERMIT_CONDITION</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>VALUE_CHAIN</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SCUML_CERT_NO</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>COUNTRY_OF_ISSUANCE_OF_TAX_ID</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>REASON_FOR_PEP_STATUS</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ID_TYPE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ID_NUMBER</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ID_PLACE_OF_ISSUE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ID_ISSUE_DATE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ID_EXPIRY_DATE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ENTITY_WHERE_SHAREHOLDING_IS_HELD</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_PERCENTAGE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_TYPE</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>OCCUPATION</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SPOUSE_NAME</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SPOUSE_ADDRESS_1</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SPOUSE_ADDRESS_2</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SPOUSE_ADDRESS_3</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SPOUSE_COUNTRY</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ENTITY_WHERE_SHAREHOLDING_IS_HELD_1</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_TYPE_1</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_PERCENTAGE_1</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ENTITY_WHERE_SHAREHOLDING_IS_HELD_2</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_TYPE_2</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_PERCENTAGE_2</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ENTITY_WHERE_SHAREHOLDING_IS_HELD_3</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_TYPE_3</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_PERCENTAGE_3</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>ENTITY_WHERE_SHAREHOLDING_IS_HELD_4</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_TYPE_4</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <UDFDETAILS>\n" +
                "                        <FLDNAM>SHAREHOLDING_PERCENTAGE_4</FLDNAM>\n" +
                "                    </UDFDETAILS>\n" +
                "                    <Master>\n" +
                "                        <KEY_ID>014805244</KEY_ID>\n" +
                "                        <FUNCTION_ID>STDCIF</FUNCTION_ID>\n" +
                "                    </Master>\n" +
                "                </Customer-Full>\n" +
                "                <FCUBS_WARNING_RESP>\n" +
                "                    <WARNING>\n" +
                "                        <WCODE>FT-SSN000</WCODE>\n" +
                "                        <WDESC>SSN Value should be entered</WDESC>\n" +
                "                    </WARNING>\n" +
                "                    <WARNING>\n" +
                "                        <WCODE>ST-CIF-130</WCODE>\n" +
                "                        <WDESC>Field Mother First Name cannot be blank</WDESC>\n" +
                "                    </WARNING>\n" +
                "                    <WARNING>\n" +
                "                        <WCODE>ST-CIF-131</WCODE>\n" +
                "                        <WDESC>Field Mother Last Name cannot be blank</WDESC>\n" +
                "                    </WARNING>\n" +
                "                    <WARNING>\n" +
                "                        <WCODE>ST-CIF-134</WCODE>\n" +
                "                        <WDESC>Field Birth Place cannot be blank</WDESC>\n" +
                "                    </WARNING>\n" +
                "                    <WARNING>\n" +
                "                        <WCODE>ST-SAVE-002</WCODE>\n" +
                "                        <WDESC>Record Successfully Saved and Authorized</WDESC>\n" +
                "                    </WARNING>\n" +
                "                </FCUBS_WARNING_RESP>\n" +
                "            </FCUBS_BODY>\n" +
                "        </CREATECUSTOMER_FSFS_RES>\n" +
                "    </S:Body>\n" +
                "</S:Envelope>";
        String tag  = "ECODE";
      String  dupError=   getFlexValueDup(xml,tag);
        if (dupError.equalsIgnoreCase("ST-CIF999") && !"WCODE NOT GENERATED".equals(dupError)){
            System.out.println("i'm here ...");
        }  else  {
            System.out.println("i'm here 2");
        }
        //  getFlexValue(xml,tag);

    }

    public static String getFlexValueDup(String xmlString, String tag) {
        String outpt =  null;
        if (null == xmlString || xmlString.isEmpty()) {
            outpt=  "NOT FOUND";
            System.out.println(outpt);
        }
        String startTag = "<" + tag + ">";
        int indxStart = xmlString.indexOf(startTag);
        int indxEnd = xmlString.indexOf("</" + tag + ">");
        System.out.println("+ indxStart  " + indxStart + "- indxEnd " + indxEnd);
        if (indxStart != -1 && indxEnd != -1 && indxEnd > indxStart) {
             outpt=  xmlString.substring(indxStart + startTag.length(), indxEnd).trim();
             int len = outpt.length();
            System.out.println("customer " +outpt.substring(len-9,len));
            System.out.println(outpt);
        } else {
            outpt="WCODE NOT GENERATED";
           // System.out.println("WCODE NOT GENERATED");

        }
        return outpt;
    }



    public static void getFlexValue(String xmlString, String tag) {
        if (null == xmlString || xmlString.isEmpty()) {
            System.out.println();
        }
        String startTag = "<" + tag + ">";
        int indxStart = xmlString.indexOf(startTag);
        int indxEnd = xmlString.indexOf("</" + tag + ">");

        if (indxStart != -1 && indxEnd != -1 && indxEnd > indxStart) {
            System.out.println(xmlString.substring(indxStart + startTag.length(), indxEnd).trim());

        } else {
            System.out.println();
        }

    }

}
