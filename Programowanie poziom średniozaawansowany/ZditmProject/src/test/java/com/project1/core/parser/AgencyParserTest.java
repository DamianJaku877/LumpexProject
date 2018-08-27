package com.project1.core.parser;

import com.project1.core.model.Agency;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgencyParserTest {

    private static final String TEST_LINE = "ZDiTM Szczecin,http://www.zditm.szczecin.pl,Europe/Warsaw,pl,91 480 04 03";
    private FeedParser<Agency> agencyFeedParser;
    private Agency agency;

    @Before
    public void setUp() throws Exception{
        agencyFeedParser = new AgencyParser();
        agency = new Agency("ZDiTM Szczecin", "http://www.zditm.szczecin.pl","Europe/Warsaw","pl","91 480 04 03");
    }
    @Test
    public void testParseAgencyName() {
        //given
        Agency testAgencyName;
        //when
        testAgencyName = agencyFeedParser.parseTo(TEST_LINE);
        //then
        assertEquals(testAgencyName.getAgency_name(), agency.getAgency_name());
    }
    @Test
    public void testParseAgencyUrl() {
        Agency testAgencyUrl;
        testAgencyUrl = agencyFeedParser.parseTo(TEST_LINE);
        assertEquals(testAgencyUrl.getAgency_url(), agency.getAgency_url());
    }
    @Test
    public void testParseAgencyTimeZone(){

        Agency testAgencyTimeZone;
        testAgencyTimeZone = agencyFeedParser.parseTo(TEST_LINE);
        assertEquals(testAgencyTimeZone.getAgency_timezone(), agency.getAgency_timezone());
    }
    @Test
    public void testParseAgencyLang(){
            Agency testAgencyLang;
            testAgencyLang = agencyFeedParser.parseTo(TEST_LINE);
            assertEquals(testAgencyLang.getAgency_lang(), agency.getAgency_lang());
    }
    @Test
    public void testParseAgencyPhone(){
        Agency testAgencyPhone;
        testAgencyPhone = agencyFeedParser.parseTo(TEST_LINE);
        assertEquals(testAgencyPhone.getAgency_phone(), agency.getAgency_phone());

    }

}
