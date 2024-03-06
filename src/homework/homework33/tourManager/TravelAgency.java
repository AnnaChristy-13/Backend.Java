package homework33.tourManager;

public class TravelAgency {
    public static void main(String[] args) {

        TourCollection tourCollection = new TourCollection(15);

        tourCollection.addRequest("Explore your Africa");
        tourCollection.addRequest("Food and wine Enthusiasts.Spain");
        tourCollection.addRequest("See Lovers. Portugal");
        tourCollection.addRequest("Fashion and culture passionates. France");
        tourCollection.addRequest("Luxury Travel. Maldives");

        System.out.println(tourCollection);

        tourCollection.getQueueSize();

        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();
        tourCollection.processRequest();

        tourCollection.getQueueSize();
    }
}
