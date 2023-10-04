package com.cdc2023.springdesignpattern.factory_method.first;

import com.cdc2023.springdesignpattern.factory_method.first.impl.FacebookSocialMedia;
import com.cdc2023.springdesignpattern.factory_method.first.impl.InstagramSocialMedia;
import com.cdc2023.springdesignpattern.factory_method.first.impl.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodBeanApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType type) {
        if(type == SocialMediaType.TWITTER) {
            return new TwitterSocialMedia();
        } else if (type == SocialMediaType.FACEBOOK) {
            return new FacebookSocialMedia();
        } else if (type == SocialMediaType.INSTAGRAM) {
            return new InstagramSocialMedia();
        } else {
            throw new IllegalArgumentException("Unsupported Social Media Type");
        }
    }
}
