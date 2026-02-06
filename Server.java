import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Server {
    private Queue<ClientRequest> requestQueue;
    private List<ClientRequest> requestHistory;

    public Server() {
        requestQueue = new PriorityQueue<>();
        requestHistory = new ArrayList<>();
    }

    public void addRequest(String user, int prio, String data)
    {
        ClientRequest newRequest = new ClientRequest(user, prio, data);
        requestQueue.add(newRequest);
        System.out.println("Поступил запрос: " + user + " (Приоритет: " + prio + ")");
    }

    public void processQueue()
    {
        while (!requestQueue.isEmpty())
        {
            ClientRequest current = requestQueue.poll();

            System.out.println("Выполняется: " + current);
            requestHistory.add(current);
        }
    }

    public void printStatistics()
    {
        System.out.println("Статистика");
        if (requestHistory.isEmpty())
        {
            System.out.println("Архив пуст.");
        }
        else
        {
            for (ClientRequest record : requestHistory)
            {
                System.out.println(record);
            }
        }
    }
}
