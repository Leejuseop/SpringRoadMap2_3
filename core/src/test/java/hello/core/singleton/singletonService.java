package hello.core.singleton;

public class singletonService {

    private static final singletonService instance = new singletonService();

    private singletonService(){
    }

    public static singletonService getInstance(){
        return instance;
    }


}
