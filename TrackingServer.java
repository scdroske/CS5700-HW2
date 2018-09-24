public class TrackingServer {

    /**
     * creating instance of communicator class to change local port to 12000
     */


    public static void main string args[] {




    }


    
    Communicator communicator = new Communicator();


    communicator.datagramSocket.getLocalPort() : 12000;

    /**
     * instance of dummymessage processor
     * use communicator to set processor to dummymessage processor
     */
    DummyMessageProcessor dummyMessageProcessor = new DummyMessageProcessor();

    communicator.setProcessor(IMessageProcessor processor) { _processor = dummyMessageProcessor; };



    communicator.start();



}
