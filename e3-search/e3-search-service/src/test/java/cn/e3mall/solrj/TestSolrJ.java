//package cn.e3mall.solrj;
//
//import org.apache.solr.client.solrj.SolrServer;
//import org.apache.solr.client.solrj.impl.HttpSolrServer;
//import org.apache.solr.common.SolrInputDocument;
//import org.junit.Test;
//
//public class TestSolrJ {
//	
//	@Test
//	public void addDocument() throws Exception {
//		SolrServer solrServer = new HttpSolrServer("http://127.0.0.1:7080/solr/collection1");
//		SolrInputDocument doc = new SolrInputDocument();
//		doc.addField("id", "doc01");
//		doc.addField("item_title", "测试商品01");
//		doc.addField("item_price", 1000);
//		solrServer.add(doc);
//		solrServer.commit();
//	}
//	
//	@Test
//	public void deleteDocument() throws Exception {
//		SolrServer solrServer = new HttpSolrServer("http://127.0.0.1:7080/solr/collection1");
//		//删除文档
//		//solrServer.deleteById("doc01");
//		solrServer.deleteByQuery("id:doc01");
//		//提交
//		solrServer.commit();
//	}
//}
