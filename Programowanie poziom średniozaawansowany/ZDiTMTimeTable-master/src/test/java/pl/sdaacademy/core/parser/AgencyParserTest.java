package pl.sdaacademy.core.parser;

import org.junit.Before;
import org.junit.Test;
import pl.sdaacademy.core.model.Agency;

import static org.junit.Assert.assertEquals;

public class AgencyParserTest {

    private static final String TEST_LINE = "ZDiTM Szczecin,http://www.zditm.szczecin.pl,Europe/Warsaw,pl,91 480 04 03";
    private FeedParser<Agency> agencyParser;
    private Agency agency;

    @Before
    public void setUp() throws Exception {
        agencyParser = new AgencyParser();
        agency = new Agency("ZDiTM Szczecin", "http://www.zditm.szczecin.pl", "Europe/Warsaw", "pl", "91 480 04 03");
    }

    @Test
    public void testParseAgency() {
        //given
        Agency testAgency;

        //when
        testAgency = agencyParser.parseTo(TEST_LINE);

        //then
        assertEquals(testAgency.getAgencyName(), agency.getAgencyName());
    }

}