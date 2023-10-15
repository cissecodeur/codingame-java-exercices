public class ParamEqualsFoo {

    /*  A.isFoo(String param) devrait retourner true si param est égal à la chaine "foo" , sinon elle devrait retourner false .
    Implémentez A.isFoo(String param)

   */
    public boolean A (String param){
        return param != null && param.equalsIgnoreCase("foo");
    }


}
