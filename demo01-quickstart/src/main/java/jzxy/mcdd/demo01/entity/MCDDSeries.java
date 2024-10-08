package jzxy.mcdd.demo01.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * MCDD 系列实体类
 *
 * @version 1.0.0
 * @author: mcdd
 * @date: 2024/9/6 20:10
 */
@Data
@Component
@ConfigurationProperties("mcdd")
public class MCDDSeries {
    /**
     * id
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 评论
     */
    private List<String> comments;
    /**
     * 内容
     */
    private Map<Integer,MCDD> mcdds;
}
