package com.cdc2023.springdesignpattern.factory_method.first.impl;

import com.cdc2023.springdesignpattern.factory_method.first.SocialMedia;
import com.cdc2023.springdesignpattern.factory_method.first.SocialMediaType;
import lombok.Getter;
import lombok.ToString;

@ToString
public class InstagramSocialMedia implements SocialMedia {

    @Getter
    private final String name = "Instagran";

    @Getter
    private final String url = "https://instagram.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;
}
