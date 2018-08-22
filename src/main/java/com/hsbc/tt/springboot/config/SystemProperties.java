package com.hsbc.tt.springboot.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Damon Chen
 * @date 2018/8/19
 */
@Data
@Configuration
public class SystemProperties {

    private List<String> supportedIcons = new ArrayList<>(16);

    private File uploadFileBaseDir;

    public SystemProperties(){
        uploadFileBaseDir = new File(System.getProperty("user.dir"),"uploads");
        if (!uploadFileBaseDir.exists()){
            uploadFileBaseDir.mkdir();
        }
        supportedIcons.add("xml");
        supportedIcons.add("pdf");
        supportedIcons.add("java");
        supportedIcons.add("class");
        supportedIcons.add("pom");
        supportedIcons.add("png");
        supportedIcons.add("zip");
        supportedIcons.add("tar");
    }

}
