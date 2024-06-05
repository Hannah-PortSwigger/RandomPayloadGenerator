public class PayloadConfiguration
{
    private String characterSet;
    private int payloadLength;
    private boolean randomOrder;
    private boolean allowCharRepeats;
    private int maxNumberOfGeneratedPayloads;

    public PayloadConfiguration()
    {
        characterSet = "";
        payloadLength = 0;
        randomOrder = false;
        allowCharRepeats = false;
        maxNumberOfGeneratedPayloads = 0;
    }

    public String getCharacterSet()
    {
        return characterSet;
    }

    public void setCharacterSet(String characterSet)
    {
        this.characterSet = characterSet;
    }

    public int getPayloadLength()
    {
        return payloadLength;
    }

    public void setPayloadLength(int payloadLength)
    {
        this.payloadLength = payloadLength;
    }

    public boolean isRandomOrder()
    {
        return randomOrder;
    }

    public void setRandomOrder(boolean randomOrder)
    {
        this.randomOrder = randomOrder;
    }

    public boolean isAllowCharRepeats()
    {
        return allowCharRepeats;
    }

    public void setAllowCharRepeats(boolean allowCharRepeats)
    {
        this.allowCharRepeats = allowCharRepeats;
    }

    public int getMaxNumberOfGeneratedPayloads()
    {
        return maxNumberOfGeneratedPayloads;
    }

    public void setMaxNumberOfGeneratedPayloads(int maxNumberOfGeneratedPayloads)
    {
        this.maxNumberOfGeneratedPayloads = maxNumberOfGeneratedPayloads;
    }
}
