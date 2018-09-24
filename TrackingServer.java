public class TrackingServer {

    /**
     * creating instance of communicator class to change local port to 12000
     */
    Communicator communicator = new Communicator();


    communicator.datagramSocket.getLocalPort() : 12000;

    /**
     * use the setProcessor method on the communicator to tell it to use the dummy processor
     */
    DummyMessageProcessor dummyMessageProcessor = new DummyMessageProcessor();

    dummyMessageProcessor.setProcessor(): "Communicator";

    

    communicator.start();



}
