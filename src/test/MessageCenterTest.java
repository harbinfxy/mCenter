package test;

import main.messagecenter.MessageCenter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fanxingyu on 2019/8/5.
 */
public class MessageCenterTest {
    private  MessageCenter messageCenter = MessageCenter.getInstance();

    @Test
    public void testGetInstance() {
        Assert.assertEquals(messageCenter, MessageCenter.getInstance());
    }
}
