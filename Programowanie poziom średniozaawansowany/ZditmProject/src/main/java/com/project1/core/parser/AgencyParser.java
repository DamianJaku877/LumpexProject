package com.project1.core.parser;

import com.project1.core.model.Agency;

public class AgencyParser extends BaseFeedParser<Agency> {

    private static final int AGENCY_NAME_COLUMN = 0;
    private static final int AGENCY_URL_COLUMN = 1;
    private static final int AGENCY_TIMEZONE_COLUMN = 2;
    private static final int AGENCY_LANG_COLUMN = 3;
    private static final int AGENCY_PHONE_COLUMN = 4;

    public Agency parseTo(String feedInfo){

        super.parseTo(feedInfo);
        Agency agency = new Agency();

        agency.setAgency_name(splitFeedInfo[AGENCY_NAME_COLUMN]);
        agency.setAgency_url(splitFeedInfo[AGENCY_URL_COLUMN]);
        agency.setAgency_timezone(splitFeedInfo[AGENCY_TIMEZONE_COLUMN]);
        agency.setAgency_lang(splitFeedInfo[AGENCY_LANG_COLUMN]);
        agency.setAgency_phone(splitFeedInfo[AGENCY_PHONE_COLUMN]);

        return agency;
    }
}
