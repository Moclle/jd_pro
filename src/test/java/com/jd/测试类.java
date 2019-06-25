package com.jd;

import com.jd.Module.SearchListCommonModule.service.impl.SearchListCommonServiceImpl;
import org.apache.solr.client.solrj.SolrClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class 测试类 {


    @Autowired
    private SolrClient SolrClient;

    @Autowired
    SearchListCommonServiceImpl SearchListCommonServiceImpl;

//    @Autowired
//    ServiceLocator ServiceLocator;

    @Test
    public void 测试() {
//        Map<String, mapper类顶层注入接口> map = ServiceLocator.getMap();
//        Set<String> strings = map.keySet();
//        ImmutableSet<String> set1 = ImmutableSet.copyOf(strings);
//        Set<String> collect = set1.stream()
//                .limit(set1.size() - 1)
//                .collect(Collectors.toSet());

    }

    @Test
    public void haha() {
        List all = SearchListCommonServiceImpl.getAll(1, "BigBangongMapper");
        System.out.println(all);
    }

    @Test
    public void 测试solr() {
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
    }


}
