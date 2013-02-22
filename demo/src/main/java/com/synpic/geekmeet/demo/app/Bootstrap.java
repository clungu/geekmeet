package com.synpic.geekmeet.demo.app;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class Bootstrap {

    public static void main(String[] args) throws Exception {
        final MyApplication application= null;
        application.start();

        //simulate usage
        application.buy("Pork");
        application.buy("Steak");
        application.sell("Pork");
        application.sell("Steak");

        Runtime.getRuntime().addShutdownHook(
                new Thread() {
                    @Override
                    public void run() {
                        System.out.println("Shutting down application!");
                        application.stop();
                    }
                }
        );
    }
}
