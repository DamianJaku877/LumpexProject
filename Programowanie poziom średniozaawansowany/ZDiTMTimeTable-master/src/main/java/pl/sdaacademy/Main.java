package pl.sdaacademy;

import pl.sdaacademy.controller.TripController;
import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.parser.FeedParser;
import pl.sdaacademy.core.reader.FeedReader;
import pl.sdaacademy.core.repository.FeedRepository;
import pl.sdaacademy.core.service.TripAPI;
import pl.sdaacademy.module.FeedReaderModule;
import pl.sdaacademy.module.ParserModule;
import pl.sdaacademy.module.RepositoryModule;
import pl.sdaacademy.module.ServiceModule;
import pl.sdaacademy.view.SystemIOTripView;
import pl.sdaacademy.view.TripView;

public class Main{

public static void main(String[]args){

//        FeedParser<Agency> parser = ParserModule.provideAgencyParser();
//        FeedRepository<Agency> repository = RepositoryModule.provideAgencyRepository();
//        FeedReader<Agency> feedReader = FeedReaderModule.provideAgencyFileReader(parser, repository);
//        feedReader.read();
//        System.out.println(repository.getAll());

        //MVC
        FeedParser<Trip> tripParser= ParserModule.provideTripParser();
        FeedRepository<Trip> tripRepository= RepositoryModule.provideTripRepository();
        FeedReader<Trip> tripFeedReader= FeedReaderModule.provideTripFileReader(tripParser,tripRepository);
        TripAPI tripService= ServiceModule.provideTripService();
        TripView tripView=new SystemIOTripView();
        TripController tripController=new TripController(tripService,tripView);
        tripView.setController(tripController);
        tripView.loadPage();
        //System.out.println(repository.getAll());
        }
        }
