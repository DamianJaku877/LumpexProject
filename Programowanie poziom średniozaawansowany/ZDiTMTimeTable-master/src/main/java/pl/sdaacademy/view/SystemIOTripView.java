package pl.sdaacademy.view;

import pl.sdaacademy.controller.TripController;
import pl.sdaacademy.core.model.Trip;

import java.util.List;
import java.util.Scanner;

public class SystemIOTripView implements TripView {

    private final Scanner scanner;
    private TripController tripController;


    public SystemIOTripView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void loadPage() {
        int choice;
        while (true) {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    loadTrips();
                    break;
                case 2:
                    showAllTrip();
                    break;
                case 3:
                    findTrip();
                    break;
                default:
            }
        }
    }

    private void displayMenu() {
        System.out.println("Trip menu:");
        System.out.println("1. Load trips file: ");
        System.out.println("2. Show all trips: ");
        System.out.println("3. Find trips");
    }

    private void showAllTrip() {
        List<Trip> tripList = tripController.getAllTrips();
        displayTrips(tripList);
    }

    private void findTrip() {
        String routeId = scanner.next();
        List<Trip> foundTripList = tripController.findTripByRouteId(routeId);
        displayTrips(foundTripList);
    }

    private void displayTrips(List<Trip> trips) {
        for (Trip trip : trips) {
            System.out.println(trip);
        }
    }

    private void loadTrips() {
        tripController.load();
    }

    @Override
    public void setController(TripController tripController) {
        this.tripController = tripController;
    }
}
