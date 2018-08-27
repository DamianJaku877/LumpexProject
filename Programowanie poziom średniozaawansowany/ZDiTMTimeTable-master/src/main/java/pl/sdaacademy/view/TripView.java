package pl.sdaacademy.view;

import pl.sdaacademy.controller.TripController;

public interface TripView {
    void loadPage();

    void setController(TripController tripController);
}
