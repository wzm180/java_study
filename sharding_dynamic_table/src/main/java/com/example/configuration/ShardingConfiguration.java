package com.example.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ShardingConfiguration {

//    @Bean("shardingDatasource")
//    public DataSource shardingDatasource(){
//        // 创建注册中心配置，type=zookeeper表示使用zookeeper做用注册和配置中心；
//        RegistryCenterConfiguration regConfig =new RegistryCenterConfiguration("zookeeper");
//        regConfig.setServerLists("zookeeper_ip:2181,zookeeper_ip:2182,zookeeper_ip:2183");
//        // sharding-sphere-orchestration：zookeeper根节点名称，可随意改；
//        regConfig.setNamespace("sharding-sphere-orchestration");
//        regConfig.setOperationTimeoutMilliseconds(50000);
//        // 配置治理，orchestration-sharding-data-source：固定；
//        // 配置数据治理
//        OrchestrationConfiguration orchConfig =
//                new OrchestrationConfiguration("orchestration-sharding-data-source", regConfig, false);
//
//        // 获取数据源对象
//        DataSource dataSource = OrchestrationShardingDataSourceFactory
//                .createDataSource(dataSourceMap, shardingRuleConfig, new ConcurrentHashMap(), new Properties(), orchConfig);
//        return dataSource;
//    }
}
