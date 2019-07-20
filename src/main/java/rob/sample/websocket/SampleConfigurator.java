package rob.sample.websocket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

public class SampleConfigurator extends ServerEndpointConfig.Configurator {

    private static final Logger logger = LogManager.getLogger("SampleConfigurator");

    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        logger.info("modifyHandshake!");
    }
}
