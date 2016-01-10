package com.riversoft.weixin.mp.care;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by exizhai on 11/25/2015.
 */
public class CareMessagesTest {

    @Test
    public void testText(){
//        CareMessages.defaultCareMessages().text("o7Tmfs6Bx0Tw6en7idZabXGG9Di8", "使用客服接口发送出来的文本消息.");
//        CareMessages.defaultCareMessages().text("o7Tmfs44TFi4ewTa-J_0BAeUyrw4", "使用客服接口发送出来的文本消息.");
          CareMessages.defaultCareMessages().text("oELhlt7Q-lRmLbRsPsaKeVX6pqjg", "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxd1a32e23ee80bf7a&redirect_uri=http%3A%2F%2Fwxtest.gzriver.com%2FoS-I8EwVL9X.view&response_type=code&scope=snsapi_userinfo#wechat_redirect");
//        CareMessages.defaultCareMessages().text("o7Tmfs8y4gBrwzX_YXKAuL7TFrsQ", "使用客服接口发送出来的文本消息.");
//        CareMessages.defaultCareMessages().text("o7Tmfs2uEnDbaJ_rs2OejuWZPH2M", "使用客服接口发送出来的文本消息.");
//        CareMessages.defaultCareMessages().text("o7Tmfs6gPvhH9FXtFz8JR2jfeL0g", "使用客服接口发送出来的文本消息.");
//        CareMessages.defaultCareMessages().text("o7Tmfs0CkrVdq7og3sKWmot55iS8", "使用客服接口发送出来的文本消息.");
//        CareMessages.defaultCareMessages().text("o7Tmfs7pE8QMVDj9jF--Y74wjUpE", "使用客服接口发送出来的文本消息.");
//        CareMessages.defaultCareMessages().text("o7Tmfs96UDesd920Gzi0jYJPnBzQ", "使用客服接口发送出来的文本消息.");
    }

    @Test
    public void testCard(){
        //o7Tmfs96UDesd920Gzi0jYJPnBzQ

        List<String> users = new ArrayList<>();
        users.add("o7Tmfs5ezesAcMR-Uu1HrFTm0VPM");
        users.add("o7Tmfs6Bx0Tw6en7idZabXGG9Di8");
        users.add("o7Tmfs3EHCndVenva5knKxA4D3XA");
        users.add("o7Tmfs8y4gBrwzX_YXKAuL7TFrsQ");
        users.add("o7Tmfs2uEnDbaJ_rs2OejuWZPH2M");
        users.add("o7Tmfs6gPvhH9FXtFz8JR2jfeL0g");
        users.add("o7Tmfs0CkrVdq7og3sKWmot55iS8");
        users.add("o7Tmfs7pE8QMVDj9jF--Y74wjUpE");
        users.add("o7Tmfs96UDesd920Gzi0jYJPnBzQ");

        for (String user: users) {
            try {
                CareMessages.defaultCareMessages().card(user, "p7Tmfs2kxdGp2YN7LX2BMzEYCI2Q");
            } catch (Exception e) {
                System.out.println(user + ": p7Tmfs2kxdGp2YN7LX2BMzEYCI2Q: failed.");
                e.printStackTrace();
            }
            try {
                CareMessages.defaultCareMessages().card(user, "p7Tmfs0e7WUNurXRrEnaagja7SQs");
            } catch (Exception e) {
                System.out.println(user + ": p7Tmfs2kxdGp2YN7LX2BMzEYCI2Q: failed.");
            }
        }

    }
}
