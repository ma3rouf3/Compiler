package Java.AST.QueryStmt;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.stringtemplate.v4.ST;

public class Column_Def extends Statement {

       String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
