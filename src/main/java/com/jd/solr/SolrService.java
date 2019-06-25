//package com.jd.solr;
//
//import org.apache.solr.client.solrj.SolrQuery;
//import org.apache.solr.client.solrj.response.QueryResponse;
//import org.apache.solr.common.SolrDocumentList;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class SolrService<T> {
//    private String solrUrl = "http://localhost:8983/solr/";  //solr系统地址：
//
//    private String solrCore = "moclle"; //solr的core名称
//
//    /**
//     *
//     * @Title:        querySolr
//     * @Description:  TODO
//     * @param:        @param solrQuery
//     * @param:        @param type 用于接收数据的对象
//     * @param:        @return
//     * @return:       List
//     * @throws
//     * @Date          2018年2月3日 下午8:05:12
//     */
//    public <T> List querySolr(SolrQuery solrQuery, Class<T> type){
//        try {
//            StringBuffer
//            HttpSolrServer solrServer = new HttpSolrServer(urlString);
//            QueryResponse queryResponse = solrServer.query(solrQuery);
//            SolrDocumentList solrDocumentList = queryResponse.getResults();
//            List<T> list = queryResponse.getBeans(type);
//            return list;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//
//    }

//}
