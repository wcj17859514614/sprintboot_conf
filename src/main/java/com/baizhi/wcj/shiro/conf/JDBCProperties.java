package com.baizhi.wcj.shiro.conf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "mysql")
public class JDBCProperties {
    private String driver;
    private String url;
    private String username;
    private String password;

}
