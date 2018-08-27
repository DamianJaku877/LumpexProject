package pl.sdaacademy.core.parser;

import pl.sdaacademy.core.model.Trip;

public class TripParser extends BaseFeedParser<Trip> {

    private static final int ROUTE_ID_COLUMN = 0;
    private static final int SERVICE_ID_COLUMN = 1;
    private static final int TRIP_ID_COLUMN = 2;
    private static final int TRIP_HEADSIGN_COLUMN = 3;
    private static final int DIRECTION_ID_COLUMN = 4;
    private static final int BLOCK_ID_COLUMN = 5;
    private static final int SHAPE_ID_COLUMN = 6;
    private static final int WHEELCHAIR_ACCESSIBLE_COLUMN = 7;
    private static final int LOW_FLOOR_COLUMN = 8;

    @Override
    public Trip parseTo(String line) {
        splitData(line);
        Trip trip = new Trip();
        trip.setRouteId(splitFeedInfo[ROUTE_ID_COLUMN]);
        trip.setServiceId(splitFeedInfo[SERVICE_ID_COLUMN]);
        trip.setId(splitFeedInfo[TRIP_ID_COLUMN]);
        trip.setTripHeadsign(splitFeedInfo[TRIP_HEADSIGN_COLUMN]);
        trip.setDirectionId(splitFeedInfo[DIRECTION_ID_COLUMN]);
        trip.setBlockId(splitFeedInfo[BLOCK_ID_COLUMN]);
        trip.setShapeId(splitFeedInfo[SHAPE_ID_COLUMN]);
        trip.setWheelchairAccessible(Integer.valueOf(splitFeedInfo[WHEELCHAIR_ACCESSIBLE_COLUMN]) == 1);
        trip.setLowFloor(Integer.valueOf(splitFeedInfo[LOW_FLOOR_COLUMN]) == 0);
        return trip;
    }
}
