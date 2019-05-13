package com.config.rhwayfun.springboot.dubbo.provider;

import com.config.rhwayfun.springboot.dubbo.api.DemoProvider;
import org.springframework.stereotype.Component;

/**
 * @author rhwayfun
 * @since 0.0.1
 */
@Component
public class DemoProviderImpl implements DemoProvider {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
