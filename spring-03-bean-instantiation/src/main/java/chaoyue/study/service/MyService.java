package chaoyue.study.service;

public class MyService {
    private static final MyService service = new MyService();

    private MyService() {
    }

    public static MyService getService() {
        return service;
    }
}
