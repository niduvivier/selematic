public class ElementSearch {
    private String selector;
    private SelectorType selectorType;

    public ElementSearch(String selector){
        this.selector = selector;
        String temp = selector.substring(0,1);
        /*selectorType = switch(temp){
            case "#" -> SelectorType.ID;
        }*/
        switch (temp){
            case "#": this.selectorType = SelectorType.ID; break;
            case ".": this.selectorType = SelectorType.CLASSNAME; break;
            case "/": this.selectorType = SelectorType.XPATH; break;
            case "?": this.selectorType = SelectorType.CSSSELECTOR; break;
            default: this.selectorType = SelectorType.TEXT; break;
        }
    }
}
