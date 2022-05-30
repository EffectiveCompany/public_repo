import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import de.effectivecompany.dao.doc.IDaoV_search_doc_key;
import de.effectivecompany.dao.doc.V_search_doc_keySql;
import groovy.transform.CompileStatic

@CompileStatic
public class Ok {
	IDaoV_search_doc_key daoV_search_doc_key;
	
	public void works() {
		daoV_search_doc_key.selBy(s-> s.where(V_search_doc_keySql.ISDELETED, isEqualTo(0)))
	}
}
