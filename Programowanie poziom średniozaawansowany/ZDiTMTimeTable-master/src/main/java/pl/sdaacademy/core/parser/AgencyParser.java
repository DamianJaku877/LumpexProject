package pl.sdaacademy.core.parser;

import pl.sdaacademy.core.model.Agency;

public class AgencyParser extends BaseFeedParser<Agency> {

    private static final int AGENCY_NAME_COLUMN = 0;
    private static final int AGENCY_URL_COLUMN = 1;
    private static final int AGENCY_TIMEZONE_COLUMN = 2;
    private static final int AGENCY_LANG_COLUMN = 3;
    private static final int AGENCY_PHONE_COLUMN = 4;

    @Override
    public Agency parseTo(String feedInfo) {
        splitData(feedInfo);//split feedInfo to table
        Agency agency = new Agency();
        agency.setAgencyName(splitFeedInfo[AGENCY_NAME_COLUMN]);
        agency.setAgencyUrl(splitFeedInfo[AGENCY_URL_COLUMN]);
        agency.setAgencyTimezone(splitFeedInfo[AGENCY_TIMEZONE_COLUMN]);
        agency.setAgencyLang(splitFeedInfo[AGENCY_LANG_COLUMN]);
        agency.setAgencyPhone(splitFeedInfo[AGENCY_PHONE_COLUMN]);
        return agency;
    }
}
