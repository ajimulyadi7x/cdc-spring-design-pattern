package com.cdc2023.springdesignpattern.factory_method.second;

import com.cdc2023.springdesignpattern.factory_method.first.SocialMedia;
import com.cdc2023.springdesignpattern.factory_method.first.impl.FacebookSocialMedia;
import com.cdc2023.springdesignpattern.factory_method.first.impl.InstagramSocialMedia;
import com.cdc2023.springdesignpattern.factory_method.first.impl.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return new FacebookSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram() {
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter() {
        return new TwitterSocialMedia();
    }
}
