package com.baomidou.mybatisplus.generator.samples;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.PostgreSqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.PostgreSqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.keywords.PostgreSqlKeyWordsHandler;
import org.junit.jupiter.api.Test;

/**
 * PostgreSQL 代码生成
 *
 * @author lanjerry
 * @since 3.5.3
 */
public class PostgreSQLGeneratorTest extends BaseGeneratorTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
        .Builder("jdbc:postgresql://192.168.8.55:9432/hsa_dev", "postgres", "123!Feiwei")
        .dbQuery(new PostgreSqlQuery())
        .keyWordsHandler(new PostgreSqlKeyWordsHandler())
        .schema("public")
        .typeConvert(new PostgreSqlTypeConvert())
        .build();

    @Test
    public void testSimple() {
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
        generator.strategy(new StrategyConfig.Builder()
//            .addInclude("ndy_model_form,ndy_model")//添加表名
            .addInclude("hsa_reservation_settings")
            .addTablePrefix("hsa_")//过滤字段名前缀
            .entityBuilder().enableLombok().enableChainModel().enableFileOverride()
            .controllerBuilder().enableRestStyle().enableFileOverride()
            .serviceBuilder().enableFileOverride()
            .mapperBuilder().enableBaseResultMap().enableBaseColumnList().enableFileOverride()
            .build());
        generator.global(new GlobalConfig.Builder()
            .author("zjh")//作者
            .outputDir( "C:\\Users\\曾佳辉\\Desktop")//文件存储路径
            .dateType(DateType.TIME_PACK)
            .commentDate("yyyy-MM-dd")
            .enableSwagger()
            .build());
        generator.packageInfo(new PackageConfig.Builder()
            .parent("com.fw") // 设置父包名
            .moduleName("hsa")// 设置父包模块名
            .entity("model.entity")
            .build());
        generator.template(new TemplateConfig.Builder()
            .entity("/templates2/entity.java")
            .service("/templates2/service.java")
            .serviceImpl("/templates2/serviceImpl.java")
            .mapper("/templates2/mapper.java")
            .xml("/templates2/mapper.xml")
            .controller("/templates2/controller.java")
            .build());
        generator.execute();
    }
}
