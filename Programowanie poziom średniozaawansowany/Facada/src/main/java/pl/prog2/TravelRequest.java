package pl.prog2;

public class TravelRequest {
    private TicketOrder ticket;
    private HotelOrder hotel;
    private FoodOrder food;

    public TravelRequest() {
        this.ticket = new TicketOrder();
        this.hotel = new HotelOrder();
        this.food = new FoodOrder();
    }

    public void prepareTravel(){
        ticket.getTicket();
        hotel.getHotel();
        food.getFood();
    }
}
