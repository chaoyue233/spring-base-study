package chaoyue.study.factory;

import chaoyue.study.service.MyService;

public class ServiceFactory {
    public MyService getMyService() {
        return MyService.getService();
    }
}
