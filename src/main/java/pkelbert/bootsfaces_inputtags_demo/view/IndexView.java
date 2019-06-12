package pkelbert.bootsfaces_inputtags_demo.view;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexView implements Serializable {

	private final static String TYPEAHEAD_VALUES = "Arch Enemy,Blind Guardian,Children of Bodom,Dimmu Borgir,Edge of Sanity,Fields of the Nephilim,Gates of Ishtar,Holy Moses,Iced Earth,Jethro Tull,Kreator,Lamb of God,Mekong Delta,Night in Gales,Old Dead Tree,Persefone,Running Wild,Skyclad,The Dillinger Escape Plan,Theater of Tragedy,Unleashed,Vanden Plas,Within Temptation,Xystus,Yes,Zenobia";

    private String basic = "Basic 1,Basic 2,Basic 3";

    private String simpleTypeahead = "";

    private String typeaheadTags = "Typeahead Tag 1,Typeahead Tag 2,Typeahead Tag 3";

    public String getTypeaheadValues() {
    	return TYPEAHEAD_VALUES;
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getSimpleTypeahead() {
    	return simpleTypeahead;
    }

    public void setSimpleTypeahead(String simpleTypeahead) {
    	this.simpleTypeahead = simpleTypeahead;
    }

    public String getTypeaheadTags() {
    	return typeaheadTags;
    }

    public void setTypeaheadTags(String typeaheadTags) {
    	this.typeaheadTags = typeaheadTags;
    }
}
