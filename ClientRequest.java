import java.time.LocalDateTime;

public class ClientRequest implements Comparable<ClientRequest> {
    private String userName;
    private int priority;
    private String requestData;
    private LocalDateTime timestamp;

    public ClientRequest(String nameInput, int priorityInput, String dataInput) {
        userName = nameInput;
        priority = priorityInput;
        requestData = dataInput;
        timestamp = LocalDateTime.now();
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(ClientRequest other) {
        return Integer.compare(other.priority, priority);
    }

    @Override
    public String toString() {
        return timestamp + " | Приоритет: " + priority + " | " + userName + ": " + requestData;
    }
}
