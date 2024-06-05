import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.intruder.*;

import javax.swing.*;

@SuppressWarnings("unused")
public class Extension implements BurpExtension
{
    static final String EXTENSION_NAME = "Random Payload Generator";

    @Override
    public void initialize(MontoyaApi montoyaApi)
    {
        montoyaApi.extension().setName(EXTENSION_NAME);

        PayloadConfiguration payloadConfiguration = new PayloadConfiguration();

        JPanel panel = new ExtensionPanel(payloadConfiguration);

        montoyaApi.userInterface().registerSuiteTab(EXTENSION_NAME, panel);

        montoyaApi.intruder().registerPayloadGeneratorProvider(new PayloadGeneratorProvider()
        {
            @Override
            public String displayName()
            {
                return EXTENSION_NAME;
            }

            @Override
            public PayloadGenerator providePayloadGenerator(AttackConfiguration attackConfiguration)
            {
                return new ExtensionPayloadGenerator(payloadConfiguration);
            }
        });
    }
}
