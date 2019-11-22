package com.briup.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.briup.cms.web"))
                .paths(PathSelectors.any()) .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("丫头")
                .description("重要的是我会爱你的 因为我害怕寂寞 \n" +
                        "你在我眼前晃来晃去的 我变的恍惚了 \n" +
                        "感觉这就该是我最终的幸福生活 \n" +
                        "其实你真得是挺闹的 在我耳边大呼小叫 \n" +
                        "可你又是我掌中的宝 我心上的骄傲 \n" +
                        "是我灰心的时候带给我希望的药 \n" +
                        "你有那么长的睫毛 眨一眨眼泪就往下掉 \n" +
                        "我的心开始如刀绞 每一次我都罪责难逃 \n" +
                        "我这乖乖的坏坏的丫头 是我心上甜蜜的伤口 \n" +
                        "你是对的 你是错的 反正规矩都是你定的 \n" +
                        "我那不胖也不瘦的丫头 总拼命找减肥的理由 \n" +
                        "这种日子很有奔头 只是你变成什么样子我们都会相守 \n" +
                        "你有那么长的睫毛 眨一眨眼泪就往下掉 \n" +
                        "我的心开始如刀绞 每一次我都罪责难逃 \n" +
                        "我这乖乖的坏坏的丫头 是我心上甜蜜的伤口 \n" +
                        "你是对的 你是错的 反正规矩都是你定的 \n" +
                        "我那不胖也不瘦的丫头 总拼命找减肥的理由 \n" +
                        "这种日子很有奔头 只是你变成什么样子我们都会相守 \n" +
                        "我这乖乖的坏坏的丫头 是我心上甜蜜的伤口 \n" +
                        "你是对的 你是错的 反正规矩都是你定的 \n" +
                        "我那不胖也不瘦的丫头 总拼命找减肥的理由 \n" +
                        "这种日子很有奔头 只是你变成什么样子我们都会相守 \n" +
                        "重要的是我会爱你的 因为我害怕寂寞 \n" +
                        "你在我眼前晃来晃去的 我变的恍惚了 \n" +
                        "感觉这就该是我最终的幸福生活 ")
                .termsOfServiceUrl("http://www.briup.com")
                .version("1.0") .build();
    }
}
