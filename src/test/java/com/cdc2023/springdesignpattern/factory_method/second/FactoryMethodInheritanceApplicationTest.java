package com.cdc2023.springdesignpattern.factory_method.second;

import com.cdc2023.springdesignpattern.factory_method.first.SocialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryMethodInheritanceApplication.class)
class FactoryMethodInheritanceApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryInheritance() {
        SocialMedia socialMediaFacebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);
        SocialMedia socialMediaInstagram = applicationContext.getBean("socialMediaInstagram", SocialMedia.class);
        SocialMedia socialMediaTwitter = applicationContext.getBean("socialMediaTwitter", SocialMedia.class);

        System.out.println(socialMediaFacebook);
        System.out.println(socialMediaInstagram);
        System.out.println(socialMediaTwitter);
    }
}