import burp.api.montoya.intruder.GeneratedPayload;
import burp.api.montoya.intruder.IntruderInsertionPoint;
import burp.api.montoya.intruder.PayloadGenerator;

import java.util.ArrayList;
import java.util.List;

import static burp.api.montoya.intruder.GeneratedPayload.end;
import static burp.api.montoya.intruder.GeneratedPayload.payload;

public class ExtensionPayloadGenerator implements PayloadGenerator
{
    private final List<String> payloadList;
    private int payloadIndex;

    public ExtensionPayloadGenerator(PayloadConfiguration payloadConfiguration)
    {
        payloadList = generatePayloadList(payloadConfiguration);
    }

    @Override
    public GeneratedPayload generatePayloadFor(IntruderInsertionPoint intruderInsertionPoint)
    {
        if (payloadIndex == payloadList.size())
        {
            return end();
        }

        String payload = payloadList.get(payloadIndex);
        payloadIndex++;

        return payload(payload);
    }

    private List<String> generatePayloadList(PayloadConfiguration payloadConfiguration)
    {
        String characterSet = payloadConfiguration.getCharacterSet();
        int payloadLength = payloadConfiguration.getPayloadLength();
        boolean randomOrder = payloadConfiguration.isRandomOrder();
        boolean allowCharRepeats = payloadConfiguration.isAllowCharRepeats();
        int maxNumberOfGeneratedPayloads = payloadConfiguration.getMaxNumberOfGeneratedPayloads();

        List<String> fullPayloadList = new ArrayList<>();

        //TODO implement logic based off of configured fields to add payloads to the list

        return fullPayloadList;
    }
}
