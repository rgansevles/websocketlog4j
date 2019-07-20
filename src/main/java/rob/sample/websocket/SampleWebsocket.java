package rob.sample.websocket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/websocket", configurator = SampleConfigurator.class)
public class SampleWebsocket {

    private static final Logger logger = LogManager.getLogger("SampleWebsocket");

    @OnOpen
    public void start(Session newSession) throws Exception {
        logger.info("Websocket opened!");
    }

}


