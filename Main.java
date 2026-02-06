public class Main {
    public static void main(String[] args) {
        Server myServer = new Server();

        myServer.addRequest("User01", 1, "INFORMATION01");
        myServer.addRequest("Admin01", 10, "INFORMATION02");
        myServer.addRequest("Admin02", 5, "INFORMATION03");
        myServer.addRequest("User02", 1, "INFORMATION04");

        myServer.processQueue();

        myServer.printStatistics();
    }
}