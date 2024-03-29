package com.dong;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Genaratebean
{


    // 执行main方法以生成代码 
    public static void main(String[] args)
    {
        List<String> warnings = new ArrayList<String>();
        try {
            // true:生成的文件覆盖之前的
            boolean overwrite = true;
            // 读取配置,构造 Configuration 对象.  
            // 如果不想使用配置文件的话,也可以直接来 new Configuration(),然后给相应属性赋值.
            File configFile = new File("D:\\eclipseworkspace\\mybatisGenerator\\src\\main\\resource\\generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        
        for (String warning : warnings){
            System.out.println(warning);
        }
    }

}
