package de.karadag.assetdesk;

import org.springframework.boot.SpringApplication;

public class TestAssetdeskApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(AssetdeskApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
