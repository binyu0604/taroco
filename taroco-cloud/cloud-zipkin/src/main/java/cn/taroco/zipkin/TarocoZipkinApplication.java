package cn.taroco.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * 服务监控
 *
 * @author liuht
 * @date 2017/11/28 11:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class TarocoZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(TarocoZipkinApplication.class, args);
    }
////
////    @Bean
////    public MySQLStorage mySQLStorage(DataSource datasource) {
////        return MySQLStorage.builder().datasource(datasource).executor(Runnable::run).build();
////    }

//    static {
//        // Make sure java.util.logging goes to log4j2
//        // https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html#howto-configure-log4j-for-logging
//        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
//    }
//
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(ZipkinServer.class)
//                .listeners(new RegisterZipkinHealthIndicators())
//                .properties("spring.config.name=zipkin-server").run(args);
//    }
}
